/* main.js */
//var vs let vs const

let fruits = ['Apple', 'Banana', 'Cherry'];
console.log(fruits[0])
console.log(fruits[1],",", fruits[2])

console.log(new Date("2025-05-14"));
console.log(new Date("2025-05-02").getDay());
console.log(new Date("2025-05-14").getFullYear());

// 	String(문자 데이터) : 따옴표를 사용한다.
let myName = 'TW';
let email = 'tw@naver.com'
// let hap = '안녕하세요' + myName + '입니다.';
let hap = `안녕하세요 ${myName} 입니다.`;

console.log(myName);
console.log(email);
console.log(hap);
console.log(`my mail ${email} 여기로 연락`);


// Number(숫자 데이터) : 정수 및 부동소숫점 숫자,....
let num = 100;
console.log(num);
num = 99;
console.log(num)
let opacity = 1.34;
console.log(opacity);

//Boolean(불린 데이터) : (true, false 논리데이터)
let checked = true;
let isShow = false;
console.log(checked)
console.log(isShow)

//Undefined : 값이 할당되지 않은 상태
let undef; // 초기화 되어있지 않으면...
console.log(undef);
let obj = {pass : 1234, pwd : 'abc'}
console.log(obj.pass)
console.log(obj.pwd)
console.log(obj.id) // undefined

// null : 어떤 값이 의도적으로 비어있음을 의미.
let empty = null;
console.log(empty) // null

// Object(객체데이터) : 여러 데이터를 key:value 형태를 저장(){
let user = {
	//key : value
	name : 'TW',
	age : 33,
	isvalid : true
	}
	
console.log(user)
console.log(user.isvalid)
console.log(user.age)
console.log(user.name)


//Array(배열 데이터) : 여러 데이터를 순차적으로 저장.[ ]
let fruits2 = ['Apple2', 'Banana2', 'Cherry2'];
console.log(fruits2[0])
console.log(fruits2[1])
console.log(fruits2[2])

// 변수 선언 - 재사용(재할당)이 가능
let a = 2;
let b = 5;
console.log(a+b)
console.log(a*b)
console.log(a-b)
console.log(a/b)

function myFun(){
	//실행코드
	console.log(1004);
}

// 함수 호출
myFun();

// return type method 
function returnFun(){
	return 300;
}

console.log(returnFun());
let call = returnFun();
console.log(call);

function sum(x,y){ // x, y 매개변수(Parameters)
	return x + y;
}

console.log(sum(1,2))
//재사용 
let c = sum(3, 4)
let d = sum(7, 4)
let e = sum(2, 4)

console.log(c,d,e);

function hello(){
	console.log("Hello!");
}

// 익명(이름이 없는) 함수
let world = function(){
	console.log('world~~')
}

// 함수호출
hello();
world();

// 객체 데이터
const person ={
	name : '강감찬',
	age : 85,
	//method 
	getName : function(){
		return this.name;
	},
	getAge : function(){
		return this.age;
	},
	setName:function(data){
		this.name = data;
	},
	setAge:function(data){
		this.age = data;
	}
} 

const hisName = person.getName();
console.log(hisName);

//or 
console.log(person.getAge());
console.log(person.getName());
console.log(person.age());
person.setName('가나다라')
console.log(person.getName());
person.setAge(33);
console.log(person.age);