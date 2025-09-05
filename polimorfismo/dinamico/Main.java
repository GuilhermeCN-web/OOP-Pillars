package dinamico;

public class Main {
 public static void main(String[] args) {
 Animal a1 = new Cao();
 Animal a2 = new Gato();
 a1.emitirSom(); // Saída: O cão late.
 a2.emitirSom(); // Saída: O gato mia.
 }
}