public class check_quadrant {
    public static void main(String[] args) {
        System.out.println(check_quadrant(12, 5));
        System.out.println(check_quadrant(9, -13));
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