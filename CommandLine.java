package conv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Contains the commands for the command line
 * @author ZSte
 *
 */
public class CommandLine {
	/**
	 * Command to enter a number, it needs 3 parameters: the number, the system in which it is
	 * written and the system in which the user wants to convert it.
	 */
	static final String CONVERT = "convert";
	/**
	 * Command to quit the programme
	 */
	static final String QUIT ="quit";
	/**
	 * Empty constructor
	 */
	CommandLine() {
		
	}
	/**
	 * Executes the entered commands
	 */
	public void executeCommands() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String cmd = null;
		String [] cmdArray;
		while (true) {
			try {
				cmd = reader.readLine();
				cmdArray = cmd.split("\\s");
				switch(cmdArray[0]) {
				case CONVERT:
					Func f = new Func();
					f.convert(Integer.parseInt(cmdArray[1]), cmdArray[2], cmdArray[3]);
					break;
				case QUIT:
					System.exit(0);
					break;
				default:
					System.out.println("The entered command could not be found\n");
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
