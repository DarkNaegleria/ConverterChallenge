package temperature.program;

/**The class contains all temperature conversion algorithms.
 * It also sets the base and final temperature unit used in the conversion.
 * @author Frvm96
 *
 */
public class SelectedTemperatureConversion {

	private String baseTemperature;
	private String finalTemperature;
	private double result;

	/**The constructor execute the conversion logic used for each case.
	 * The result is stored as a double type variable.
	 * @param selectedConversion
	 * @param inputDoubled
	 */
	public SelectedTemperatureConversion(String selectedConversion, double inputDoubled) {
		switch (selectedConversion) {
		case "De Celsius a Fahrenheit":
			result = (inputDoubled * 1.8) + 32;
			baseTemperature = "Celsius";
			finalTemperature = "Fahrenheit";
			break;
		case "De Celsius a Kelvin":
			result = inputDoubled + 273.15;
			baseTemperature = "Celsius";
			finalTemperature = "Kelvin";
			break;
		case "De Fahrenheit a Celsius":
			result = (inputDoubled - 32) / 1.8;
			baseTemperature = "Fahrenheit";
			finalTemperature = "Celsius";
			break;
		case "De Fahrenheit a Kelvin":
			result = ((inputDoubled - 32) / 1.8) + 273.15;
			baseTemperature = "Fahrenheit";
			finalTemperature = "Kelvin";
			break;
		case "De Kelvin a Celsius":
			result = inputDoubled - 273.15;
			baseTemperature = "Kelvin";
			finalTemperature = "Celsius";
			break;
		case "De Kelvin a Fahrenheit":
			result = ((inputDoubled - 273.15) + 1.8) + 32;
			baseTemperature = "Kelvin";
			finalTemperature = "Fahrenheit";
			break;
		}
	}

	public String getBaseTemperature() {
		return baseTemperature;
	}

	public String getFinalTemperature() {
		return finalTemperature;
	}

	public double getResult() {
		return result;
	}
}
