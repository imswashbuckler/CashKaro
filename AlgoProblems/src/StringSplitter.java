import java.util.ArrayList;
import java.util.List;

class StringSplitter {

	private List<Separator> delimitterList = new ArrayList<Separator>();
	
	public StringSplitter(Separator...separators){
		for(Separator sep: separators){
			delimitterList.add(sep);
		}
		
	}
  

  /**
   * Splits the given string based on the separator(s) given at
   * in the constructor.
   * @param string String to be split
   * @return Resulting list of substrings.
   */
  public List<String> split(String string) {
    // TODO: Code goes here
	  List<String> subStringsList = new ArrayList<String>();
	  if(string== null || string.equals(""))
		  return subStringsList;
	  int prevDelimiterPos = 0;
	  for(int i = 0; i< string.length(); i++){
		  for(Separator delimiter: delimitterList){
			  if(string.charAt(i) == delimiter.getValue() ){
				  if(i==0){
					  prevDelimiterPos++;
				  } else{
				  String temp = string.substring(prevDelimiterPos, i);
				  subStringsList.add(temp);
				  prevDelimiterPos=i+1;
				  }
			  }
		  }
	  }
	  if(prevDelimiterPos != string.length()){
		  subStringsList.add(string.substring(prevDelimiterPos,string.length() ));
	  }
	  return subStringsList;
  }

  public static void main(String[] args) {
	    // Simple splitter with one parameter
	    // This should result in {“tmp”, “file.txt”)
	    StringSplitter s1 = new StringSplitter(Separator.FORWARD_SLASH);
	    List<String> split1 = s1.split("/tmp/file.txt");
	    
	    System.out.println("NKJ1: "+ split1.toString());

	    // Complex splitter with two parameters
	    // This should result in {“tmp”, “file”, “txt”)
	    StringSplitter s2 = new StringSplitter(Separator.FORWARD_SLASH,
	                                           Separator.PERIOD);
	    List<String> split2 = s2.split("/tmp/file.txt");
	    
	    System.out.println("NKJ2: "+ split2.toString());
	  }

}

enum Separator {
	  // TODO: Code goes here
		FORWARD_SLASH('/'),
	    PERIOD('.');
	    
	    
	    private final char seprator;

	    Separator(char seprator) {
	        this.seprator = seprator;
	    }
	    
	    public char getValue(){
	    	return seprator;
	    }


	}
