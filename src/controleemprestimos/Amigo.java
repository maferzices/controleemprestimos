package controleemprestimos;

import static controleemprestimos.Principal.listaAmigos;
import java.text.ParseException;
import java.util.Scanner;

public class Amigo {
    private String nome;
    private String telefone;
    private String localAmigo;

    //setters e getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLocalAmigo() {
        return localAmigo;
    }

    public void setLocalAmigo(String localAmigo) {
        this.localAmigo = localAmigo;
    }
    
    //métodos
    public void cadastraAmigo() throws ParseException {
        listaAmigos();
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastro de novo Amigo");
        System.out.println("Nome: ");
        this.setNome(scan.nextLine());
        System.out.println("Telefone: ");
        this.setTelefone(scan.nextLine());
        System.out.println("Local de onde é o amigo: ");
        this.setLocalAmigo(scan.nextLine());
    }
    
    //toString
    @Override
    public String toString() {
        return "Nome: " + nome + ". Telefone: " + telefone + ". Local: " + localAmigo;
    }
}
