/* 02 result (반환문) */

function hello(name) {
  return `${name}님 안녕하세요!`;
  console.log(name);  // 반환문 이후의 코드는 실행되지 않고 무시
}

console.log(hello('조먹밥'));

function func() {
  console.log('함수가 호출되었습니다.');

  /* 반환값을 명시적으로 지정하지 않거나 생력하면 undefined 반환 */
  // return;
}

console.log(func());