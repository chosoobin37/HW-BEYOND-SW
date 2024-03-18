/* 01 function definition */

/* function declartion (함수 선언문) */
function hello(name) {
  return `${name}님 안녕하세요.`;
}

console.log(hello('조먹밥'));

/* function expression (함수 표현식) */

/*
  자바 스크립트의 함수는 객체 타입의 값으로 값의 성질을 갖는 객체 -> 일급 객체 
  함수는 일급 객체이므로 함수 리터럴로 생성한 함수 객체를 변수에 할당 가능
 */
var hello2 = function (name) {
  return `${name}님 안녕하세요.`;
};

console.log(hello2('이루비'));
// console.log(abc('이루비2'));