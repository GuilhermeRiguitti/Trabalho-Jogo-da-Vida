import java.util.Scanner;
import java.util.Random;

public class VivoMorto {

  private int[][] matriz;
  private int[][] matrizVivoMorto;
  private int tamanho;
  
  public void gerarMatrizAleatoria() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o tamanho da matriz: ");
    tamanho = scanner.nextInt();

    matriz = new int[tamanho][tamanho];
    matrizVivoMorto = new int[tamanho][tamanho]; // inicializar matrizVivoMorto
    Random random = new Random();

    for (int i = 0; i < tamanho; i++) {
      for (int j = 0; j < tamanho; j++) {
        matriz[i][j] = random.nextInt(2);
      }
    }
  }

  public void imprimirMatriz() {
    for (int i = 0; i < tamanho; i++) {
      for (int j = 0; j < tamanho; j++) {
        System.out.print(matriz[i][j] + "   ");
      }
      System.out.println();
    }
  }
  public void calcularProximoEstado() {
    for (int i = 0; i < tamanho; i++) {
      for (int j = 0; j < tamanho; j++) {
        
      // Faz com que vizinhosVivos tenha os mesmos valores de contarVizinhosVivos para que seja a valiado a quantidade de vizinhos vivos de cada arrey 
      int vizinhosVivos = contarVizinhosVivos(i, j);
         if (matriz[i][j] == 1) { // célula viva
            if (vizinhosVivos < 2 || vizinhosVivos > 3) {
             matrizVivoMorto[i][j] = 0; // morre por solidão ou superpopulação
             } 
             else {
             matrizVivoMorto[i][j] = 1; // sobrevive
             }
            } 
            else { // célula morta
               if (vizinhosVivos == 3) {
               matrizVivoMorto[i][j] = 1; // nasce por reprodução
               } 
               else {
               matrizVivoMorto[i][j] = 0; // continua morta
               }
             }
           }
         }
         matriz = matrizVivoMorto; // atualiza a matriz com o estado atualizado
      }

      // Contador de vizinhos
      private int contarVizinhosVivos(int linha, int coluna) {
      int totalVizinhosVivos = 0;

        // Usando um modo de simplificar o codigo usamos o "?" e o ":" com o intuito de demonstrar a seguinte ideia : expressão lógica ? valor se verdadeiro : valor se falso
        // Ou seja, primeiro é avaliada uma expressão lógica e, dependendo do seu resultado, é retornado um valor ou outro.

      // Verifica vizinhos da parte de cima
      int cima = linha == 0 ? tamanho - 1 : linha - 1;
      // Se cima == i=0 então cima atribui o valor de tamanho - 1 , senão (se i != 0) cima é atribuido cima = i=linha -1
        
      if (matriz[cima][coluna] == 1) {
        totalVizinhosVivos++;
      }

      // Verifica vizinhos da parte de baixo
      int baixo = linha == tamanho - 1 ? 0 : linha + 1;
      // Se baixo == i=tamanho-1 então baixo atribui o valor de 0 , senão (se i != tamanho -1) baixo é atribuido baixo = i=linha+1
        
      if (matriz[baixo][coluna] == 1) {
        totalVizinhosVivos++;
      }

      // Verifica vizinhos da parte da esquerda
      int esquerda = coluna == 0 ? tamanho - 1 : coluna - 1;
      if (matriz[linha][esquerda] == 1) {
        totalVizinhosVivos++;
      }

      // Verifica vizinhos da parte da direita
      int direita = coluna == tamanho - 1 ? 0 : coluna + 1;
      if (matriz[linha][direita] == 1) {
        totalVizinhosVivos++;
      }

      return totalVizinhosVivos;
   }
}