/* 01 object distructing assignment basic sytnax (객체 구조분해 할당 기본 문법) */

let pants = {
  productName: '배기진',
  color: '검정',
  price: 50000,
  getInfo() {
    console.log(this.productName,"쭈아");
  }
}; 

// let productName = pants.productName;
// let color = pants.color;
// let price = pants.price;

// let { productName, color, price } = pants;
// let {color, productName,  price } = pants;
let { productName, color, price, getInfo } = pants;

console.log(productName, color, price, getInfo);
console.log(getInfo);
getInfo()

/* 객체 구조분해 할당으로 꺼낸 변수 대신 다른 걸 쓰고 싶은 경우 */
let {color: co, price: pr, productName:pn} = pants;
console.log(co, pr, pn);
