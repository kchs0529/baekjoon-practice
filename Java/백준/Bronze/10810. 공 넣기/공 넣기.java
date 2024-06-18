import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];
        
        for(int i=0;i<M;i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();
            
            for(int j=first-1;j<second;j++){
                basket[j]=third;
            }
        }
        
        for(int i=0;i<basket.length;i++){
            System.out.print(basket[i]+" ");
        }
    }
}