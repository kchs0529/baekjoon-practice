import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h,m;
        h = sc.nextInt();
        m = sc.nextInt();
        if(h == 0 &&m-45<0){
            h = 23;
            m = m+15;
        }else if(m-45<0){
            h = h-1;
            m = m+15;
        }else{
            m = m-45;
        }
        
        System.out.print(h+" "+m);
    }
}