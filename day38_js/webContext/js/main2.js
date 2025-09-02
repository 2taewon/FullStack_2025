/* main2.js */

import getType, {userRandom} from './getType.js'
// default가 붙어있으면 {}가 필요없음. 

const a = 'MSA_th2';
//split : 문자를 인수 기준으로 쪼개서 배열로 반환.
//reverse : 배열을 뒤집기
//join : 배열을 인수 기준으로 문자로 병합해 반환.
const b = a.split('').reverse.join(''); // 메서드체이닝
console.log(a);
console.log(b);

// ---------------------------------------------
const boxEl2 = document.querySelector('.box');
console.log(boxEl2);

// Getter, 값을 얻는 용도
console.log(boxEl2.textContent); //Bo
// Setter, 값을 셋팅(지정)하는 용도
boxEl2.textContent = 'yuna!'
console.log(boxEl2.textContent); 


// 반복문
// for(시작값; 조건; 증감식) {반복 구문}
for(let i = 1; i<=100; i+=2){
	console.log(i);
}
console.log(typeof 'hello world!');
console.log(typeof 123);
console.log(typeof true);
console.log(typeof null);

console.log("***************");
console.log(getType(123));
console.log(getType(false));
console.log(getType([]));
console.log(getType(null));

// 산술 연산자
let x = 2
x += 1;
console.log(x);

// 비교 연산자
const y = 1;
const z = '1';
console.log(y == z); // 동등 
console.log(y === z); // 일치 - 자료형(타입)까지 비교 

function isEquals(x,y){
	return x === y;
}
console.log(isEquals(4, 5));
console.log(isEquals(1, 2));
console.log(isEquals(1, 1));
console.log(isEquals(1, '1'));
console.log(y !== z);

// 삼항(조건)연산자
const f = 1 < 2;

if(f) console.log('참');
else console.log('거짓');

console.log(f ? '참':'거짓');

console.log(Math.random() * 10);
console.log(Math.floor(Math.random() * 10));

const func = userRandom(); // 사용자가 만든 js 파일 
console.log(func);

//HTML 요소(Element) 1개 검색 / 찾기

const boxEls = document.querySelectorAll('.box');
console.log(boxEls)

// 찾은 요소 반복해서 함수 실행 - 익명함수 추가
// boxEls.forEach(function(1, 2, 3){} // 1. 반복죽인 요소값, 2. 인덱스, 3 . 전체요소

boxEls.forEach(function(item, index){
	item.classList.add(`order-${index+1}`)
	console.log(index, item);
});

const boxEl = document.querySelector('.box');
console.log(boxEl);

// HTML 요소에 적용할 수 있는 메소드 
// 인수(Arguments)를 추가 가능
// boxEl.addEventListener(1,2); 1:event, 2:할일
boxEl.addEventListener('click', function(){
	console.log('Click~');
	boxEl.classList.add('active');
	boxEl.classList.add('active');
	console.log(boxEl.classList.contains('active'));
	boxEl.classList.remove('active');	
});

let isShow = true;
let checked = false;

if(isShow){
	console.log('show');
}

if(func == 2){
	console.log('func is 2');
}
else if (func === 9){
	console.log('func is 9');
}
else if (func === 5){
	console.log('func is 5');
}
else {
	console.log('rest...');
}