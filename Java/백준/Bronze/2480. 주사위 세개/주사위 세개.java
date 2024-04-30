import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int num1,num2,num3;
        num1 = Integer.parseInt(arr[0]);
        num2 = Integer.parseInt(arr[1]);
        num3 = Integer.parseInt(arr[2]);
        int prize;
        
        if(num1==num2 && num2==num3){
            prize = 10000+(num1*1000);
        }else if(num1==num2||num2==num3||num1==num3){
            int sameNum = (num1 == num2) ? num1 : num3;
            prize = 1000+(sameNum*100);
        }else{
            int max = Math.max(Math.max(num1,num2),num3);
            prize = max*100;
        }
        System.out.print(prize);
    }
}