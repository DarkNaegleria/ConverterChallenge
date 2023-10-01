package panel.main;

import javax.swing.JOptionPane;
/** This Class show and return the conversion options set through JOptionPane
 * @author Frvm96
 */
public class ConversionSelector {

	// Conversion options set
	private Object[] conversionOptions = { "Conversor de Moneda", "Conversor de Temperatura" };
	private String programSelected;

	public ConversionSelector() {
		// Creates dialog box to choose the conversion
		programSelected = (String) JOptionPane.showInputDialog(null, "¿Qué desea usar hoy?", "Programa Conversor",
				JOptionPane.QUESTION_MESSAGE, null, conversionOptions, conversionOptions[0]);
	}

	// Returns the selected option
	public String getProgramSelected() {
		return programSelected;
	}
}
