import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int cross_count=1;//해당 범위의 대각선 칸 개수(분자와 분모의 합-1)
        int sum=0; //해당 대각선 직전 대각선까지의 칸의 합
        //X-sum은 해당 대각선에서 몇번째 칸인지 확인
        while(true){
            if(X<=cross_count+sum){
                if(cross_count%2==1){
                    // 분자가 큰 수부터 시작
					// 분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
					// 분모는 X 번째 - 직전 대각선까지의 블럭 개수
					System.out.print((cross_count - (X - sum - 1)) + "/" + (X - sum));
                    break;
                }else{
                    //분모가 큰 수부터시작
                    System.out.print((X - sum) + "/" + (cross_count-(X-sum-1)));
                    break;
                }
            }else{
                sum+=cross_count;
                cross_count++;
            }
            
        }
    }
}