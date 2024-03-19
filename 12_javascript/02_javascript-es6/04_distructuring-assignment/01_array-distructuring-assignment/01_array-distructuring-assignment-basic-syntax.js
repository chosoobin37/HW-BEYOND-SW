/* 01 array distructing assignment basic syntax (배열 구조 분해 할당 문법)   */
/* 구조 분해 할당을 사용해 배열이나 객체를 각각의 변수로 '분해'하여 연결(할당) 가능 */

let nameArr = ['muckbab', 'cho'];
// let firstName = nameArr[0];
// let lastName = nameArr[1];

let [firstName, lastName] = nameArr;
console.log(firstName, lastName);

/* 반환값이 배열인 메소드를 활용한 구조분해 할당 */
// let [firstName2, lastName2] = 'ruby lee'.split(' ');
let[firstName2, lastName2] ='ruby lee'.match(/[a-z]+/gi);
console.log(firstName2, lastName2);

/* 구조분해 할당 시 쉼표를 활용하여 불필요한 배열 요소 버리기 가능 */
let [firstName3, lastName3] = ['firstName', 'middleName', 'lastName'];
console.log(firstName3, lastName3);