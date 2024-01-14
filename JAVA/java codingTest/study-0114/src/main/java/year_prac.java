public class year_prac {
        public static void main(String[] args) {
            System.out.println(checkYear(2000));
            System.out.println(checkYear(2001));
        }

        public static int checkYear(int year) {
            return (year % 4 == 0) ? 1 : 2;}
}

