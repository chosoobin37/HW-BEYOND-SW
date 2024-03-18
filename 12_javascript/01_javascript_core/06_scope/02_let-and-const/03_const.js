/* 03 const(상수) */

const x=1;     // 상수는 선언과 동시에 초기화 해주어야 함

x = 2;


/* 일반적으로 상수는 대문자 및 스네이크 표기법(_)으로 표기 */
const DISCOUNT_RATE = 0.15;

let price = 15000;    // 정가

let discountPrice = price * (1 - DISCOUNT_RATE);  // 할인율이 적용된 할인가
console.log(discountPrice);

/*
  ES6 이후라면 var 키워드 사용 X
  재할당이 필요한 경우 한정 let 키워드 사용
  변경 발생하지 않고 읽기 전용으로 사용하는 원시 값 또는 객체 -> const 키워드 사용
  const 키워드 -> 재할당 금지, var 및 let보다 안전
*/

/* 
  가능한한 전역 변수보다는 지역변수 사용 권장 
-> 전역 변수는 생명주기가 길고 계속 존재, 리소스 낭비 가능성 존재
*/