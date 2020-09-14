package br.edu.trabalho.messagem;

import javax.swing.JOptionPane;

public class MensagemEmail{
	
		
		public void enviar(String mensagem) {
	
			JOptionPane.showMessageDialog(null, "Email: "+mensagem);
		}
}
