import java.util.Scanner;
import java.util.Locale;

public class Class {
    public static void main(String[] args) {
        //Criando o Objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem Vindo ao Banco!!\nDigite somento seu primeiro nome por favor!!!");
        String name = scanner.next(); //valor STRING

        System.out.println("Digite sua Agência, por favor!!!");
        String agn = scanner.next(); //valor STRING

        System.out.println("Digite o número da sua conta, por favor!!!");
        int number = scanner.nextInt(); //valor INT, Preste atenção que quando for int use nextINT <--

        System.out.println("Digite seu saldo, por favor!!!");
        double number2 = scanner.nextDouble();

        if ( number2 == 0 ) {
            System.out.println("Não há saldo em sua conta!!");
        }
        else if ( number2 > 1000) {
            System.out.println("Você é Rico, se quiser melhorar a sua conta para uma PREMIUM insira 1");
            int yes = scanner.nextInt();
            if (yes == 1) {
                System.out.println("Sua Conta é PREMIUM agora!!!");
            } else {
                System.out.println("Olá " + name + " seu número é " + number + " da Agência " + agn + "\nVocê tem " + number2 + " de saldo!! E poderia ser PREMIUM");
            }
        }
        else {
            System.out.println("Olá " + name + " seu número é " + number + " da Agência " + agn + "\nVocê tem " + number2 + " de saldo!!");
        }

scanner.close();
    }

}
