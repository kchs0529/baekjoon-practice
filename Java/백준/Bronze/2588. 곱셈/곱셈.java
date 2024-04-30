import java.util.*;
public class Main{
    public static void main(String[] args){
        int a,b,one,two,three;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        one = b%10;
        two = (b/10)%10;
        three = b/100;
        System.out.println(a*one);
        System.out.println(a*two);
        System.out.println(a*three);
        System.out.println(a*b);
    }
}