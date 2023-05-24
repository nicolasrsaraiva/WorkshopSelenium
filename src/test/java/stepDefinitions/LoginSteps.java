package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.*;
import utils.DriverUtils;

public class LoginSteps {
	
	WebDriver driver = DriverUtils.getDriver();
	
	@Dado("que eu esteja na pagina de login do sistema Sauce Demo")
	public void queEuEstejaNaPaginaDeLoginDoSistemaSauceDemo() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.className("login_logo")).isDisplayed();
	}

	@Quando("eu informar o username")
	public void euInformarOUsername() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}

	@Quando("informar a password")
	public void informarAPassword() {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@Quando("eu clicar no botao Login")
	public void euClicarNoBotaoLogin() {
		driver.findElement(By.name("login-button")).click();
	}

	@Entao("devo ser redirecionado para a tela de produtos")
	public void devoSerRedirecionadoParaATelaDeProdutos() {
		driver.findElement(By.id("shopping_cart_container")).isDisplayed();
	}

	@Quando("informar a password {int} incorreta")
	public void informarAPasswordIncorreta(Integer senha) {
		driver.findElement(By.id("password")).sendKeys(senha.toString());
	}
	@Entao("deve aparecer uma mensagem de erro, informando que nao existe esse usuario com essa senha")
	public void deveAparecerUmaMensagemDeErroInformandoQueNaoExisteEsseUsuarioComEssaSenha() {
		driver.findElement(By.xpath(
				"//*[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]")).isDisplayed();
		driver.close();
	}

}