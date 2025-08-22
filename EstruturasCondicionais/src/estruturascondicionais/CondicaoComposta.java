package estruturascondicionais;

import java.util.Scanner;

public class CondicaoComposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento: ");
        int anoNasc = scanner.nextInt();
        int idade = 2025 - anoNasc;
        System.out.println("Sua idade é "+ idade + " anos.");

        if(idade >= 18){
            System.out.println("Você é maior de idade!");
        }else {
            System.out.println("Você é menor de idade!");
        }


    }
}
