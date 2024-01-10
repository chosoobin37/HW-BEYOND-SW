package com.ohgiraffers.section02.variable;

public class Application01 {
    public static void main(String[] args) {
//        int num;
//        num=1;              // = -> 등호x 대입o  공간=literal
//        System.out.println("num = " + num);
//        System.out.println("num = " + (num+1));

            /* 수업목표. 변수의 사용 목적에 대해 이해 가능*/
            /*
            * 필기.
            *  변수 사용의 목적
            *  1 값에 의미를 부여하기 위한 목적(의미 전달이 쉬워야 코드 해석하기 쉽고, 협업 및 유지보수 용이
            *  2. 한 번에 저장해둔 값을 재사용하기 위한 목적 (변수 이용해서 코드 작성, 값 변경 용이
            *  3. 시간에 따라 변하는 값 저장 및 사용 가능 (변하는 값 저장공간)
            * */

        /* 목차. 1) 값에 의미를 부여하기 위한 목적 */
        System.out.println("======= 값에 의미 부여 test =======");
        System.out.println("보너스를 포함한 급여: " + (1000000+200000) + "원");

        int salary = 1000000;
        int bonus = 200000;
        System.out.println("보너스를 포함한 급여: " + (salary+bonus) + "원");

        /* 목차. 2) 한 번에 저장해둔 값을 재사용하기 위한 목적 */
        System.out.println("======= 변수에 저장한 값 재사용 test =======");
        /* 설명. 10명의 고객에게 100포인트를 지급해주는 내용 출력 */
        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 100포인트 지급하였습니다.\n");

        System.out.println();

        /* 설명. 위 코드에서 공통적으로 사용된 100이라고 하는 값을 변수에 넣고 변수를 호출하여 코드 개선*/
        int point = 200;
        System.out.println("1번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");


        /* 목차. 3) 시간에 따라 변경되는 값을 저장하고 사용할 목적 */
        System.out.println("======= 변수에 저장된 값 변경 test =======");
        int sum = 0;

        sum = sum+10;               // 기존에 0이 담겨있던 변수에 10이 덮어씀 -> 변수는 하나의 literal 값만 저장 가능
        System.out.println("sum에 10을 더하면 현재 sum의 값은: " + sum);

        sum = sum + 10;
        sum = sum + 10;
        sum = sum + 10;
        sum = sum + 10;
        System.out.println("sum에 10을 4번 더 누적하면 현재 sum의 값은: " + sum);

        /* 설명. 동일한 sum이라는 하나의 변수를 어느 시전에 출력하느냐에 따라 출력 결과 달라짐 -> 변수명 동일 값 다름 */
        }
    }
