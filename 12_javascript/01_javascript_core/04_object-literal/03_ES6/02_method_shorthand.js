/* 02 method shorthand (메소드 단축) */

var dog = {
  name: '비비',
  eat: function (food) {
    console.log(`${food}를 먹는다.`);
  }
};

dog.eat('사과');

/* ES6 이후부터는 메소드를 정의할 때 콜론(:)과 function 키워드 생략한 축약 표현 사용 가능 */
var dog2 = {
  name: '비비',
  eat(food) {
    console.log(`${food}를 먹는다.`);
  }
};

dog2.eat('고구마');
