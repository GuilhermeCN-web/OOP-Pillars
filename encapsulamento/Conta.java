public class Conta {
 public String nome;
 private double saldo;
 public String getSaldo() {
 return "R$" + saldo;
 }
 public void setSaldo(double saldo) {
 if (saldo > 0) {
 this.saldo = saldo;
 }
 }
}
