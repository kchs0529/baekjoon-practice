import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a,b;
        while(true){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0){
                break;
            }
            bw.write(String.valueOf(a+b)); //sum 값을 문자열로 변환하여 쓰기
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}