package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.vo.*;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 와일드카드 이해 */
        WildCardFarm wildCardFarm = new WildCardFarm();
        wildCardFarm.anyType(new RabbitFarm<Rabbit>());
        wildCardFarm.anyType(new RabbitFarm<Bunny>());
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>());

        wildCardFarm.extendsType(new RabbitFarm<Bunny>());

        wildCardFarm.superType(new RabbitFarm<Rabbit>());
        wildCardFarm.superType(new RabbitFarm<Bunny>());
    }
}
