import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();
        String third = scan.nextLine();
        switch (first) {
            case "vertebrado":
                switch (second) {
                    case "ave":
                        switch (third) {
                            case "carnivoro":
                                System.out.println("aguia");
                                break;
                            case "onivoro":
                                System.out.println("pomba");
                                break;
                        }
                        break;
                    case "mamifero":
                        switch (third) {
                            case "onivoro":
                                System.out.println("homem");
                                break;
                            case "herbivoro":
                                System.out.println("vaca");
                                break;
                        }
                        break;
                }
                break;
            case "invertebrado":
                switch (second) {
                    case "inseto":
                        switch (third) {
                            case "hematofago":
                                System.out.println("pulga");
                                break;
                            case "herbivoro":
                                System.out.println("lagarta");
                                break;
                        }
                        break;
                    case "anelideo":
                        switch (third) {
                            case "hematofago":
                                System.out.println("sanguessuga");
                                break;
                            case "onivoro":
                                System.out.println("minhoca");
                                break;
                        }
                        break;
                }
                break;

        }
    }
}
