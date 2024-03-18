/* 02 function hoisting */

console.log(hello('조먹밥'));

/* 함수 선언문(js 코드 상에서 먼저 해석됨, 반드시 이름이 있어야 함, 익명 함수 hoisting 불가능) */
function hello(name) {
  return `${name}님 반갑습니다.`;
}

/* 함수 표현식 */
var hi =function (name) { 
  return `${name}님 하이루 방가방가.`;
}

console.log(`함수 표현식 이후: ${hi('조먹밥')}`);

/* 
  함수 선언문은 런타임 이전 자바스크립트 엔진에 의해 먼저 해석
  함수 선언문 이전에 함수를 참조 및 호출 가능
  함수 선언문이 코드의 선두로 끌어 올려진 것처럼 동작하는 자바 스크립트 고유의 특징
  -> 호이스팅 (hoisting)
 */
