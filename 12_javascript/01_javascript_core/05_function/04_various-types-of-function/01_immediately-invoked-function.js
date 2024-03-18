/* 01 immediately invoked function */
/* 함수 정의와 동시에 즉시 호출되는 함수로 단 한 번만 호출되며 재호출 불가 */

(function () {
  console.log(' 익명 즉시 실행함수! 함수 정의와 동시에 호출!');
})();

(function hello(name) {
  console.log("기명 즉시 실행함수! 함수 정의와 동시에 호출!");
  console.log(`${name}님 안녕하세요!`);
})('조먹밥'); 

// hello('조먹밥');

/* 즉시 실행 함수 내에 코드를 모아두면 호기 있을 수도 있는 변수나 함수의 이름 충돌 방지 가능 */
/* 별도로 다시 호출할 일이 없는 함수일 경우 작성 */