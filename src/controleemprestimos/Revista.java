package controleemprestimos;

import static controleemprestimos.Principal.caixa;
import static controleemprestimos.Principal.colecao;
import static controleemprestimos.Principal.listaCaixa;
import static controleemprestimos.Principal.listaColecao;
import static controleemprestimos.Principal.listaRevista;
import java.text.ParseException;
import java.util.Scanner;

public class Revista {
    private int numeroEdicao;
    private int ano;

    //setters e getters
    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //métodos
    public void cadastraRevista() throws ParseException {
        int idCol, idCx;
        listaRevista();
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastro de nova Revista");
        listaColecao();
        System.out.println("ID Coleção: ");
        idCol = scan.nextInt();
        scan.nextLine();
        colecao.get(idCol);
        System.out.println("Número da edição: ");
        this.setNumeroEdicao(scan.nextInt());
        scan.nextLine();
        System.out.println("Ano: ");
        this.setAno(scan.nextInt());
        scan.nextLine();
        listaCaixa();
        System.out.println("ID Caixa: ");
        idCx = scan.nextInt();
        scan.nextLine();
        colecao.get(idCx);
    }
    
    //toString
    @Override
    public String toString() {
        return colecao + ", nº" + numeroEdicao + ", ano " + ano + " - "
                + caixa;
    }
}
