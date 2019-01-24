package AreadLogFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class searchinLogFileUsingNIO {

	public static void searchtextInfile(String path)
	{
		File file = new File(path);
		try {
		    int count = 0;
		    Scanner scanner = new Scanner(file);
		    while(scanner.hasNextLine()) {
		        if(scanner.nextLine().contains("ORDER_UNDER_PROCESS_COD")) {
		            count++;
		            System.out.println("Number of instances of String: " + count);
		        }
		    }
		} catch (FileNotFoundException e){
		    System.out.println(e);
		}

	}
	public static void searchtextInfile1(String path) throws IOException
	{
		  long count = Files.lines(Paths.get("D://log1.log"))
				     .filter(s -> s.contains("Exception"))
				     .count();
				  System.out.println(count);
				

	}
	
	public static void main(String[] args) throws IOException {
		//searchtextInfile("D://log1.log");
		// searchtextInfile1("D://Ram.txt");
	    String stringToSearch = "Four score and seven years ago our fathers ...";

	  //  Pattern p = Pattern.compile("[java]+");   // the pattern to search for
	   // Matcher m = p.matcher(stringToSearch);

	    Pattern p = Pattern.compile("\\java\\");

	    Matcher m = p.matcher(stringToSearch);
	        Path path = Paths.get("D://log1.log");

	        String report = searchFor("\java\", path);

	        System.out.println(report);

	    }

	    private static final int MAPSIZE = 4 * 200 ; // 4K - make this * 1024 to 4MB in a real system.

	    private static String searchFor(String grepfor, Path path) throws IOException {
	        final byte[] tosearch = grepfor.getBytes(StandardCharsets.UTF_8);
	        StringBuilder report = new StringBuilder();
	        int padding = 1; // need to scan 1 character ahead in case it is a word boundary.
	        int linecount = 0;
	        int matches = 0;
	        boolean inword = false;
	        boolean scantolineend = false;
	        try (FileChannel channel = FileChannel.open(path, StandardOpenOption.READ)) {
	            final long length = channel.size();
	            int pos = 0;
	            while (pos < length) {
	                long remaining = length - pos;
	                // int conversion is safe because of a safe MAPSIZE.. Assume a reaosnably sized tosearch.
	                int trymap = MAPSIZE + tosearch.length + padding;
	                int tomap = (int)Math.min(trymap, remaining);
	                // different limits depending on whether we are the last mapped segment.
	                int limit = trymap == tomap ? MAPSIZE : (tomap - tosearch.length);
	                MappedByteBuffer buffer = channel.map(MapMode.READ_ONLY, pos, tomap);
	                System.out.println("Mapped from " + pos + " for " + tomap);
	                pos += (trymap == tomap) ? MAPSIZE : tomap;
	                for (int i = 0; i < limit; i++) {
	                    final byte b = buffer.get(i);
	                    if (scantolineend) {
	                        if (b == '\n') {
	                            scantolineend = false;
	                            inword = false;
	                            linecount ++;
	                        }
	                    } else if (b == '\n') {
	                        linecount++;
	                        inword = false;
	                    } else if (b == '\r' || b == ' ') {
	                        inword = false;
	                    } else if (!inword) {
	                        if (wordMatch(buffer, i, tomap, tosearch)) {
	                            matches++;
	                            i += tosearch.length - 1;
	                            if (report.length() > 0) {
	                                report.append(", ");
	                            }
	                            report.append(linecount);
	                            scantolineend = true;
	                        } else {
	                            inword = true;
	                        }
	                    }
	                }
	            }
	        }
	        return "Times found at--" + matches + "\nWord found at--" + report;
	    }

	    private static boolean wordMatch(MappedByteBuffer buffer, int pos, int tomap, byte[] tosearch) {
	        //assume at valid word start.
	        for (int i = 0; i < tosearch.length; i++) {
	        	int k=buffer.get(pos + i);
	            if (tosearch[i] != buffer.get(pos + i)) {
	                return false;
	            }
	        }
	        byte nxt = (pos + tosearch.length) == tomap ? (byte)' ' : buffer.get(pos + tosearch.length); 
	        return nxt == ' ' || nxt == '\n' || nxt == '\r';
	    }
	}