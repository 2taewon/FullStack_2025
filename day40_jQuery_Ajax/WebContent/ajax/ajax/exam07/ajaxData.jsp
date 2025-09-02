<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page trimDirectiveWhitespaces="true" %>

<% 

	//ajaxData.jsp 

	request.setCharacterEncoding("euc-kr");
	String name = request.getParameter("name");
	String orderNum = request.getParameter("orderNum");
	
	System.out.println("name : " + name );
	System.out.println("orderNum : " + orderNum );
	
	String status = "";
	
	if( name.equals("admin") && orderNum.equals("A001") ) {
		status = "주문하신 금괴가 지금 발송 중 입니다.";
	} else if(  name.equals("admin") && orderNum.equals("A002") ) {
		status = "주문하신 자동차는 공장에서 생산이 완료 되었습니다.";
	} else {
		status = "이미 발송된 제품 입니다.";
	}
%>
<%= status %>






