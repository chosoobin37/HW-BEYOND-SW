/* 04 undefined and null */

/* undefined 타입 */
/*
  var 키워드로 선언한 변수는 암묵적으로 undefinded로 초기화
  변수를 선언한 이후 값을 할당하지 않는 변수는 undefined 지니고 있다
  개발자가 의도적으로 변수에 할당하는 것은 본래 취지와 어긋나고 혼란을 줄 수 있으므로 지양
 */

var undef;
console.log(typeof undef);

/* null 타입 */
/* 변수에 값이 없다는 걸 의도적으로 명시할 때 사용 */
var nullVal;
nullVal = null;      // 이전 참조를 제거하여 더이상 something 참조 x
console.log(nullVal);

