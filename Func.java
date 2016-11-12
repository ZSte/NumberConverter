package conv;
/**
 * contains Functionality of the program
 * @author ZSte
 *
 */
public class Func {
	/**
	 * Empty constructor
	 */
	Func() {
		
	}
	/**
	 * Converts the {@link number} from system {@link fromSys} to system {@link toSys}
	 * @param number The number which is converted
	 * @param fromSys The System of {@link number}
	 * @param toSys The System in which number is converted
	 */
	public void convert(int number, String fromSys, String toSys) {
		String [] array = new String[24];
		int fs;
		int ts;
		for(int i = 0; i < 24; i++) {
			array[i] = "";
		}
		int n = number;
		if((fromSys.equals(toSys)) && (fromSys.equals("dec") || fromSys.equals("bin"))) {
			System.out.print(number + "\n");
		}
		
		
		else if (fromSys.equals("dec")) {
			fs = 10;
			
			if(toSys.equals("bin")) {
				ts = 2;
				int j = 0;
				while(n > 0) {
					array[j] = n % ts + "";
					j++;
					n = n/ts;
				}
				for(int i = array.length - 1; i >= 0; i--) {
					System.out.print(array[i]);
				}
				System.out.print("\n");
			}
		}
		
		else if(toSys.equals("dec")) {
			ts = 10;
			if(fromSys.equals("bin")){
				fs = 2;
			
				int result = 0;
				String tmp = number + "";
				int []numberAsArray = new int[tmp.length()];
			
				for(int i = 0; i < tmp.length(); i++) {
					numberAsArray[tmp.length() - i - 1] = tmp.charAt(i) - '0';
				}
				for (int j = 0; j < tmp.length(); j++) {
					result = (int) (result + (Math.pow(fs, j) * numberAsArray[j]));
				}
				System.out.print(result + "\n");
			}
		}
	}
}
