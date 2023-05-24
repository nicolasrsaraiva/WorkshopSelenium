#language: pt
@logout @end2end
Funcionalidade: Testar a operacao de logout

  Contexto: 
    Dado que o usuario esteja logado no sistema

  @logoutComSucesso
  Cenario: Realizar logout com sucesso
    Quando eu clicar no menu escondido no canto superior esquerdo
    Entao deve ser exibido a opcao de logout
    Quando eu clicar na opcao de logout
    Entao deve ser efetuado o logout do sistema, exibindo a tela de login
