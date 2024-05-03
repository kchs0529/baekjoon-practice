import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0;i<N;i++){
           if(arr[i]==num){
               count++;
           } 
        }
        System.out.print(count);
    }
}