package estruturascondicionais;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("====EQUAÇÃO DE 2° GRAU====");
            System.out.println("A equação é assim: Ax² + Bx + C = 0");

            //Entrada dos coeficientes
            System.out.print("Digite o valor de A: ");
            int a = sc.nextInt();

            System.out.print("Digite o valor de B: ");
            int b = sc.nextInt();

            System.out.print("Digite o valor de C: ");
            int c = sc.nextInt();

            //Mostrando a equação
            System.out.println("\nEquação: " + a + "x² + " + b + "x + " + c + " = 0");

            //Formula do Delta
            System.out.println("Δ = B² - 4.A.C");

            //Calculando o Delta
            int delta = b*b - 4*a*c;
            System.out.println("Δ = " + b + "² - 4." + a + "." + c);
            System.out.println("Δ = " + delta);

            System.out.println();

            //Verificando as raizes
            if(delta < 0){
                System.out.println("Não existem raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2*a);
                System.out.println("Existe uma raiz real (raiz dupla).");
                System.out.printf("x = %.1f%n", x);
            }else {
                double x1 = (-b + Math.sqrt(delta) / (2*a));
                double x2 = (-b + Math.sqrt(delta) / (2*a));
                System.out.println("Existem duas raízes reais: ");
                System.out.printf("Fórmula X¹ = (-B + √Δ) / (2.A) = (-%d + √%d) / (2.%d)\n", b, delta, a);
                System.out.printf("X¹ = %.1f%n", x1);
                System.out.printf("Fórmula X² = (-B + √Δ) / (2.A) = (-%d + √%d) / (2.%d)\n", b, delta, a);
                System.out.printf("X² = %.1f%n", x2);
            }

            //Pergunta se deseja realizar outro calculo com loop para validar a resposta do usuário
           while (true){
               System.out.println("\nDeseja calcular outra equação? (S/N): ");
               resposta = sc.next();

               if(resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("N")){
                   break; //Sai do loop, pois a entrada é válida
               }else{
                   System.out.println("Entrada inválida! Digite 'S' para sim ou 'N' para não.");
               }
           }

            System.out.println();

        }while (resposta.equalsIgnoreCase("S"));

        sc.close();
        System.out.println("Fim do progrma !");
    }
}
