/* 01 shortcut circuit evaluation (논리 연산자) */

/* 표현식을 평가하는 도중 평가 결과가 확정된 경우 나머지 평가 과정 생략 */

/* 1 OR */
console.log('apple'||'banana');     // apple, true || true
console.log('' || 'banana');        // banana
console.log('apple' || false);         // apple

/* 2 AND */
console.log('apple' && 'banana'); 
console.log(false && 'banana'); 
console.log('apple' && false); 

var num = 2;

// if (num % 2 == 0) {
//   console.log('짝수입니다.');
// } else {
//   console.log('홀수입니다.');
// }

/* 단축 평가를 활용하여 같은 결과 */
num%2==0 && console.log('짝수입니다.');
num%2==0 || console.log('홀수입니다.');