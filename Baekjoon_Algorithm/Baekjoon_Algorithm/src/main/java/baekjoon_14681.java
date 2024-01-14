import java.util.Scanner;

public class baekjoon_14681 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
    }
    public static int check_quadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        }
        return 0;
    }
}