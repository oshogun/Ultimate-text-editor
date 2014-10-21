package testezao.doshogun;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("O melhor editor de texto do mundo");
		JPanel panel = new Janela();
		f.setContentPane(panel);
		f.setResizable(true);
		f.setPreferredSize(new Dimension(500,600));
		f.pack();
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		

	}

}
