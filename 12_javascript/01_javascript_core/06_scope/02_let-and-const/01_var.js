/* 01 var */

/* 1 변수 중복 선언 */
var msg = '안녕하세요';
console.log(msg);

var msg = '안녕히 가세요';
console.log(msg);

var msg;
console.log(msg);   // 초기화 하지 않은 중복된 변수 -> 무시

/* 2 함수 레벨 스코프르 가지는 문제 */
/* 앞서 살펴봄 */

/*3 변수 호이스팅 */
/*
 var 키워드로 변수를 선언하면 변수 호이스팅에 의해 변수 선언문이 스코프의 선두로 끌어올려짐
 즉, 변수 선언문 이전에 참조 가능
 이는 오류가 발생하지는 않지만, 프로그램의 흐름에 맞지 않고 가동성 저하
*/
console.log(test);

test = '테스트';
var test ;