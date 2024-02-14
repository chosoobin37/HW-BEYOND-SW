package com.ohgiraffers.section01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    /* 설명.
     *  타겟 클래스의 메소드에서 Advice를 적용할 수 있는 지점들 -> JoinPoint
     *  PointCut -> 여러 JoinPoint들에 Advice를 적용할 곳 지정한 것
     *  해당 JoinPoint에서 Advice 동작
     *  -
     *  PointCut 표현식
     *  execution([수식어] returnType [클래스 이름].이름(파라미터))
     *  1) 수식어 -> pub;lic, private 등 수식어 명시 (생략 가능)
     *  2) 리턴 타입 -> 리턴 타입 명시
     *  3) 클래스 이름 (패키지명 포함) -> 메소드의 파라미터 명시
     *  4) 파라미터 (매개변수) -> 메소드의 파라미터 명시
     *  5) " * " -> 1개이면서 모든 값이 올 수 있음
     *  6) " .. " -> 0개 이상의 모든 값이 올 수 있음
     *  -
     *  ex)
     *  execution(public Integer com.ohgiraffers.section01.advice.*.*(*))
     *  -> com.ohgiraffers.section01.advice 패키지에 속해 있는 바로 다음 하위 클래스에
     *  파라미터가 1개인 모든 메소드이자 접근 제어자가 puyblic이고 반환형이 Intger인 경우
     *  -
     *  execution (* com.ohgiraffers.section01.advice.annotation..stu*(..))
     *  -> com.ohgiraffers.section01.advice 패키지 및 하위 패키지에 속해있고 
     *  이름이 stu로 시작하는 파라미터가 0개 이상인 모든 메소드이며 접근 제어자 및 반환형 상관 X
     * */

    @Pointcut("execution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    public void logPointCut() {
    }

    //    @Before("execution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    @Before("LoggingAspect.logPointCut()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before Advice 동작 ...");
    }
}
