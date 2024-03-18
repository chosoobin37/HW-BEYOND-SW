/* 02 recursive function (재귀 함수) */
/* 함수가 자기 자신을 호출 -> 재귀호출 */

function factorial(num) {
  if (num <= 1) return 1;
  return num * factorial(num - 1);
}

console.log(factorial(1));
console.log(factorial(2));
console.log(factorial(3));
console.log(factorial(4));
console.log(factorial(5));

/*
  재귀 함수는 반복처리를 반복문 없이 구현할 수 있고 추가 변수 사용하지 않아도 되는 장점 
  무한 반복에 빠질 위험이 있고, 이로 인해 스택 오버플로우 에러 발생 주의
  한정적으로 사용하는 것이 바람직
 */