public class early_time_check {
    public static void main(String[] args) {
        System.out.println(setAlarm(10,10));
        System.out.println(setAlarm(0,30));
        System.out.println(setAlarm(23,40));
        System.out.println(setAlarm(23,59));

    }

    public static int setAlarm (int H, int M) {

     M=M-45;

     if (M<0) {
         H-=1;
         M+=60;
     }
     if (H<0) {
         H=23;
     }
    return 0;}
}
