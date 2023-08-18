package panel.main;

import javax.swing.JOptionPane;

/**
 * This Class create a dialog JOptionPane asking whether or not the user
 * wants to continue with another conversion. The answer is stored in
 * toContinue variable
 * @author Frvm96
 */
public class ContinueDialog {
	
	private int toContinue;
	
	//The constructor sets the value of the variable toContinue
	public ContinueDialog () {
		toContinue = JOptionPane.showConfirmDialog(
				null, 
				"¿Deseas continuar con otra conversión?", 
				"Continuar",
				JOptionPane.YES_NO_OPTION
				);
	}

	//Returns the value of variable
	public int getToContinue() {
		return toContinue;
	}

}
