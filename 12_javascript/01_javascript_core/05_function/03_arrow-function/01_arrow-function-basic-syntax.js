/* 01 arrow function basic syntax */

/* 기존 함수 표현식 */
var message = function () {
  return 'Hello World!';
};

console.log(message());

/* function 키워드 생략 및 화살표로 표기 */
message = () => {
  return 'Arrow Function!';
}

console.log(message());

/* 함수 실행 구문이 하나만 있는 경우 중괄호 생략 가능 */
/* 함수 내부의 명령문이 값으로 평가될 수 있는 표현식일 경우 암묵적으로 반환 -> return 생략 가능 */
message = () => "Arrow Function!";

message= () => 1+2;

console.log(message());

message=(val1, val2) => "Arrow"+val1+val2;
console.log(message('Function', '!'));

/* 화살표 함수의 매개변수가 없거나 2개 이상일 경우 -> 소괄호 생략 불가능
   매개변수 1개인 경우 소괄호도 생략 가능
 */
message = val => "Arrow" + val;
console.log(message('Functions are good'));