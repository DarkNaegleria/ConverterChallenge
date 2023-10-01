package currency.program;
import javax.swing.JOptionPane;

/**
 * This class shows a message JOptionPane Dialog type.
 * The message contains the conversion result and the final coin. 
 * @author Frvm96
 *
 */
public class CurrencyResultPanel {

	public CurrencyResultPanel(String amount, String coin) {
		JOptionPane.showMessageDialog(
				null, 
				"Tienes " + amount + " " + coin, 
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE
				);
	}

	
}
