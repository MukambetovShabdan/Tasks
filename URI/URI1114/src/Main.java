import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 1000; i ++) {
            int a = scan.nextInt();
            if (a == 2002){
                System.out.println("Acesso Permitido");
                break;
            }else {System.out.println("Senha Invalida");}
        }
    }
}
