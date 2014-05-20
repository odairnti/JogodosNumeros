
import javax.swing.JOptionPane;

/**
 * Programa: Projeto Jogo feita em Java para adivinhar um n�mero entre 1 e 50
 * 
 * @author Odair
 * @version 1.0
 * 
 * 
 */
public class ProjJogoNumeros {

	public static void main(String[] args) throws java.io.FileNotFoundException

	{
		int tentativa1;

		double valorAleatorio = Math.random() * 50;

		double numero = Math.round(valorAleatorio);
		
		if (numero % 2 == 0){
			numero = numero +1;
		}
		
		for (int i = 0; i < 6; i++) {
			tentativa1 = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Digite um numero:"));

			if (tentativa1 == numero) {
				JOptionPane.showMessageDialog(null,
						"Parab�ns! voc� acertou na " + i + "� tentativa.");
			} else if (tentativa1 > numero) {
				JOptionPane.showMessageDialog(null, "O n�mero � menor que "
						+ tentativa1 + " escolha outro.");
			} else if (tentativa1 < numero)
				JOptionPane.showMessageDialog(null, "O n�mero � maior que "
						+ tentativa1 + " escolha outro.");
		}

		JOptionPane.showMessageDialog(null,
				"O numero correto era " + String.valueOf(numero));

	}
}