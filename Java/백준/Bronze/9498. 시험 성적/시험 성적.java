import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score>=90){
            print("A");
        }else if(score>=80){
            print("B");
        }else if(score>=70){
            print("C");
        }else if(score>=60){
            print("D");
        }else{
            print("F");
        }
    }
    
    public static void print(String grade){
        System.out.print(grade);
    }
}