package currency.program;

import javax.swing.JOptionPane;

import panel.main.InputInterface;

/**
 * This class implements InputInterface.
 * Generate an input JOptionPane dialog where the user enters the input.
 * The user input's is stored as string type variable.
 * @author Frvm96
 *
 */
public class CurrencyInputPanel implements InputInterface {

	private String currencyInput;

	public CurrencyInputPanel() {
		currencyInput = (String) JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir",
				"Input", JOptionPane.INFORMATION_MESSAGE);
	}

	public String getInput() {
		return currencyInput;
	}

}