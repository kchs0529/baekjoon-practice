import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nx = br.readLine().split(" ");
        int n = Integer.parseInt(nx[0]);
        int x = Integer.parseInt(nx[1]);
        String[] numStr = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(numStr[i]);
            if(num<x){
                System.out.print(num+" ");
            }
        }
        
    }
}