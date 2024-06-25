import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        
        for(int i=0;i<cNum.length;i++){
            sum+= cNum[i] -'0';//cNum은 문자이기 때문에 '0'을 빼서 숫자로 변경한다
        }
        System.out.print(sum);
    }
}