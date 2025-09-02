package ex03.lombok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data // getter + setter + tostring 모든 것을 다 붙일 수 있음.
public class DeptDTO {
	
	private int deptno;
	private String Dname, loc;
	
	//보일러 플레이트 코드(Boilerplate code) : 개발하는데 반복적으로 사용하는 필수적인 코드
	
}
