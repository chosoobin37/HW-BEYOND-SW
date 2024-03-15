/* 01 objext (객체)*/

/*
  자바스크립트는 객체 기반 프로그래밍 언어로 원시 값을 제외한 나머지 값
  함수, 배열, 정규 표현식 등
*/

var student = {

  /* 키: 값의 쌍으로 구성 된 프로퍼티(속성) */
  name: '조먹밥',
  age: 3,

  /* 메소드: 프로퍼티(상태 데이터)를 참조하고 조작할 수 있는 동작(behivior)ㄴ  */
  getInfo: function () {
    return `${this.name}은  ${this.age}세입니다.`;
  }
};      // 리터럴 객체의 중괄호는 코드 블록(if, for문의 중괄호)과는 다름 -> 세미콜론 

console.log(student);
console.log(typeof student);

console.log(student.getInfo);
console.log(student.getInfo());

student.name = '이루비';
console.log(student.getInfo());