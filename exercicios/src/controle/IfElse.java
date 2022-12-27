package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		// caixa de dialogo
		String valor = JOptionPane.showInputDialog("Informe o número:");
		
		// passei string para inteiro 
		int numero = Integer.parseInt(valor);
		
		//fiz a logica
		if (numero % 2 == 0) {	
			System.out.println("Numero par");
		}else 
			System.out.println("Numero impar");
		
		
	
	}

}
