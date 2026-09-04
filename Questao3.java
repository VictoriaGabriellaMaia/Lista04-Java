// Jogo de adivinhação: o usuário tenta acertar um número secreto entre 1 e 100.
// Informa se o palpite está acima ou abaixo, e permite jogar novamente.

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String jogarNovamente;

        do {

            int numeroSecreto = (int) (Math.random() * 100) + 1;
            int palpite;
            boolean acertou = false;
            String desistir = "n";

            System.out.println("Descubra o número secreto entre 1 e 100!");

            do {
                System.out.print("Digite seu palpite: ");
                palpite = input.nextInt();

                if (palpite == numeroSecreto) {
                    System.out.println("Parabéns! Você acertou o número secreto!");
                    acertou = true;
                } else if (palpite < numeroSecreto) {
                    System.out.println("O número secreto é MAIOR que o seu palpite.");
                } else {
                    System.out.println("O número secreto é MENOR que o seu palpite.");
                }

                if (!acertou) {
                    System.out.print("Deseja desistir? (s/n): ");
                    desistir = input.next();
                }

            } while (!acertou && !desistir.equalsIgnoreCase("s"));

            if (!acertou) {
                System.out.println("Você desistiu! O número secreto era " + numeroSecreto);
            }

            System.out.println();
            System.out.print("Deseja jogar novamente? (s/n): ");
            jogarNovamente = input.next();
            System.out.println();

        } while (jogarNovamente.equalsIgnoreCase("s"));

        System.out.println("Obrigado por jogar!");

        input.close();

    }
}