package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceCollection")
public class PokemonService {

    /* 설명. 같은 타입의 bean이 2개 이상일 경우, List 또는 Map 형태의 Collection 형태로 주입 받기 가능 */

    /* 필기. 1) 같은 타입의 번들을 List 형태로 주입 받기 가능 */ 
//    private List<Pokemon> pokemonList;
//
//    @Autowired
//    public PokemonService(List<Pokemon> pokemonList) {
//        this.pokemonList = pokemonList;
//    }
//    public void pokemonAttack() {
//        pokemonList.forEach(Pokemon::attack);
//    }

    /* 필기. 2) 같은 타입의 번들을 map 형태로 주입 받기 가능 */
    private Map<String, Pokemon> pokemonMap;

    @Autowired
    public PokemonService(Map<String, Pokemon> pokemonMap) {
        this.pokemonMap = pokemonMap;
    }

    /* 설명. key 값 -> bean id 넘어옴, value 값 -> bean 객체의 주소값 넘어옴 */
    public void pokemonAttack() {
        pokemonMap.forEach((k, v) -> {
            System.out.println("key = " + k);
            System.out.println("value = " + v);
            v.attack();
        }) ;
    }
}
