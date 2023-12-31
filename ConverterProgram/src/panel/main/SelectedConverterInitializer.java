package panel.main;

import currency.program.RunCurrencyProgram;
import temperature.program.RunTemperatureProgram;

/**
 * This class starts the selected conversion program
 * It's called by the RunProgram class.
 * @author Frvm96
 *
 */
public class SelectedConverterInitializer {

	@SuppressWarnings("unused")
	public SelectedConverterInitializer(String programSelected) {
		if (programSelected != null) {
			switch (programSelected) {
			case "Conversor de Moneda":
				RunCurrencyProgram rCP = new RunCurrencyProgram();
				break;
			case "Conversor de Temperatura":
				RunTemperatureProgram rTP = new RunTemperatureProgram();
				break;
			}
		}
	}
}
