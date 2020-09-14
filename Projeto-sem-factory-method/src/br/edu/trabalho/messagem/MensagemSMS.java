package br.edu.trabalho.messagem;

import javax.swing.JOptionPane;

public class MensagemSMS{

	
	public void enviar(String mensagem) {

		JOptionPane.showMessageDialog(null, "SMS: "+mensagem);
	}

}
