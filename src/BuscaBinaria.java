import java.util.Scanner;

public class BuscaBinaria {

    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);

      int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
      int n = array.length;
      int min = 0;
      int max = n-1;

      int target = (int) (Math.random() * (max - min));
      boolean encontrou = false;

      System.out.println(" ");

      System.out.println("Digite um número entre 0 e 50. Será verificado se o número condiz ou não com o resultado correto.");
      System.out.println("DICA: tente usar números que estejam na metade do número final.");
      System.out.println("Exemplo: tente usar 24 ou 25 por ser de 0 a 50 e depois continue dividindo ou usando partes do número, dependendo da distância do resultado final.");

      System.out.println(" ");

      while(!encontrou) {
        System.out.print("Número: ");
        int chute = scanner.nextInt();

        if(array[chute] == target) {
          encontrou = true;
          System.out.println("Parabéns, você encontrou o resultado correto! O resultado é " + target + ".");
        }
        else if(array[chute] < target) {
          System.out.println("O alvo é maior que " + chute);
        } else {
          System.out.println("O alvo é menor que " + chute);
        }
      }
    }
  }