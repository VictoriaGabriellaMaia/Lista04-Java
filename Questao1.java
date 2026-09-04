// Leia e valide: nota (0-100), salário (>0), sexo (m ou f), idade (0-110).
// Quando o dado for válido, apresenta mensagem de sucesso e segue para o próximo.

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // a) Nota
        double nota;
        do {
            System.out.print("Digite a nota (entre 0 e 100): ");
            nota = input.nextDouble();

            if (nota < 0 || nota > 100) {
                System.out.println("Nota inválida! Tente novamente.");
            }
        } while (nota < 0 || nota > 100);
        System.out.println("Nota cadastrada com sucesso: " + nota);
        System.out.println();

        // b) Salário
        double salario;
        do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = input.nextDouble();

            if (salario <= 0) {
                System.out.println("Salário inválido! Tente novamente.");
            }
        } while (salario <= 0);
        System.out.println("Salário cadastrado com sucesso: " + salario);
        System.out.println();

        // c) Sexo
        String sexo;
        do {
            System.out.print("Digite o sexo (m ou f): ");
            sexo = input.next();

            if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                System.out.println("Sexo inválido! Tente novamente.");
            }
        } while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f"));
        System.out.println("Sexo cadastrado com sucesso: " + sexo);
        System.out.println();

        // d) Idade
        int idade;
        do {
            System.out.print("Digite a idade (entre 0 e 110): ");
            idade = input.nextInt();

            if (idade < 0 || idade > 110) {
                System.out.println("Idade inválida! Tente novamente.");
            }
        } while (idade < 0 || idade > 110);
        System.out.println("Idade cadastrada com sucesso: " + idade);

        input.close();

    }
}