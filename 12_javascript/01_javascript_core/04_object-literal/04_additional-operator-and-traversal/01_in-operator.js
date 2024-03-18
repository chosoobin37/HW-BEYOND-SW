/* 01 in operator (in 연산자) */
/* 프로퍼티 존재 여부 확인 */
var student = {
  name: '조먹밥',
  age: 3,
  test: undefined
};

console.log('name' in student);
console.log('height' in student);
console.log('test' in student);

/* for-in문 */
/* 객체의 모든 프로퍼티 키 순회 */
for (var key in student) { 
  console.log(`key : ${key}`);
  console.log('student[${key}]: ${student[key]}');    // 대괄호 표기법으로 접근하지만 key 변수이므로
  // 홑따옴표 x
  
  console.log(`<td>${student[key]}</td>`);
}