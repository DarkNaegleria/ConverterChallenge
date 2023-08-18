package temperature.program;

import javax.swing.JOptionPane;

/**
 * This class validate the user input.
 * Only supports numeric input, in case the input is of another type, the 
 * class may catch an exception and generate a dialog request a valid input.
 * @author Frvm96
 *
 */
public class TemperatureInputValidator {

	private double inputDoubled;
	private boolean validInput = false;

	/**
	 * The constructor generate a loop where TemperatureInputPanel class is called
	 * until the value of validInfut is true.
	 * This condition only occurs if the user enters a valid input.
	 */
	public TemperatureInputValidator() {
		while (!validInput) {
			TemperatureInputPanel temperatureInputPanel = new TemperatureInputPanel();
			try {
				inputDoubled = Double.parseDouble(temperatureInputPanel.getInput());
				validInput = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error: Ingresa una cantidad válida", "Error",
				JOptionPane.ERROR_MESSAGE);
			}
		}

	}

	public double getInputDoubled() {
		return inputDoubled;
	}

}
