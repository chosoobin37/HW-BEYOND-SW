import java.util.Scanner;

public class prac01_dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = dice(a, b);
        System.out.println(result);

    }

    public static int dice(int a, int b) {
        int answer=0;
        if (a % 2 == 00 && b % 2 == 0) {
            answer = a * a + b * b;
        } else if (a % 2 != 0 || b % 2 != 00) {
            answer = 2 * (a + b);
        } else {
            answer=Math.abs(a-b);
        }
        return answer;
    }
}
