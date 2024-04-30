import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);
        int time = sc.nextInt();
        int timeHour,timeMinute;
        timeHour=time/60;
        timeMinute = time%60;
        hour = hour + timeHour;
        minute = minute + timeMinute;
        
        if(minute>=60){
            hour = hour+1;
            minute = minute - 60;
        }
        if(hour>=24){
            hour = hour-24;
        }
        
        System.out.print(hour+" "+minute);
    }
}