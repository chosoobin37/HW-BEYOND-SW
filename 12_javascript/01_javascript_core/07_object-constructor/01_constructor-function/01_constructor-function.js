/* 01 constructor function (생성자 함수) */

/* 1 객체 리터럴 방식 */
const student1 = {
  name: '조먹밥',
  age: 3,
  getInfo: function () {
    return `${this.name}은  ${this.age}세입니다.`;
  }
}

const student2 = {
  name: '이루비',
  age: 2,
  getInfo: function () {
    return `${this.name}은  ${this.age}세입니다.`;
  }
}

/* 객체 리처럴 방식으로 수백명의 학생 객체를 만들어야 하는 경우 */

/* 2 생성자 함수 방식 */
/* 
  객체를 생성화기 위한 프로퍼티들을 하나의 템플릿 개념으로 생성자 함수로써 작성 시
  동일한 프로퍼티를 가지는 여러 객체들 쉽게 생성 가능
*/
function Student(name, age) {
  // console.log('생성자 함수 안의 this:',this);

  /* 이 생성자 함수를 통해 생성될 객체 -> this  */
  this.name = name;
  this.age = age;
  this.getInfo = function () {
    
    /* 메소드를 호출한 객체가 this */
    return `${this.name}은  ${this.age}세입니다.`;
  }
}

/* 각 개체의 메소드 호출 */
const student3 = new Student('이루동', 1);
const student4 = new Student('이루판', 1);

console.log(student3.getInfo());
console.log(student4.getInfo());
