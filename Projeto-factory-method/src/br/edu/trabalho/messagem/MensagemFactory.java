package br.edu.trabalho.messagem;

public class MensagemFactory {
	
	public static Mensagem getMensagem(int i) {
		if(i == 1) {
			return new MensagemEmail();
		}else {
			return new MensagemSMS();
		}
	}
}
