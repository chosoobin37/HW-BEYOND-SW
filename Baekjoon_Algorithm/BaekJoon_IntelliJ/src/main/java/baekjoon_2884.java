
import java.util.Scanner;

public class baekjoon_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if( hour != 0){
            if (min < 45) {
                hour -= 1;
                min = (min-45)+60;
            } else if (min >= 45) {
                min = min - 45;
            }
        } else {
            if (min < 45) {
                hour = 23;
                min = (min-45)+60;
            } else if (min >= 45) {
                min = min - 45;
            }
        }
        System.out.println(hour + " " + min);
    }
}