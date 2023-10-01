package temperature.program;

import javax.swing.JOptionPane;

/**Shows a dialog panel with all allowed conversions
 * @author Frvm96
 *
 */
public class TemperatureConversionPanel {

	private Object[] temperatureOptions = { "De Celsius a Fahrenheit", 
			"De Celsius a Kelvin", 
			"De Fahrenheit a Celsius", 
			"De Fahrenheit a Kelvin",
			"De Kelvin a Celsius", 
			"De Kelvin a Fahrenheit"
			};
	private String selectedConversion;

	public TemperatureConversionPanel() {
		selectedConversion = (String) JOptionPane.showInputDialog(null, "Elija la conversión que deseas ralizar",
				"Temperaturas", JOptionPane.QUESTION_MESSAGE, null, temperatureOptions, temperatureOptions[0]);
	}

	/**This method returns the selected option.
	 * @return
	 */
	public String getSelectedConversion() {
		return selectedConversion;
	}

}
