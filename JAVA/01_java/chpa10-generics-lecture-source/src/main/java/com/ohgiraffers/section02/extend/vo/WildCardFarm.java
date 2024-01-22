package com.ohgiraffers.section02.extend.vo;

import com.ohgiraffers.section02.extend.vo.Bunny;
import com.ohgiraffers.section02.extend.vo.RabbitFarm;

/* 필기.
 *  와일드카드 (Wildcard) -> generic class 타입의 객체를 메소드의 매개변수로 받을 때 타입 변수 제한 가능
 *  <?> 제한 없음
 *  <? extends Type> 와일드카드의 상한 제한 (Type과 Type의 후손을 이용해 생성된 제네릭 인스턴스만 가능)
 *  <? super Type> 와일드카드의 하한 제한 (Type과 Type의 부모를 이용해 생성된 제네릭 인스턴스만 가능)
* */

public class WildCardFarm {
    
    /* 설명. 어떤 타입의 RabbitFarm(generic type)이 와도 무관 */
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }
    /* 설명. RabbitFarm 중에서도 Bunny 또는 Bunny 하위 타입이 있는 RabbitFarm만 가능
    *   -> Bunny generic의 농장만 가능 */
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }
    /* 설명. RabbitFarm 중에서도 Bunny 또는 Bunny 상위 타입이 있는 RabbitFarm만 가능 
    *   -> Bunny이거나 Rabbit generic의 농장만 가능*/
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }
}
