/* 02 문자열 타입 */

var str = '안녕하세요';
console.log(str);

/* 일반 문자열 내에서는 줄바꿈 허용 X */
// var str2 = '안녕하세요.
// 반갑습니다';

/* 백틱 ` 사용 시 줄바꿈 허용, 모든 공백 있는 그대로 적용 */
var str2 = `안녕하세요.
반갑습니다.`;

console.log('multiline: ', str2);

/* 문자열 이어붙이기 */
var lastname='조';
var firstname='먹밥';
console.log('제 이름은 '+lastname+' '+firstname+'입니다.');

/* 표현식 삽입(${})과 백틱 동시 사용 시 문자열 연산보다 가독성 좋고 간편하게 조합 가능 */
console.log(`제 이름은 ${lastname}${firstname}${1+2}입니다.`);



