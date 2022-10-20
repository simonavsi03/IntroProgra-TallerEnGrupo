package trabajo_en_clase_18_oct;
import javax.swing.JOptionPane;

public class PuntoMonedas {
	public static void main(String [] args) {
		int op_moneda = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la moneda que tienes:"
	+"\n" + "1. Dolar"
	+"\n" + "2. Euro"
	+"\n" + "3. Libra"
	+"\n" + "4. Peso Mexicano")); 
		
		double d = Integer.parseInt(JOptionPane.showInputDialog("Ahora ingresa la cantidad de dinero en la dicha denominación:"));
		
		if (op_moneda==1) {
			Dolar(d);
		}

		if (op_moneda==2) {
			Euro(d);
		}

		if (op_moneda==3) {
			Libra(d);
		}

		if (op_moneda==4) {
			Mex(d);
		}
	}
	public static void Dolar(double d) {
		double  eu = 0;
		eu = d*1.01;
		
		double  lib = 0;
		lib = d*0.88;
		
		double  mex = 0;
		mex = d*20.03;
		
		JOptionPane.showMessageDialog(null, "$"+d+" Dolares convertidos a Euros son: $"+eu);
		JOptionPane.showMessageDialog(null, "$"+d+" Dolares convertidos a Libras son: $"+lib);
		JOptionPane.showMessageDialog(null, "$"+d+" Dolares convertidos a Pesos Mexicanos son: $"+mex);
	}
	public static void Euro(double d) {
		double  dol = 0;
		dol = d*0.99;
		
		double  lib = 0;
		lib = d*0.87;
		
		double  mex = 0;
		mex = d*19.74;
		
		JOptionPane.showMessageDialog(null, "$"+d+" Euros convertidos a Dolares son: $"+dol);
		JOptionPane.showMessageDialog(null, "$"+d+" Euros convertidos a Libras son: $"+lib);
		JOptionPane.showMessageDialog(null, "$"+d+" Euros convertidos a Pesos Mexicanos son: $"+mex);
		
	}
	public static void Libra(double d) {
		double  dol = 0;
		dol = d*1.13;
		
		double  eu = 0;
		eu = d*1.15;
		
		double  mex = 0;
		mex = d*22.70;
		
		JOptionPane.showMessageDialog(null, "$"+d+" Libras convertidos a Dolares son: $"+dol);
		JOptionPane.showMessageDialog(null, "$"+d+" Libras convertidos a Euros son: $"+eu);
		JOptionPane.showMessageDialog(null, "$"+d+" Libras convertidos a Pesos Mexicanos son: $"+mex);
	}
	public static void Mex(double d) {
		double  dol = 0;
		dol = d*0.050;
		
		double  eu = 0;
		eu = d*0.051;
		
		double  lib = 0;
		lib = d*0.044;
		
		JOptionPane.showMessageDialog(null, "$"+d+" Pesos Mexicanos convertidos a Dolares son: $"+dol);
		JOptionPane.showMessageDialog(null, "$"+d+" Pesos Mexicanos convertidos a Euros son: $"+eu);
		JOptionPane.showMessageDialog(null, "$"+d+" Pesos Mexicanos convertidos a Libras son: $"+lib);
	}
}
