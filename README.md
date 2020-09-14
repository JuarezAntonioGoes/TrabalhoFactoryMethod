# TrabalhoFactoryMethod

FactoryMethod 
Objetivo
      É um padrão que define uma interface para criar um objeto, mas permite às classes decidirem qual classe instanciar. 
Exemplo:
	Preparar um projeto para receber e enviar mensagens, facilitando a implementação de novas funcionalidades, com uma maior variedade de mensagens e impactando no código geral da menor maneira possível.

Exemplo Código:
O Main:

public class StartApp {
	
	public static void main(String[] args) {
		
	int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para email ou qualquer NÚMERO para SMS:"));

	String texto = JOptionPane.showInputDialog("Digite sua mensagem");
	
	Mensagem mensagem = MensagemFactory.getMensagem(tipo);
	mensagem.enviar(texto);
	}
}



Implementações

public class MensagemEmail implements Mensagem {
	
		@Override
		public void enviar(String mensagem) {
	
			JOptionPane.showMessageDialog(null, "Email: "+mensagem);
		}
}
 
public class MensagemSMS implements Mensagem {

	@Override
	public void enviar(String mensagem) {

		JOptionPane.showMessageDialog(null, "SMS: "+mensagem);
	}

}

Classe que recebe a implementação
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

Vantagens 
* Código Mais limpo e estruturado;
* Poder de retornar uma mesma instância múltiplas vezes;
* Facilidade para incluir novos projetos e funcionalidades;
* Não há necessidade de montar um código em função a uma classe específica.
