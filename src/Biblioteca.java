import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private String nome;
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList <Livro> livros = new ArrayList<>();

    public void listarUsuarios(){

        for (Usuario usuario : usuarios){
            System.out.println(usuarios);

        }
    }

    public void cadastrarLivro(){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = Scanner.nextLine();

        System.out.println("Preço: ");
        Double preco = Scanner.nextDouble();

        Livro livro = new Livro(nome, preco);
        livros.add(livro);

        System.out.println("livro cadastrado");


    }

    public void cadastrarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        Integer idade = Integer.parseInt(scanner.nextLine());

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        Usuario usuario = new Usuario(nome, idade, cpf);
        usuarios.add(usuario);

        System.out.println("Usuário cadastrado!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
