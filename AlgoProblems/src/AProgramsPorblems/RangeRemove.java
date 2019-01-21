package AProgramsPorblems;
import java.util.Arrays;

public class RangeRemove {


		public static void main(String[] args) {

			long start = System.currentTimeMillis();
			System.out.println("start time:" + System.currentTimeMillis());
			// (2,4),(11,45) ,(12,33) ,(1,19) ,(10,20) ,(33,46)

			String[] array = new String[] { "-2,4", "11,45", "12,33", "-1,19", "1,46", "28,31",  "1,10","-1,45"};

			System.out.println("Before removing::" + Arrays.toString(array));
			remove(array, 0, array.length - 1);
			System.out.println("After removing::" + Arrays.toString(array));

			System.out.println("time to complete:" + (System.currentTimeMillis() - start) + " milis");

		}

		private static void remove(String[] array, int start, int end) {

			if (end <=start ) {
				return;
			}

			removeElem(array, start, end);
			remove(array, start + 1, end);
			// remove(array, mid + 1, end);

		}

		private static void removeElem(String[] array, int start, int end) {
			int i = 0;
			while (i <= end) {
				if (!array[start].equals("--") && !array[i].equals("--") && i!=start) {
					String elem1[] = array[start].split(",");
					String elem2[] = array[i].split(",");

					if (Integer.parseInt(elem1[0]) <= Integer.parseInt(elem2[0])
							&& Integer.parseInt(elem1[1]) >= Integer.parseInt(elem2[1])) {
						array[i] = "--";
					}else if(Integer.parseInt(elem2[0]) <= Integer.parseInt(elem1[0])
							&& Integer.parseInt(elem2[1]) >= Integer.parseInt(elem1[1])) {
						array[start] = "--";
					}
				}

				i++;
			}
		}

	}