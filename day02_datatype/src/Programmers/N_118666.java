//package Programmers;
//
//public class N_118666 {
//	public static void main(String[] args) {
//		
//		int T_cnt=0, R_cnt=0, C_cnt=0,F_cnt=0,J_cnt=0,M_cnt=0,A_cnt=0,N_cnt=0;
//		for(int i = 0; i<survey.length; i++) {
//		
//			
//		switch(survey[i]) {
//		case "RT":
//			if(choices[i] > 4) T_cnt += choices[i] - 4;
//			else if(choices[i] < 4) R_cnt += 4 - choices[i];
//			break;
//		case "TR":
//			if(choices[i] > 4) R_cnt += choices[i] - 4;
//			else if(choices[i] < 4) T_cnt += 4 - choices[i];
//			break;	
//		case "FC":
//			if(choices[i] > 4) C_cnt += choices[i] - 4;
//			else if(choices[i] < 4) F_cnt += 4 - choices[i];
//			break;
//		case "CF":	
//			if(choices[i] > 4) F_cnt += choices[i] - 4;
//			else if(choices[i] < 4) C_cnt += 4 - choices[i];
//			break;
//		case "MJ":
//			if(choices[i] > 4) J_cnt += choices[i] - 4;
//			else if(choices[i] < 4) M_cnt += 4 - choices[i];
//			break;
//		case "JM":
//			if(choices[i] > 4) M_cnt += choices[i] - 4;
//			else if(choices[i] < 4) J_cnt += 4 - choices[i];
//			break;
//		case "AN":
//			if(choices[i] > 4) N_cnt += choices[i] - 4;
//			else if(choices[i] < 4) A_cnt += 4 - choices[i];
//			break;
//		case "NA":
//			if(choices[i] > 4) A_cnt += choices[i] - 4;
//			else if(choices[i] < 4) N_cnt += 4 - choices[i];
//			break;
//			} // end switch
//		} //end for
//		char[] arr = new char[4];
//		if(R_cnt >= T_cnt) {
//			arr[0] = 'R';
//		}
//		else if(R_cnt < T_cnt) {
//			arr[0] = 'T';
//		}
//		if(C_cnt >= F_cnt) {
//			arr[1] = 'C';
//		}
//		else if(C_cnt < F_cnt) {
//			arr[1] = 'F';
//		}
//		if(J_cnt >= M_cnt) {
//			arr[2] = 'J';
//		}
//		else if(J_cnt < M_cnt) {
//			arr[2] = 'M';
//		}
//		if(A_cnt >= N_cnt) {
//			arr[3] = 'A';
//		}
//		else if(A_cnt < N_cnt) {
//			arr[3] = 'N';
//		}
//		System.out.println(arr);
//	}
//}
