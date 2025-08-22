package estruturascondicionais;

import java.util.Scanner;

public class ProgramaParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        if(n % 2 == 0){
            System.out.println(n + " é PAR.");
        }else{
            System.out.println(n + " é ÍMPAR.");
        }
    }
}
