public class if_prac {
    public static void main(String[] args) {

        class Solution {
            public int solution(int a, int b) {
                int answer = 0;
                if (a%2!=0&&b%2!=00) {
                    answer=a*a+b*b;
                }
                else if (a%2!=0||b%2!=00) {
                    answer=2*(a+b);
                }
                else if (a%2==0&&b%2==00) {
                    answer = Math.abs(a-b);
                }
                return answer;
            }
        }

    }
}
