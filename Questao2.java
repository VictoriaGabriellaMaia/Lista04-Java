// Calcula a média de notas inseridas pelo usuário (0 a 10).
// Após cada nota, pergunta se o usuário quer inserir outra.
// Ao final, exibe a menor nota, a média e a maior nota.

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double nota, soma = 0, maiorNota = -1, menorNota = 11;
        int totalNotas = 0;
        String continuar;

        do {

            // Valida a nota (0 a 10)
            do {
                System.out.print("Digite uma nota (entre 0 e 10): ");
                nota = input.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (nota < 0 || nota > 10);

            soma = soma + nota;
            totalNotas++;

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }

            System.out.print("Deseja inserir outra nota? (s/n): ");
            continuar = input.next();

            System.out.println();

        } while (continuar.equalsIgnoreCase("s"));

        if (totalNotas > 0) {
            double media = soma / totalNotas;

            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média das notas: " + media);
            System.out.prinfeat: calcula estatísticas de notas com repetição e validação do-while em Javatln("Maior nota: " + maiorNota);
        }

        input.close();

    }
}