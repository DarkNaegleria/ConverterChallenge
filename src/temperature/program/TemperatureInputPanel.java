package temperature.program;

import javax.swing.JOptionPane;

import panel.main.InputInterface;

/**This class implements InputInterface.
 * Allows the user to enter a input to convert.
 * The input is stored as string type.
 * @author Frvm96
 *
 */
public class TemperatureInputPanel implements InputInterface {

	private String temperatureInput;

	public TemperatureInputPanel() {
		temperatureInput = (String) JOptionPane.showInputDialog(null, "Ingresa el valor de temperatura que deseas convertir",
				"Input", JOptionPane.INFORMATION_MESSAGE);
	}

	public String getInput() {
		return temperatureInput;
	}

}