package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.*;
import utils.DriverUtils;

public class ProdutoSteps {
	WebDriver driver = DriverUtils.getDriver();

	@Dado("que o usuario esteja logado no sistema")
	public void queOUsuarioEstejaLogadoNoSistema() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.className("login_logo")).isDisplayed();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		driver.findElement(By.id("shopping_cart_container")).isDisplayed();
	}

	@Quando("eu selecionar um produto da lista de produtos")
	public void euSelecionarUmProdutoDaListaDeProdutos() throws InterruptedException {
		driver.findElement(By.xpath("//*[contains(text(), 'Sauce Labs Backpack')]")).click();
	}

	@Quando("clicar no botao de Add to cart")
	public void clicarNoBotaoDeAddToCart() {
		driver.findElement(By.xpath("//*[contains(text(), 'Add to cart')]")).click();
	}

	@Entao("deve ser adicionado um produto no carrinho")
	public void deveSerAdicionadoUmProdutoNoCarrinho() {
		driver.findElement(By.className("shopping_cart_badge")).isDisplayed();
	}

	@Quando("eu clicar no icone do carrinho")
	public void euClicarNoIconeDoCarrinho() {
		driver.findElement(By.className("shopping_cart_badge")).click();
	}

	@Entao("deve ser exibido o produto no meu carrinho")
	public void deveSerExibidoOProdutoNoMeuCarrinho() {
		driver.findElement(By.xpath("//*[contains(text(), 'Sauce Labs Backpack')]")).isDisplayed();
	}

	@Quando("eu clicar no botao Checkout")
	public void euClicarNoBotaoCheckout() {
		driver.findElement(By.id("checkout")).click();
	}

	@Quando("preencher o campo FirstName")
	public void preencherOCampoFirstName() {
		driver.findElement(By.id("first-name")).sendKeys("nicolas");
	}

	@Quando("preencher o campo LastName")
	public void preencherOCampoLastName() {
		driver.findElement(By.id("last-name")).sendKeys("saraiva");
	}

	@Quando("preencher o campo ZipCode")
	public void preencherOCampoZipCode() {
		driver.findElement(By.id("postal-code")).sendKeys("123123219");
	}

	@Quando("clicar no botao Continue")
	public void clicarNoBotaoContinue() {
		driver.findElement(By.name("continue")).click();
	}

	@Entao("deve ser exibido as informacoes de pagamento")
	public void deveSerExibidoAsInformacoesDePagamento() {
		driver.findElement(By.xpath("//*[contains(text(), 'Payment Information')]")).isDisplayed();
	}

	@Quando("eu clicar no botao Finish")
	public void euClicarNoBotaoFinish() {
		driver.findElement(By.id("finish")).click();
	}

	@Entao("o produto deve ser comprado, exibindo a mensagem de confirmacao")
	public void oProdutoDeveSerCompradoExibindoAMensagemDeConfirmacao() {
		driver.findElement(By.xpath("//*[contains(text(), 'Thank you for your order!')]")).isDisplayed();
		driver.close();
	}

	@Quando("eu clicao no botao Remove")
	public void euClicaoNoBotaoRemove() {
		driver.findElement(By.xpath("//*[contains(text(), 'Remove')]")).click();
	}

	@Entao("meu carrinho deve ficar vazio")
	public void meuCarrinhoDeveFicarVazio() {
		driver.findElement(By.className("shopping_cart_link")).isDisplayed();
	}

	@Quando("eu selecionar Sauce Labs Backpack da lista de produtos")
	public void euSelecionarSauceLabsBackpackDaListaDeProdutos() {
		driver.findElement(By.xpath("//*[contains(text(), 'Sauce Labs Backpack')]")).click();
	}	

	@Quando("clicar no botao Back to products")
	public void clicarNoBotaoBackToProducts() {
		driver.findElement(By.name("back-to-products")).click();
	}

	@Quando("clicar no botao Add to cart do produto Sauce Labs Bolt T-Shirt")
	public void clicarNoBotaoAddToCartDoProdutoSauceLabsBoltTShirt() {
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	}

	@Entao("deve ser exibido dois produtos no icone do carrinho")
	public void deveSerExibidoDoisProdutosNoIconeDoCarrinho() {
		driver.findElement(By.xpath("*//span[@class='shopping_cart_badge' and contains(text(), '2')]"));
	}
}
