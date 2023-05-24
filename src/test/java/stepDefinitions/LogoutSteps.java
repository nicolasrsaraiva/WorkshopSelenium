package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.*;
import utils.DriverUtils;

public class LogoutSteps {
	
	WebDriver driver = DriverUtils.getDriver();
	
	@Dado("que o usuario esteja logado no sistema")
	public void queOUsuarioEstejaLogadoNoSistema() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.className("login_logo")).isDisplayed();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		driver.findElement(By.id("shopping_cart_container")).isDisplayed();
	}
	
	@Quando("eu clicar no menu escondido no canto superior esquerdo")
	public void euClicarNoMenuEscondidoNoCantoSuperiorEsquerdo() {
	    driver.findElement(By.id("react-burger-menu-btn")).click();
	}
	@Entao("deve ser exibido a opcao de logout")
	public void deveSerExibidoAOpcaoDeLogout() {
	    driver.findElement(By.id("logout_sidebar_link")).isDisplayed();
	}
	@Quando("eu clicar na opcao de logout")
	public void euClicarNaOpcaoDeLogout() {
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	@Entao("deve ser efetuado o logout do sistema, exibindo a tela de login")
	public void deveSerEfetuadoOLogoutDoSistemaExibindoATelaDeLogin() {
		driver.findElement(By.className("login_logo")).isDisplayed();
		driver.close();
	}
}
