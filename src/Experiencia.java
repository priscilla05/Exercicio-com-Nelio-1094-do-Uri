import java.util.Scanner;

public class Experiencia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        for (int i = 0; i < N; i++) {
            int quantia = scanner.nextInt();
            char tipo = scanner.next().charAt(0);

            if (tipo == 'C') {
                totalCoelhos = totalCoelhos + quantia; // ou totalCoelhos += quantia

            } else if (tipo == 'R') {
                totalRatos = totalRatos + quantia;

            } else {
                totalSapos = totalSapos + quantia;
            }


        }
        int totalGeral = totalCoelhos + totalRatos + totalSapos;

        double percentualCoelhos = (double) totalCoelhos / totalGeral * 100; //o (double) to usando o casting
        double percentualRatos = (double) totalRatos / totalGeral * 100.0;
        double percentualSapos = (double) totalSapos / totalGeral * 100.0;

        System.out.printf("Total: %d cobaias%n", totalGeral);
        System.out.printf("Total de coelhos: %d%n", totalCoelhos);
        System.out.printf("Total de ratos: %d%n", totalRatos);
        System.out.printf("Total de Sapos: %d%n", totalSapos);
        System.out.printf("Percentual de Coelhos: %.2f %%%n", percentualCoelhos);
        System.out.printf("Percentual de Ratos: %.2f %%%n", percentualRatos);
        System.out.printf("Percentual de Sapos: %.2f %%%n", percentualSapos);


        scanner.close();
    }
}
