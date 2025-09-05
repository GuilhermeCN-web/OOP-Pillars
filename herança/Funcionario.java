public class Funcionario {
 private String nome;
 private String email;
 private double salario;
 public void baterPonto() {
 System.out.println("Ponto registrado");
 }

 public Funcionario(String nome, String email, double salario) {
 this.nome = nome;
 this.email = email;
 this.salario = salario;
 }
}
