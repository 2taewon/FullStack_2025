var httpRequest = null;

function getXMLHttpRequest() {
	if(window.XMLHttpRequest) {
		return new XMLHttpRequest();
	} else if(window.ActiveXObject) {
		return new ActiveXObject("Microsoft.XMLHTTP");
	} else {
		return null;
	}
}

function sendRequest(method, url, params, callback) {
	httpRequest = getXMLHttpRequest();
	
	/*
	httpMethod = method;
	if(method != 'Get' && method != 'Post') {
		httpMethod = 'Get';
	}
	
	var httpParams = "";
	if(params != null && params != '') {
		for(var key in params) {
			if(httpParams == "")
				httpParams += (key + "=" + encodeURIComponent(params[key]));
			else 
				httpParams += "&" + (key + "=" + encodeURIComponent(params[key]));
		}
	}
	
	var httpUrl = url;
	if(httpMethod == 'Get')
		httpUrl = url + "?" + httpParams;
	
	httpRequest.onreadystatechange = callback;
	
	httpRequest.open(httpMethod, httpUrl, true);
	httpRequest.send(httpParams);
	*/
	
	httpRequest.onreadystatechange = callback;
	params = encodeURIComponent(params);
	if(method == 'Get') {
		httpRequest.open(method, url + '?' + params, true);
		httpRequest.send(null);
	} else if(method == 'Post') {
		httpRequest.open(method, url, true);
		httpRequest.send(params);
	}
		
}

















