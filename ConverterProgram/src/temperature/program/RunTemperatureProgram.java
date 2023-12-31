package temperature.program;

import panel.main.ContinueDialog;
import panel.main.ResultFormatter;
import panel.main.ContinueHandler;

/**
 * This is a controller class.
 * It contains the flow of execution process.
 * @author Frvm96
 *
 */
public class RunTemperatureProgram {
	
	@SuppressWarnings("unused")
	public RunTemperatureProgram () {
		TemperatureInputValidator temperatureInputValidator = new TemperatureInputValidator();
		TemperatureConversionPanel temperatureConversionPanel = new TemperatureConversionPanel();
		SelectedTemperatureConversion selectedTemperatureConversion = new SelectedTemperatureConversion(temperatureConversionPanel.getSelectedConversion(), temperatureInputValidator.getInputDoubled());
		ResultFormatter resultFormatter = new ResultFormatter(selectedTemperatureConversion.getResult());
		TemperatureResultPanel temperatureResultPanel = new TemperatureResultPanel(temperatureInputValidator.getInputDoubled(), resultFormatter.getFormattedOutput(),selectedTemperatureConversion.getBaseTemperature(), selectedTemperatureConversion.getFinalTemperature());
		ContinueDialog continueDialog = new ContinueDialog();
		ContinueHandler continueHandler = new ContinueHandler(continueDialog.getToContinue());
	}

}
