package util;

import java.util.Scanner;

public class EntradaUsuario {
    private static Scanner scanner = new Scanner(System.in);

        public static String lerString(String mensagem) {
            System.out.print(mensagem);
            return scanner.nextLine();
        }

        public static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                }
            }
        }

    public static void fechar() {
        if (scanner != null) {
            scanner.close();
        }
    }
}