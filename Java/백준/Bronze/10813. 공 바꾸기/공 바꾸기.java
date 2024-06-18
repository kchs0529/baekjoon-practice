import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N + 1]; // 1부터 N까지의 바구니 번호
        
        // 바구니 초기화: 각 바구니에 초기 번호 설정
        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }
        
        // 공을 교환하는 과정
        for (int i = 0; i < M; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            
            // 바구니 공 교환
            int temp = basket[first];
            basket[first] = basket[second];
            basket[second] = temp;
        }
        
        // 결과 출력: 1부터 N까지의 바구니 번호 출력
        for (int i = 1; i <= N; i++) {
            System.out.print(basket[i] + " ");
        }
        
        sc.close();
    }
}
