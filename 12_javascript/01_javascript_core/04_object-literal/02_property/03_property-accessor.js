/* 03 property accessor */

var dog = {
  name: '푸바오',
  eat: function (food) {
    console.log(`${this.name}는 ${food}를 먹습니다.`);

    return '잘 먹었네';
  }
};

/* 1. 마침표 표기법 dot notation */
console.log(dog.name);
dog.eat('고구마말랭이');

/* 2. 대괄호 표기법 (square braket notation) */
console.log(dog['name']);
dog['eat']('사과');

/* 대괄호 표기법만 가능한 경우 */
var obj = {
  'dash-key': 'dash-key-value',
  0: 1
}

/* 프로퍼티 키가 식별자 네이밍 규칙을 준수하지 않은 이름일 경우 반드시 대괄호 표기법 사용 */
// console.log(obj.dash-key);
// console.log(obj.'dash-key');
// console.log(obj[dash-key]);
console.log(obj['dash-key']);

/* 프로퍼티 키가 숫자로 이루어진 경우 홑따옴표를 생략한 대괄호 표기법도 가능하지만 가능하면 홑따옴표 붙일 것 */
// console.log(obj.0);
// console.log(obj.'0');
console.log(obj[0]);
console.log(obj['0']);