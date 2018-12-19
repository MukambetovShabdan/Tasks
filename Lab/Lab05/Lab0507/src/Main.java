/*public class Main{
    public static void main(String []args){
        int number = 0;
        int sum = 0;
        while(number < 20){
            if(sum >= 100)
                break;
            number++;
            sum +=number;
        }
        System.out.printf("The number is %d%n", number);
        System.out.printf("The sum is %d%n", sum);
    }
}*/
public class Main{
    public static void main(String [] args){
        int number = 0;
        int sum = 0;
        while(number < 20){
            number++;
            if (number == 10 || number == 11)
                continue;

            sum += number;
        }
        System.out.printf("The sum is %d%n", sum);
    }
}