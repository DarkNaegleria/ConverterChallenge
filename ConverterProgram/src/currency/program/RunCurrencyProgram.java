package currency.program;

import panel.main.ContinueDialog;
import panel.main.ResultFormatter;
import panel.main.ContinueHandler;

/**
 * This is a controller class.
 * It contains the flow of execution process.
 * The result of the conversion is calculated in this class.  
 * @author Frvm96
 *
 */
public class RunCurrencyProgram {
	
	@SuppressWarnings("unused")
	public RunCurrencyProgram () {
		CurrencyInputValidator currencyInputValidator = new CurrencyInputValidator();
		double input = currencyInputValidator.getInputDoubled();
		CurrencyConversionPanel currencyConversionPanel = new CurrencyConversionPanel();
		CurrencyConvertionRates currencyConvertionRates = new CurrencyConvertionRates();
		FinalCoin finalCoin = new FinalCoin(currencyConversionPanel.getSelectedConversion());
		double ratio = currencyConvertionRates.getConversionRate(currencyConversionPanel.getSelectedConversion());
		double result = (input * ratio);
		ResultFormatter resultFormatter = new ResultFormatter(result);
		CurrencyResultPanel currencyResultPanel = new CurrencyResultPanel(resultFormatter.getFormattedOutput(), finalCoin.getFinalCoin());
		ContinueDialog continueDialog = new ContinueDialog();
		ContinueHandler continueHandler = new ContinueHandler(continueDialog.getToContinue());
		
	}

}
