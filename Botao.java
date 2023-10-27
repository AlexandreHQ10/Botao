/*DESENVOLVIMENTO DE UM BOTAO EM UMA INTERFACE, COM A OPÇÃO, CLIQUE AQUI.*/

package guiInterfaces;

import javax.swing.JButton; 

import javax.swing.JFrame;

public class PrimeiroExemploGUI {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Clique aqui!");
		button.setBounds(50,50,100,50);
		
		frame.add(button);

		frame.setSize(200,200);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
