import java.util.Scanner;

public class baekjoon_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(checkYear(year));
    }

    public static int checkYear(int year) {
        return (year % 4 == 0) ? 1 : 2;
    }
}
