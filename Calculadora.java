/**
 * @author João Paulo Falcão
 * @since 2024-03-14
 * @version 1.0
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double subtracao(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicacao(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double divisao(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        double numero1 = 0.0;
        double numero2 = 0.0;

        while (opcao != 5) {
            try {
                System.out.printf("\n>>>Calculadora<<<\n");
                System.out.printf("1-Soma\n");
                System.out.printf("2-Subtração\n");
                System.out.printf("3-Multiplicação\n");
                System.out.printf("4-Divisão\n");
                System.out.printf("5-Sair\n");
                System.out.print("Opção: ");
                opcao = entrada.nextInt();

                if (opcao >= 1 && opcao <= 4) {
                    System.out.print("\nNúmero 1: ");
                    numero1 = entrada.nextDouble();
                    System.out.print("Número 2: ");
                    numero2 = entrada.nextDouble();

                    switch (opcao) {
                        case 1:
                            System.out.printf("\nSoma: %.2f\n", soma(numero1, numero2));
                            break;
                        case 2:
                            System.out.printf("\nSubtração: %.2f\n", subtracao(numero1, numero2));
                            break;
                        case 3:
                            System.out.printf("\nMultiplicação: %.2f\n", multiplicacao(numero1, numero2));
                            break;
                        case 4:
                            if (numero2 == 0.0) {
                                System.out.println("\nNão é permitido dividir por zero!");
                            } else {
                                System.out.printf("\nDivisão: %.2f\n", divisao(numero1, numero2));
                            }
                            break;
                    }
                } else if (opcao == 5) {
                    System.out.printf("\nSaindo...\n");
                    break;
                } else {
                    System.out.printf("\nOpção inválida!\n");
                }
            } catch (InputMismatchException erro) {
                System.out.println("\nDigite apenas números!");
                entrada.nextLine();
            }
        }

        entrada.close();
    }
}
