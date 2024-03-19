/* 02 differences from regular array */

const arr = [
  '조먹밥',
  20,
  true,
  null,
  undefined,
  NaN,
  Infinity,
  [],
  {},
  function () { }
];

console.log(arr);

/* 
 writable - true면 값 수정 가능 (아니면 읽기만 가능)
 enumerable - true면 반복문 설정해 나열 가능 (아니면 반복문 활용 시 포함 안 됨)
 configurable - true면 프로퍼티 삭제 가능 (아니면 삭제 불가능)
*/
console.log(Object.getOwnPropertyDescriptors([1, 2, 3]));