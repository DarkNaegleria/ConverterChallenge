package temperature.program;

import javax.swing.JOptionPane;

/**This class shows a message JOptionPane Dialog type.
 * The message contains the user input, base temperature unit,
 * conversion result and the final temperature unit. 
 * @author Frvm96
 *
 */
public class TemperatureResultPanel {

	public TemperatureResultPanel(double temperatureInput, String string, String baseTemperature,
			String finalTemperature) {
		JOptionPane.showMessageDialog(null,
				temperatureInput + " grados " + baseTemperature + " son " + string + " grados " + finalTemperature,
				"Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
