/* 01 property */

/*  객체는 프로퍼티의 집합이며, 프로퍼티는 키와 값으로 구성 */

var obj = {
  normal: 'normal value',
  '@ s p a c e @': 'space value',   // 띄어쓰기나 특수기호(_, $ 제외) 사용 시 '' 로 프로퍼티명 지정(권장x)
  ' ': ' ', //                      // 숫자인 프로퍼티 키 -> 내부적으로 문자열로 변환
  0: 1,
  var: 'var',                       // 예약어 키 -> 오류는 없지만 권장x
  normal: 'new value'               // 이미 존재하는 키 중복 선언 -> 나중에 선언한 프로퍼티가 덮어씀
};

/* 동적 프로퍼티 추가 구문(기존에 없는 프로퍼티에 접근하면 프로퍼티 생성) */
obj.test = 'test value';

// var key = "test";
// obj[key] = 'test value';

console.log(obj.test);
console.log(obj.normal);