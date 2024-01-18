package com.ohgiraffers.section01.polymorphism;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 다형성 및 타입 형변환 이해 */

        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        /* 설명. 다형성 적용 -> 부모 타입으로 자식 인스턴스의 주소값 저장 */
        Animal an1 = new Tiger();           // 다형성 적용 O
        Animal an2 = new Rabbit();          // 다형성 적용 O
        Animal an3 = new Animal();          // 다형성 적용 X

        /* 설명. Animal은 Tiger나 Rabbit이 아님 -> Animal은 Tiger이나 Rabbit 타입 지니지 X */
//        Tiger tiger1 = new Animal();
//        Rabbit rabbit1 = new Animal();

        /* 설명. 동적바인딩 확인 */
        /* 필기.
         *  컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가,
         *  런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어 동작
         *  동적바인딩 조건 1) 상속 2) 오버라이딩
        * */

        // runtime 시점에 자식의 overriding된 메소드를 찾아서 자식의 method로 실행
        // 1. 상속 2. 오버라이딩
        System.out.println(" ===== 동적 바인딩 확인 =====");
        an1.cry();
        an2.cry();

        /* 설명. 오버라이딩 되지 않은(추가한 메소드) 메소드 호출 -> 다운캐스팅 필요 */
        if(an1 instanceof Tiger) {
            ((Tiger)an1).bite();
        }
        if (an1 instanceof Rabbit) {
            ((Rabbit)an1).jump();
        }


    }
}
