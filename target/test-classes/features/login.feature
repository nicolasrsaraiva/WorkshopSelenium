#language: pt
@login @end2end
Funcionalidade: Testar a operacao de login

  @loginComSucesso
  Cenario: Realizar login com usuario e senha corretos
    Dado que eu esteja na pagina de login do sistema Sauce Demo
    Quando eu informar o username
    E informar a password
    Quando eu clicar no botao Login
    Entao devo ser redirecionado para a tela de produtos

  @loginComSenhaIncorreta
  Esquema do Cenario: Realizar login com senha incorreta
    Dado que eu esteja na pagina de login do sistema Sauce Demo
    Quando eu informar o username
    E informar a password <password> incorreta
    Quando eu clicar no botao Login
    Entao deve aparecer uma mensagem de erro, informando que nao existe esse usuario com essa senha

    Exemplos: 
      | password |
      |      123 |
      |      232 |
      |    12312 |
