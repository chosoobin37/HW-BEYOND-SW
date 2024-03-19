/* 02 various usage (다양한 사용법) */

let user = {};
[user.firstName, user.lastName] = 'muckbab cho'.split(' ');
console.log(user);

/* 일치하지 않는 나머지(rset) 요소를 한번에 가져오기 */
let [sign1,sign2,...rset] = ['양자리','황소자리','쌍둥이자리','게자리','사자자리'];

console.log(sign1);
console.log(sign2);
console.log(rset);

/* 변수 교환 용도로 사용 가능 */
let student = '조먹밥';
let teacher = '조수빈';

[student, teacher] = [teacher, student];
console.log(`학생: ${student}, 교사:${teacher}`);

/* 기본 값 설정 및 사용 */
let [firstName4 = '루동', lastName4 = '이']=['루판'];
console.log(firstName4);
console.log(lastName4);

