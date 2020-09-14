package br.edu.trabalho;

import javax.swing.JOptionPane;


import br.edu.trabalho.messagem.MensagemEmail;
import br.edu.trabalho.messagem.MensagemSMS;


public class StartApp {
	
	public static void main(String[] args) {
	
	int tipo = 0;
	
	tipo = Integer.parseInt(JOptionPane.showInputDialog("Tecle 1 para SMS ou qualquer tecla para Email:"));

  	
	
	String texto = JOptionPane.showInputDialog("Digite sua Mensagem");
	
		if(tipo == 1) {
		MensagemEmail email = new MensagemEmail();
		email.enviar(texto);
		}else {
		
		MensagemSMS SMS = new MensagemSMS();
		SMS.enviar(texto);
		}
		
	}
}