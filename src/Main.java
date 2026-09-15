
 void main() {
  Scanner inputTexto = new Scanner(System.in);
  Scanner inputNumero = new Scanner(System.in);
  int opcao;
  Biblioteca biblioteca = new Biblioteca();
  do{
   System.out.println("digite [1] para cadastrar usuário\n" +
           "digite [2] para cadastrar um livro\n" +
           "digite [3] para listar usuários\n" +
           "digite [4] para listar livros\n" +
           "digite [5] para realizar aluguel\n" +
           "digite [6] para realizar devolução\n" +
           "digite [7] para Consultar se um livro está disponível\n" +
           "digite [8] para Exibir quais livros estão alugados por determinado usuário\n" +
           "digite [0] para sair do sistema\n");
            opcao = inputNumero.nextInt();

            switch (opcao){
                case 1:
                    biblioteca.cadastrarUsuario();
                    break;
                case 2:
                    biblioteca.cadastrarLivro();
                    break;
                case 3:
                    biblioteca.listarUsuarios();
                    break;
                case 4:





            }

  }while (opcao != 0);
     System.out.println("você saiu do sistema");


 }
