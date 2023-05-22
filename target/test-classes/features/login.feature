#language: pt
@login
Funcionalidade: Testar a operacao de login

  @loginComSucesso
  Cenario: Realizar login com usuario e senha corretos
    Dado que eu informe o username
    E informe a password
    Quando eu clicar no botao Login
    Entao devo ser redirecionado para a tela de produtos

  @loginComSenhaIncorreta
  Cenario: Realizar login com senha incorreta
    Dado que eu informe o username
    E informe a password
    Quando eu clicar no botao Login
    Entao deve aparecer uma mensagem de erro, informando que nao existe esse usuario com essa senha
