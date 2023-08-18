package panel.main;
import java.text.DecimalFormat;

/**
 * Format the conversion result generated in Currency and Temperature 
 * Programs.
 * The resulting format considers only two digits to the right of the
 * decimal point.
 * The formatted result is stored as string type.
 * @author Frvm96
 *
 */
public class ResultFormatter {
	
	private String formattedOutput;
	
	public ResultFormatter (double result) {
		DecimalFormat resultFormat = new DecimalFormat("#.00"); 
		formattedOutput = resultFormat.format(result); 
	}

	public String getFormattedOutput() {
		return formattedOutput;
	}

}
