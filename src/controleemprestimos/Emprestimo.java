package controleemprestimos;

import static controleemprestimos.Principal.amigo;
import static controleemprestimos.Principal.revista;
import static controleemprestimos.Principal.listaAmigos;
import static controleemprestimos.Principal.listaEmprestimo;
import static controleemprestimos.Principal.listaRevista;
import java.text.ParseException;
import java.util.Scanner;

public class Emprestimo {
    private String dataEmprestimo = "";
    private String dataDevolucao= "";
    
    //setters e getters

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    //métodos
    public void registraEmprestimo() throws ParseException  {
        int idAmg, idRev;
        listaEmprestimo();
        listaAmigos();
        Scanner scan = new Scanner(System.in);
        System.out.println("Registro de novo Empréstimo");
        System.out.println("ID Amigo: ");
        idAmg = scan.nextInt();
        scan.nextLine();
        amigo.get(idAmg);
        listaRevista();
        System.out.println("Registro de novo Empréstimo");
        System.out.println("ID Revista: ");
        idRev = scan.nextInt();
        revista.get(idRev);
        scan.nextLine();
        System.out.println("Data de empréstimo: ");
        this.setDataEmprestimo(scan.nextLine());
        System.out.println("Data de devolução: ");
        this.setDataDevolucao(scan.nextLine());
    }
    
    //toString
    @Override
    public String toString() {
        return "Empréstimo:" + "\n" + revista + "\n" + amigo+ "\n"
                + "Data de empréstimo: " + dataEmprestimo + "\n" + "Data da devolução: " + dataDevolucao + "\n" + "------------";
    }
}