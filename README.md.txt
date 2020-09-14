README.md�
FactoryMethod�
Objetivo
      � um padr�o que define uma interface para criar um objeto, mas permite �s classes decidirem qual classe instanciar.�
Exemplo:
	Preparar um projeto para receber e enviar mensagens, facilitando a implementa��o de novas funcionalidades, com uma maior variedade de mensagens e impactando no c�digo geral da menor maneira poss�vel.

Exemplo C�digo:
O Main:
public class StartApp {
	
	public static void main(String[] args) {
		
	int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para email ou qualquer N�MERO para SMS:"));

	String texto = JOptionPane.showInputDialog("Digite sua mensagem");
	
	Mensagem mensagem = MensagemFactory.getMensagem(tipo);
	mensagem.enviar(texto);
	}
}



Implementa��es
public class MensagemEmail implements Mensagem {
	
		@Override
		public void enviar(String mensagem) {
	
			JOptionPane.showMessageDialog(null, "Email: "+mensagem);
		}
}
�
public class MensagemSMS implements Mensagem {

	@Override
	public void enviar(String mensagem) {

		JOptionPane.showMessageDialog(null, "SMS: "+mensagem);
	}

}

Classe que recebe a implementa��o
public interface Mensagem {
	public void enviar(String mensagem);
}

O classe FactoryMethod
public class MensagemFactory {
	
	public static Mensagem getMensagem(int i) {
		if(i == 1) {
			return new MensagemEmail();
		}else {
			return new MensagemSMS();
		}
	}
}

Vantagens�
* C�digo Mais limpo e estruturado;
* Poder de retornar uma mesma inst�ncia m�ltiplas vezes;
* Facilidade para incluir novos projetos e funcionalidades;
* N�o h� necessidade de montar um c�digo em fun��o a uma classe espec�fica.
