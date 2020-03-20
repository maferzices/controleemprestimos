package controleemprestimos;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static ArrayList<Colecao> colecao = new ArrayList();
    public static ArrayList<Caixa> caixa = new ArrayList();
    public static ArrayList<Revista> revista = new ArrayList();
    public static ArrayList<Amigo> amigo = new ArrayList();
    public static ArrayList<Emprestimo> emprestimo = new ArrayList();
    
    public static void listaCaixa() {
        System.out.println("--------------------------------------");
        System.out.println("Listas de caixas ");
        System.out.println("--------------------------------------");
        System.out.println("");
        if (caixa.isEmpty()) {
            System.out.println("Nenhuma caixa cadastrada.");
        } else { 
            for (int i=0; i < caixa.size(); i++){
                System.out.println("ID: " + i);
                System.out.println(caixa.get(i));
            }
        }
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
    }
    
    public static void listaColecao() {
        System.out.println("--------------------------------------");
        System.out.println("Listas de coleções ");
        System.out.println("--------------------------------------");
        System.out.println("");
        if (colecao.isEmpty()) {
            System.out.println("Nenhuma coleção cadastrada.");
        } else { 
            for (int i=0; i < colecao.size(); i++){
                System.out.println("ID: " + i);
                System.out.println(colecao.get(i));
            }
        }
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
    }
    
    public static void listaRevista() {
        System.out.println("--------------------------------------");
        System.out.println("Listas de revistas ");
        System.out.println("--------------------------------------");
        System.out.println("");
        if (revista.isEmpty()) {
            System.out.println("Nenhuma revista cadastrada.");
        } else { 
            for (int i=0; i < revista.size(); i++){
                System.out.println("ID: " + i);
                System.out.println(revista.get(i));
            }
        }
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
    }
    
    public static void listaAmigos() {
        System.out.println("--------------------------------------");
        System.out.println("Listas de amigos / amigas ");
        System.out.println("--------------------------------------");
        System.out.println("");
        if (amigo.isEmpty()) {
            System.out.println("Nenhum amigo ou amiga cadastrados.");
        } else { 
            for (int i=0; i < amigo.size(); i++){
                System.out.println("ID: " + i);
                System.out.println(amigo.get(i));
            }
        }
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
    }
    
    public static void listaEmprestimo() {
        System.out.println("--------------------------------------");
        System.out.println("Listas de empréstimos ");
        System.out.println("--------------------------------------");
        System.out.println("");
        if (emprestimo.isEmpty()) {
            System.out.println("Nenhum empréstimo cadastrado.");
        } else { 
            for (int i=0; i < emprestimo.size(); i++){
                System.out.println(emprestimo.get(i));
            }
        }
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
    }
    
    public static void main(String[] args) throws ParseException  {
        Scanner scan = new Scanner(System.in);
        int op = 1;
        do {
            System.out.println("***************************************");
            System.out.println("* Controle de empréstimos de revistas *");
            System.out.println("***************************************");
            System.out.println("");
            System.out.println("Cadastrar:");
            System.out.println("[ 1 ] Caixa || [ 2 ] Coleção ||"
                    + "[ 3 ] Revista || [ 4 ] Amigo/Amiga || [ 5 ] Novo Empréstimo");
            System.out.println("");
            System.out.println("Listar:");
            System.out.println("[ 6 ] Caixa || [ 7 ] Coleção ||"
                    + "[ 8 ] Revista || [ 9 ] Amigo/Amiga || [ 10 ] Empréstimos");
            System.out.println("");
            System.out.println("[ 0 ] Sair");
            System.out.println("");
            System.out.println("------------------");
            System.out.println("");
            System.out.println("Escolha uma opção: ");
            op = scan.nextInt();
            scan.nextLine();
            
            switch (op) {
                case 1:
                    Caixa cx1 = new Caixa();
                    cx1.cadastraCaixa();
                    caixa.add(cx1);
                    break;
                case 2:
                    Colecao cl1 = new Colecao();
                    cl1.cadastraColecao();
                    colecao.add(cl1);
                    break;
                case 3:
                    if (colecao.isEmpty()) {
                        System.out.println("ATENÇÃO!");
                        System.out.println("Você precisa ter pelo menos uma coleção cadastrada.");
                        System.out.println("");
                    } else if (caixa.isEmpty()){
                        System.out.println("ATENÇÃO!");
                        System.out.println("Você precisa ter pelo menos uma caixa cadastrada.");
                        System.out.println("");
                    } else {
                        Revista rv1 = new Revista();
                        rv1.cadastraRevista();
                        revista.add(rv1);
                    }
                        break;
                case 4:
                    Amigo am1 = new Amigo();
                    am1.cadastraAmigo();
                    amigo.add(am1);
                    break;
                case 5:
                    if (amigo.isEmpty()) {
                        System.out.println("ATENÇÃO!");
                        System.out.println("Você precisa ter pelo menos um amigo ou amiga cadastrados antes do empréstimo.");
                        System.out.println("");
                    } else if (revista.isEmpty()) { 
                        System.out.println("ATENÇÃO!");
                        System.out.println("Você precisa ter pelo menos uma revista cadastrada antes do empréstimo.");
                        System.out.println("");
                    } else {
                        Emprestimo emp1 = new Emprestimo();
                        emp1.registraEmprestimo();
                        emprestimo.add(emp1);
                    }
                    break;
                case 6:
                    listaCaixa();
                    break;
                case 7:
                    listaColecao();
                    break;
                case 8:
                    listaRevista();
                    break;
                case 9:
                    listaAmigos();
                    break;
                case 10:
                    listaEmprestimo();
                    break;
                default:
                    if (op == 0){
                        System.exit(0);
                    } else {
                        System.out.println("Opção inválida");
                        System.out.println("");
                    }
            }
        } while (op != 0);
    }
}
