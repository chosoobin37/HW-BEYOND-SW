/* 02 method */
/* 자바 스크립트의 함수는 객체이다. 함수는 값으로 취급할 수 있고, 프로퍼치 값으로 사용할 수도 있다. */

var name = '비비';

var dog = {
  name: '뽀삐',
  eat: function (food) {
    // console.log(`${name}는 ${food}를 먹습니다.`);   // this. 없으면 전역변수 호출
    console.log(`${this.name}는 ${food}를 먹습니다.`);   // 메소드에서의 this. -> 메소드 호출 객체

    return '잘 먹었네';
  }
};

console.log(dog.eat('고구마'));


