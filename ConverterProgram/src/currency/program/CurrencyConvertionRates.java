package currency.program;
import java.util.HashMap;

/**This is a key-value list containing all conversion rates used in the program.
 * This class may admit more conversion rates if necessary. 
 * @author Frvm96
 *
 */
public class CurrencyConvertionRates {

	@SuppressWarnings("serial")
	private HashMap<String, Double> currencyConvertionRate = new HashMap<String, Double>() {
		{
			put("De Soles a Dólares", 0.275);
			put("De Soles a Euros", 0.25);
			put("De Soles a Libras", 0.21);
			put("De Soles a Yenes", 39.0);
			put("De Soles a Yuanes", 1.98);
			put("De Soles a Wones", 355.5);
			put("De Dólares a Soles", 3.75);
			put("De Euros a Soles", 4.0);
			put("De Libras a Soles", 4.68);
			put("De Yen a Soles", 0.027);
			put("De Yuanes a Soles", 0.52);
			put("De Wones a Soles", 0.0028);
		}
	};


	/**The method return the required conversion ratio.
	 * @param currencyPair
	 * @return
	 */
	public double getConversionRate(String currencyPair) {
		return currencyConvertionRate.get(currencyPair);
	}

}
