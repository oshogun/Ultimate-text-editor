package testezao.doshogun;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Janela extends JPanel {
	public Janela(){
		setLayout(new BorderLayout());
		JTextArea f = new JTextArea();
		JButton c1,c2,c3,c4;
		JScrollPane pane = new JScrollPane(f);
		pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		c1 = new JButton("Salvar arquivo");
		c1.setActionCommand("salvar");
		add(c1, BorderLayout.LINE_START);
		c2 = new JButton("Abrir");
		c2.setActionCommand("abrir");
		add(c2,BorderLayout.LINE_END);
		ButtonManager t= new ButtonManager(f);
		c1.addActionListener(t);
		c2.addActionListener(t);
		f.setEditable(true);
		pane.setPreferredSize(new Dimension(500,535));
		f.setPreferredSize(new Dimension(500,535));
		f.setText("Digite aqui o seu texto");
		add(pane,BorderLayout.SOUTH);
		
			
	}

	

}
