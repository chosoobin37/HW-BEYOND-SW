/* 01 array and object copy */

/* 1 배열 복사 */
let arr = [10, 20, 30];
let arrCopy = [...arr];     // 스프레드 문법을 활용한 깊은 복사

console.log(arr);
console.log(arrCopy);
console.log(arr===arrCopy);

/* 2 객체 복사 */
let obj = {name: '조먹밥', age: 20};
let objCopy = { ...obj };   // 사본 만들기

/* 추가적으로 나머지 연산자 개념으로 활용 가능 */
// let age = 5;
// let name = '이루비';
// let objCopy = {...obj, age, name};

console.log(obj);
console.log(objCopy);
console.log(obj===objCopy);
