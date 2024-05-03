import java.io.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int base = Integer.parseInt(tokens[1]);
        String N = tokens[0];
        int number = Integer.parseInt(N);
        ArrayList<String> list = new ArrayList<>();
        
        while (number > 0) {
            int remainder = number % base;
            if (remainder >= 10) {
                String digit = String.valueOf((char) (remainder - 10 + 'A'));
                list.add(0, digit);
            } else {
                String digit = String.valueOf(remainder);
                list.add(0, digit);
            }
            number /= base;
        }
        
        for(String digit:list){
            System.out.print(digit);
        }
    }
}
