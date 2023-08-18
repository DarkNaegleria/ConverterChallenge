package currency.program;

/**
 * This class generate the final currency.
 * This value is stored in finalCoin variable as string type.
 * @author Frvm96
 *
 */
public class FinalCoin {
	
	private String finalCoin;
	
	public FinalCoin (String selectedConversion) {
		finalCoin = selectedConversion.substring (selectedConversion.lastIndexOf(" a ") + 3, selectedConversion.length() ); 
	}

	public String getFinalCoin() {
		return finalCoin;
	}

}
