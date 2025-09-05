public class Gerente extends Funcionario {
 public void imprimirRelatorio() {
 System.out.println("Relatório impresso pelo gerente.");
 }
 
public Gerente(String nome, String email, double salario) {
 super(nome, email, salario);
 }
}
