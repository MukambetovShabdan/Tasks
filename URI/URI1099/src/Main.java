import java.util.*;
public class Main{

public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int X,Y;
        for(int i=1;i<=N;i++){
        X=scan.nextInt();
        Y=scan.nextInt();
        int odd=0;
        if(X>Y){
        for(int j=Y+1;j<X; j++){
        if(j%2!=0){
        odd+=j;
        }
        }
        System.out.println(odd);
        }else if(Y>X){
        for(int j=X+1;j<Y; j++){
        if(j%2!=0){
        odd+=j;
        }
        }
        System.out.println(odd);
        }else if(X==Y){
        System.out.println(odd);
        }
        }
        }
        }