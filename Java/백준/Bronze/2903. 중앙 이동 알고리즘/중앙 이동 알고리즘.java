import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int point = 2;
        for(int i = 1; i<=num;i++){
            point = 2*point-1;
        }
        int result = point*point;
        System.out.print(result);
    }
}