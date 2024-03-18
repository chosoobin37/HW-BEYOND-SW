/* 03 nested function (중첩 함수) */

/*
 내부함수(중첩함수) -> 함수 내부에 정의된 함수
 외부함수 -> 중첩 함수를 포함하는 함수
 일반적으로 중첩 함수는 자신을 포함하는 외부 함수를 돕는 헬퍼(helper) 함수 역할
 */

function outer() {
  var outerVal = '외부함수';

  function inner() {
    var innerVal = '내부함수';
    console.log(outerVal, innerVal);
  }
  inner();
}

outer();