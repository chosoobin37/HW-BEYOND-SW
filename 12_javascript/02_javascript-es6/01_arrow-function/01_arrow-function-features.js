/* 01 arrow function feature */

/* 1 화살표 함수는 자체적으로 this를 가지지 않음 -> 화살표 함수를 호출한 객체의 의미X */
/* 객체의 메소드 안에서 동일한 객체의 프로퍼티를 대상으로 콜백 함수를 적용할 때 사용 가능 */
let theater = {
  store: '강남점',
  titles: ['파묘', 'Dune2', '웡카', '가여운 것들', '쥬라기월드'],

  showMovieList() {
    console.log(this.store);

    // forEachj:Array에서 제공하는 메소드로 배열의 요소별로 들어가면 콜백 함수를 실행하는 함수
    this.titles.forEach(
      title => console.log(this.store + ': ' + title)
    );

    // this.titles.forEach(
    //     function (title) {
    //     console.log(this.store + ": " + title);
    //   });
  }
}

theater.showMovieList();


/* 2 화살표 함수는 new와 함께 호출 불가능 */
/* 생성자 함수로 쓰지 않는 일반 함수는 화살표 함수로 만듦 -> 객체 생성 X */
const arrowFunc = () => { };

const normalFunc = function () {
  
};
 
// new arrowFunc();
new normalFunc();

/* 3 화살표 함수는 arguments 지원 X */
let test = function () {
  console.log(arguments);
  const arrowFunc = () => console.log(arguments);
  arrowFunc(10, 20);
}

test(1, 2, 3, 4, 5);

/* 화살표 함수는 다른 함수의 인자로 전달되어 콜백함수로 사용되는 경우가 많다.
  위와 같은 특징들은 콜백 함수의 내부의 this가 외부 함수의 this와 다르기 때문에 발생하는 문제를 해결하기 위해
  의도적으로 설계된 것이라 할 수 있다 -> arguments도 마찬가지
  따라서 화살표 함수를 사용할 때는 어느정도 개념을 정확히 인지하고 사용해야 함
*/