package currency.program;

import javax.swing.JOptionPane;

/**Generate a JOptionPane dialog contains all conversions supported by program.
 * @author Frvm96
 *
 */
public class CurrencyConversionPanel {

	private Object[] coinOptions = { "De Soles a Dólares", "De Soles a Euros", "De Soles a Libras", "De Soles a Yenes",
			"De Soles a Yuanes", "De Soles a Wones", "De Dólares a Soles", "De Euros a Soles", "De Libras a Soles",
			"De Yenes a Soles", "De Yuanes a Soles", "De Wones a Soles" };
	private String selectedConversion;

	/**The constructor stored the selected option in a variable called
	 * selectedConversion.
	 * 
	 */
	public CurrencyConversionPanel() {
		selectedConversion = (String) JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir",
				"Monedas", JOptionPane.QUESTION_MESSAGE, null, coinOptions, coinOptions[0]);
	}

	/**The method return the selected conversion stored in the variable.
	 * @return
	 */
	public String getSelectedConversion() {
		return selectedConversion;
	}

}
