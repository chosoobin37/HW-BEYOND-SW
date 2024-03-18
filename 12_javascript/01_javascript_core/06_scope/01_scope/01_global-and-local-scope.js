/* 01 global and local scope (전역 및 지역 스코프) */

var x= 'global x';
var y = 'global y';

function outer() {
  var z = 'outer is local z';

  console.log(x);
  console.log(y);
  console.log(z);

  function inner() {
    var x = 'inner is local x';

    console.log(x);
    console.log(y);
    console.log(z);

  }

  inner();
}

outer();

/* 스코프 체인 */

/* 
  전역 스코프 -> outer 지역 스코프 -> inner 지역 스코프 순으로 우선순위 결정
  모든 스코프 -> 하나의 계층적 구조로 연결되며 자바 스크립트 엔진은 스코프 체인을 통해 변수를 참조하는 코드의
  스코프에서 시작하여 상위 스코프 방향으로 이동하여 선언된 변수 검색
  하위 스코프에서 유효한 변수를 상위 스코프에서 참조 불가능
*/