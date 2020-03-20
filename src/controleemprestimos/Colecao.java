package controleemprestimos;

import static controleemprestimos.Principal.listaColecao;
import java.text.ParseException;
import java.util.Scanner;

public class Colecao {
    private String nome;

    //setters e getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //métodos
    public void cadastraColecao() throws ParseException {
        listaColecao();
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastro de nova Coleção");
        System.out.println("Nome: ");
        this.setNome(scan.nextLine());
    }
    
    //toString
    @Override
    public String toString() {
        return "Colecao: " + nome;
    }
}