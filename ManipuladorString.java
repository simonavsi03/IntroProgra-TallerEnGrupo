package metodosofunciones;

import javax.swing.JOptionPane;

public class ManipuladorString {

	public static void main(String[] args) {
		String palabra = JOptionPane.showInputDialog("pon una palabra");
		String np = palabra;
		
		cambiamayus(palabra);
		
		cambiaminus(palabra);
		
		contador(np);
		

	}
	
	public static void cambiamayus(String palabra) {
		String a = palabra.toUpperCase();
		JOptionPane.showMessageDialog(null, "la palabra en mayuscula es: " +a);
	}

	public static void cambiaminus(String palabra) {
		String b = palabra.toLowerCase();
		JOptionPane.showMessageDialog(null, "la palabra en minuscula es: "+ b);
	}
	
	public static void contador(String np) {
		JOptionPane.showMessageDialog(null, "la palabra tiene: " + np.length() + " cantidad de letras");
	}
}
