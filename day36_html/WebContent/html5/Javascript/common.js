function is_empty( str ){
	var result = false;
	if ( str == null || str == undefined ){
		result = true;
	}else{
		str = str.split(" ").join("");
		if ( str == "" ){ result = true; }
		else             { result = false; }
	}
	return result;
}

function is_pattern( str, pattern ){
	var result = false;
	var regExp = new RegExp( pattern );
	if ( regExp.test(str) == true ){
		result = true;
	}
	return result;
}

function is_id( str ){
	var result = is_pattern( str, /^[a-z][a-z0-9_]{6,14}$/ );
	if ( result == false ){
		alert("[아이디] 입력 규칙에 맞지 않음. 재입력 바람!\n<1> 영소문자 또는 숫자 또는 언더바(_)로 구성되야함."
				+ "\n<2> 글자수는 7~15로 구성되어야함"
				+ "\n<3> 첫글자는 영문이어야함.\n");
	}
	return result;
}

function is_pwd( str ){
	var result = is_pattern( str, /^[a-z0-9]{8,16}$/ );
	if ( result == false ){
		alert("[암호] 입력 규칙에 맞지 않음. 재입력 바람!"
				+ "\n<1> 영소문자 또는 숫자로 구성되야함."
				+ "\n<2> 글자수는 8~16로 구성되어야함\n");
	}
	return result;
}

function check_cnt( obj ){
	var skill_cnt=0;
	if( obj.length > 1){
		for ( var i=0; i<obj.length; i++ ){
			if( obj[i].checked == true ){ skill_cnt++; } // true 생략가능
		}
	}else{ 
		if( obj.checked == true ){ skill_cnt ++; } // true 생략가능
	}
	return skill_cnt;
}

function is_birth( year, month, date ){
	var result = false;
	if ( year != "" && month != "" && date != "" ){

		var year = parseInt( year, 10 );
		var month = parseInt( month, 10 );
		var date = parseInt( date, 10 );
		
		var date_obj = new Date( year, month-1, date );
		
		var flag =  year == date_obj.getFullYear( ) 
						&& month == (date_obj.getMonth( )+1) 
							&& date == date_obj.getDate( );
		if ( flag ){ result =  true; }
	}
	return result;
}

function is_birth2( year_obj, month_obj, date_obj ){
	var flag = is_birth( year_obj, month_obj, date_obj );
	if (flag == false){
		year_obj.value = "";
		month_obj.value = "";
		date_obj.value = "";
	}
	return flag;
}