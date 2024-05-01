import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder str = new StringBuilder();
        String s = "long ";
        for(int i=0;i<(N/4);i++){
            str.append(s);
        }
        System.out.print(str.toString()+"int");
    }
}