import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int a,b;
        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[1]);
        
        if(a>b){
            System.out.print(">");
        }
        if(a == b){
            System.out.print("==");
        }
        if(a<b){
            System.out.print("<");
        }
    }
}