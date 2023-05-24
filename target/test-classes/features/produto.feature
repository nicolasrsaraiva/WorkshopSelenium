#language: pt
@produtos @end2end
Funcionalidade: Testar operacoes referentes aos produtos

  Contexto: 
    Dado que o usuario esteja logado no sistema

  @comprarProdutoComSucesso
  Cenario: Comprar um produto com sucesso
    Quando eu selecionar um produto da lista de produtos
    E clicar no botao de Add to cart
    Entao deve ser adicionado um produto no carrinho
    Quando eu clicar no icone do carrinho
    Entao deve ser exibido o produto no meu carrinho
    Quando eu clicar no botao Checkout
    E preencher o campo FirstName
    E preencher o campo LastName
    E preencher o campo ZipCode
    E clicar no botao Continue
    Entao deve ser exibido as informacoes de pagamento
    Quando eu clicar no botao Finish
    Entao o produto deve ser comprado, exibindo a mensagem de confirmacao

  @removerProduto
  Cenario: Remover produto do carrinho
    Quando eu selecionar um produto da lista de produtos
    E clicar no botao de Add to cart
    Entao deve ser adicionado um produto no carrinho
    Quando eu clicar no icone do carrinho
    Entao deve ser exibido o produto no meu carrinho
    Quando eu clicao no botao Remove
    Entao meu carrinho deve ficar vazio

  @adicionarDoisProdutos
  Cenario: Adicionar Backpack e Fleece Jacket no carrinho
    Quando eu selecionar Sauce Labs Backpack da lista de produtos
    E clicar no botao de Add to cart
    E clicar no botao Back to products
    E clicar no botao Add to cart do produto Sauce Labs Bolt T-Shirt
    Entao deve ser exibido dois produtos no icone do carrinho
