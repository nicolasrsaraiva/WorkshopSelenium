package stepDefinitions;

import io.cucumber.java.pt.*;

public class LoginSteps {
	@Dado("que eu informe o username")
	public void que_eu_informe_o_username() {
		System.out.println("Teste");
	    
	}

	@Dado("informe a password")
	public void informe_a_password() {
		System.out.println("Teste");
	  
	}

	@Quando("eu clicar no botao Login")
	public void eu_clicar_no_botao_login() {
		System.out.println("Teste");
		
	}

	@Entao("devo ser redirecionado para a tela de produtos")
	public void devo_ser_redirecionado_para_a_tela_de_produtos() {
		System.out.println("Teste");
		
	}

	@Entao("deve aparecer uma mensagem de erro, informando que nao existe esse usuario com essa senha")
	public void deve_aparecer_uma_mensagem_de_erro_informando_que_nao_existe_esse_usuario_com_essa_senha() {
		System.out.println("Teste");
		
	}
}
