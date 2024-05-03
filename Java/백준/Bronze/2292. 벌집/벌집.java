import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1; // 처음 방(1번 방)부터 시작
        
        if (num == 1) {
            System.out.print(1);
            return;
        }
        
        int range = 1; // 방 번호의 범위
        int step = 6; // 각 층의 방의 개수
        
        // 범위 안에 들어올 때까지 반복하여 범위를 증가시킴
        while (num > range) {
            range += step;
            step += 6; // 다음 층의 방의 개수는 6의 배수로 증가
            count++; // 층 수 증가
        }
        
        System.out.print(count);
    }
}
