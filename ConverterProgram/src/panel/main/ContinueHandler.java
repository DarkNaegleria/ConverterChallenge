package panel.main;

import javax.swing.JOptionPane;
/**This Class evaluate the choose option by the user about continue or not  
 * @author Frvm96
 */
public class ContinueHandler {
	public ContinueHandler (int toContinue) {
		if (toContinue == JOptionPane.YES_OPTION) {
			RunProgram.runProgram();
		} else {
			RunProgram.finishProgram();
		}
	}
}
