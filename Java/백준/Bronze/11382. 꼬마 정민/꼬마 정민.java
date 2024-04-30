import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        long sum=0;
        for(int i=0; i<arr.length;i++){
            sum+=Long.parseLong(arr[i]);
        }
        System.out.print(sum);
    }
}