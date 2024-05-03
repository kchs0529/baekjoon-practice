import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int base,Decimal=0;
        String N = tokens[0];
        base = Integer.parseInt(tokens[1]);
        
        // 입력된 수를 거꾸로 뒤집어서 처리하기 위해 StringBuilder를 사용합니다.
        StringBuilder reversedN = new StringBuilder(N).reverse();
        
        for(int i = 0;i<reversedN.length();i++){
            char digit = reversedN.charAt(i);
            int num;
            if(digit>'A'&&digit<='Z'){
                num = digit - 'A' + 10;
            }else{
                num = Character.getNumericValue(digit);
            }
            
            Decimal += num * Math.pow(base, i);//각 자리의 가중치를 base^i로 계산하여 더한다.
        }
        System.out.print(Decimal);
    }
}