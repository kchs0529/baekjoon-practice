import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[31];
       
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<28;i++){
            int num = sc.nextInt();
            check[num]=true;
        }
        for(int i=1;i<check.length;i++){
            if(check[i]!=true){
                System.out.println(i);
            }
        }
        
        
    }
}