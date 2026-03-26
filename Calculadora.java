import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double numero1 = leitor.nextDouble();
        System.out.println("Digite o segundo numero");
        double numero2 = leitor.nextDouble();
        System.out.println("Escolha uma opção");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - multiplicar");
        System.out.println("4 - Dividir");
        int opção = leitor.nextInt();
        leitor.close();

        if (opção == 1){
            System.out.println("Resultado " + soma(numero1, numero2));
        } else if (opção == 2){
            System.out.println("Resultado " + subtrair(numero1, numero2));
        } else if (opção == 3){
            System.out.println("Resultado " + multiplicar(numero1, numero2));
        } else if (opção == 4){
            if (numero2 !=0){
                System.out.println("Resultado " + dividir(numero1, numero2));
            } else {
                System.out.println("Não é possibel dividir por zero");
            }
        } else {
            System.out.println("Opção invalida");
        }
    }
    public static double soma(double n1, double n2){
        return n1 + n2;
    }
    public static double subtrair(double n1, double n2){
        return n1 - n2;
    }
    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }
    public static double dividir(double n1, double n2){
        return n1 / n2;
    }
}