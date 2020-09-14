package br.edu.trabalho;

import javax.swing.JOptionPane;

import br.edu.trabalho.messagem.Mensagem;
import br.edu.trabalho.messagem.MensagemFactory;

public class StartApp {
	
	public static void main(String[] args) {
		
	int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para email ou qualquer NÚMERO para SMS:"));

	String texto = JOptionPane.showInputDialog("Digite sua mensagem");
	
	Mensagem mensagem = MensagemFactory.getMensagem(tipo);
	mensagem.enviar(texto);
	}
}