/* main5.js */

// 타이머 함수
/*setTimeout(함수, 시간) : 일정한 시간 후 함수 실행
setInterval(함수, 시간) : 시간 간격마다 함수 실행 
clearTimeout() : 설정된 Timeout 함수 종료 
clearInterval() : 설정된 Interval 함수 종료 */

//콜백함수 (Callback) : 함수의 인수로 사용되는 함수 

function timeout(callback){
	setTimeout(() => {
		console.log('MSA-Th2')
		callback()
	}, 1000)
}

timeout(()=>{
	console.log('dn')
})

const timer = setInterval(() => {
	
},1000)

const h5El = document.querySelector('h5')
h5El.addEventListener('click', () => {
	alert('msa2!')
	//clearTimeout(timeout)
	clearInterval(timer)
})

console.log('-------------------------------')

//호이스팅(Hoisting)
//함수 선언부가 유효범위 최상단으로 끌어오려지는 현상
//자바스크립트 parser가 함수 선언에 대한 정보를 기억하고 있다가 실행시킨다.

// var 변수는 호이스팅이 발생
// let 변수는 호이스팅이 발생 x 



    //배열 처리 [ ]
    //배열을 원소로 하는 배열(2차원 배열) - 3행 2열
    let arr = [
                    ['김연아', '이순신'], 
                    ['광개토대왕', '세종대왕'], 
                    ['박태환', '강감찬']
                ];

        document.writeln('arr[0] : '+arr[0]+'<br />');
        document.writeln('arr[1] : '+arr[1]+'<br />');
        document.writeln('arr[2] : '+arr[2]+'<br />');
        document.writeln('arr[3] : '+arr[3]+'<br />');

        document.writeln('arr.length : '+arr.length+'<br />');
        document.writeln('arr[0].length : '+arr[0].length+'<br />');
        document.writeln('arr[2].length : '+arr[2].length+'<br />');

        document.writeln('세종대왕 출력 : '+arr[1][1]+'<br />');
        document.writeln('강감찬 출력  : '+arr[2][1]+'<br />');
        document.writeln('<br />');

        let arr1 = [];
        document.writeln('arr1[0] : '+arr1[0]+'<br />');
        document.writeln('arr1[1] : '+arr1[1]+'<br />');
        document.writeln('arr1[2] : '+arr1[2]+'<br />');
        document.writeln('arr1[3] : '+arr1[3]+'<br />');
        document.writeln('arr1.length : '+arr1.length+'<hr />');

        arr1[0] = 90;
        arr1[2] = 100;
        document.writeln('arr1[0] : '+arr1[0]+'<br />');
        document.writeln('arr1[1] : '+arr1[1]+'<br />');
        document.writeln('arr1[2] : '+arr1[2]+'<br />');
        document.writeln('arr1[3] : '+arr1[3]+'<br />');
        document.writeln('arr1.length : '+arr1.length+'<p />');
const num = 10;  //number
        const str = 'javascript'; // string

        const point = { x: 100, y: 500 };  //object
        const arr2 = [ 1, 2, 3, 4, 5 ];  // array

        //function
    /*     const plus = function(su1, su2 ) {
            return su1 + su2; 
        } */
        
		/*
		const plus = ( su1, su2 ) => {
            return su1 + su2; 
        }

        const add = (su1, su2 ) => su1 + su2;

        document.writeln('num : ' + num+"<br />");
        document.writeln(  str :  ${str} <br /> );
        document.writeln(  point.x :  ${ point.x } <br /> );
        document.writeln(  point["y"] :  ${ point["y"] } <hr /> );

        document.writeln(  arr2[0] :  ${arr[0]} <br /> );
        document.writeln(arr2[3] : ${arr[3]} <br />);

        document.writeln('arr2[0] : ' +arr[0]+'<br />');  // 1
        document.writeln('arr2[3] : ' +arr[3]+'<br />');  // 4

        document.writeln(plus : ${ plus } <br />);   // 함수 원형이 텍스트로 출력됨
        document.writeln('plus : ' +plus()+'<br />');  // NaN
        document.writeln('plus(3, 5) : ' +plus(3, 5)+'<hr />');   // 함수호출

        let  arr3 = [ '김연아', '이순신', '세종대왕' ];
        document.writeln('arr3[0] : ' +arr3[0]+'<br />'); 
        document.writeln('arr3[1] : ' +arr3[1]+'<br />'); 
        document.writeln('arr3[2] : ' +arr3[2]+'<br />'); 
        document.writeln('arr3[3] : ' +arr3[3]+'<br />'); 
        document.writeln('arr3.length  : ' +arr3.length+'<br />'); 
        document.writeln('<br />'); 
*/

