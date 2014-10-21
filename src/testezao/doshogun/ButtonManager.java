package testezao.doshogun;

import java.io.BufferedWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class ButtonManager implements ActionListener {
	private JTextArea f;
	public ButtonManager(JTextArea f){
		this.f = f;
	}
	public void actionPerformed(ActionEvent e){
		String frase = f.getText();
		if(e.getActionCommand().equals("salvar")){
			try{
				saveFileAs(frase);
			}catch(IOException exception){
				exception.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("abrir")){
			try{
				loadFile();
			}catch(IOException exception){
				exception.printStackTrace(); 
			}
		}
	}
	public void saveFileAs(String frase) throws IOException{
		JFileChooser salvandoArquivo = new JFileChooser(); // Aquela janelinha de "salvar como"
		int resultado = salvandoArquivo.showSaveDialog(null); // Esse int é o que diz se selecionou um arquivo legit
		if (resultado != JFileChooser.APPROVE_OPTION) //Se não foi escolhido um arquivo valido pra salvar
			return; //ou se clicou em cancelar também, eu acho
		File salvarArquivoEscolhido = salvandoArquivo.getSelectedFile(); //Pega o arquivo do JFileChooser
		FileWriter fw = new FileWriter(salvarArquivoEscolhido); 
		BufferedWriter bw = new BufferedWriter(fw); //BufferedWriter escreve e lê arquivos
		bw.write(frase); //salva a string frase no arquivo
		bw.close(); //não tenho certeza do que isso faz, mas acho que é pra parar de mexer no arquivo
		
		JOptionPane.showMessageDialog(null,"Salvo com sucesso");
		
	}
	public void loadFile() throws IOException{
		JFileChooser abrindoArquivo = new JFileChooser();
		int resultado = abrindoArquivo.showOpenDialog(null);
		if (resultado != JFileChooser.APPROVE_OPTION)
			return;
		File abrirArquivo = abrindoArquivo.getSelectedFile();
		FileReader fr = new FileReader(abrirArquivo);
		f.read(fr,null);
		fr.close();		
		
	}

}
