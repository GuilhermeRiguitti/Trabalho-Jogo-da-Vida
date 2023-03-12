import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    VivoMorto jogo = new VivoMorto();
    jogo.gerarMatrizAleatoria();
    jogo.imprimirMatriz();
    Scanner scanner = new Scanner(System.in);
    
    // O programa solicita a entrada do usuário para decidir quando sair, atualiza e imprime a matriz repetidamente até que o usuário opte por sair.
    while (true) {
      System.out.println("Digite 'f' para sair ou enter para continuar: ");
      String input = scanner.nextLine();
      if (input.equals("f")) {
        break;
      }
      jogo.calcularProximoEstado();
      jogo.imprimirMatriz();
    }
  }
}