/* 02 nullish coalescing operator */

/*
ECMA11(ECMAScript2020)에서 도입된 연산자로 좌항의 연산자가 null 또는 undefined인 경우
우항의 피연산자를 반환하고, 그렇지 않으면 좌항의 피연산자 반환
변수에 기본 값 설정 시 유용
*/

var test = null ?? '기본값';
console.log('test', test);

var value1 = '' || '기본값';
var value2 = '' ?? '기본값';
console.log('value1', value1);
console.log('value2', value2);
