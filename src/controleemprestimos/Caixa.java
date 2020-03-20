package controleemprestimos;

import static controleemprestimos.Principal.listaCaixa;
import java.text.ParseException;
import java.util.Scanner;

public class Caixa {
    private int numero;
    private String idEtiqueta;
    private String cor;
    
    //setters e getters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getIdEtiqueta() {
        return idEtiqueta;
    }

    public void setIdEtiqueta(String idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    //métodos
    public void cadastraCaixa() throws ParseException {
        listaCaixa();
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastro de nova Caixa");
        System.out.println("Número: ");
        this.setNumero(scan.nextInt());
        scan.nextLine();
        System.out.println("Identificação da etiqueta: ");
        this.setIdEtiqueta(scan.nextLine());
        System.out.println("Cor da caixa: ");
        this.setCor(scan.nextLine());
    }
    
    //toString
    @Override
    public String toString() {
        return "Número da caixa: " + numero + ". Etiqueta: " + idEtiqueta + ". Cor: " + cor;
    }
}
