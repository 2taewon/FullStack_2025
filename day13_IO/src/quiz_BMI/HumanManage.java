package quiz_BMI;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HumanManage extends Human {
	private int nocnt = 1;
	private boolean isgender = false;
	Scanner sc = new Scanner(System.in);
	HashMap<Integer, Human> human = new HashMap<Integer, Human>();
	
	
	public void add() {
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("성별(m,f) : ");
		String gender = sc.next();
		if(gender.toLowerCase().equals("m")) isgender = true;
		else isgender = false;
		System.out.println("키 : ");
		double height = sc.nextDouble();
		System.out.println("몸무게 : ");
		double weight = sc.nextDouble();
		
		Human newH = new Human(name, gender, height, weight);
		human.put(nocnt++, newH);
	}
	
	public void delete() {
		System.out.println("삭제하실 번호를 입력하세요 : ");
		print();
		int num = sc.nextInt();
		if(human.get(num) == null) {
			System.out.println("요청하신 번호는 없습니다. 다시 시도해주세요.");
			return;
		}
		human.remove(num);
		System.out.println("요청하신 " + num + "번을 삭제했습니다.");
	}
	
	public void print() {
		Collection<Human> h = human.values();
		for(Human hu : human.values());
		System.out.println(human);
		
//		Set set = human.entrySet();
//		Iterator it = set.iterator(); 
//
//		while (it.hasNext()) {
//		Map.Entry e = (Map.Entry) it.next();
//
//		Set subSet = ((HashMap) e.getValue()).entrySet();
//		Iterator subIt = subSet.iterator();
//
//		while (subIt.hasNext()) {
//		Map.Entry entry = (Map.Entry)subIt.next();//
//		   Human h = (Human)entry.getValue();
//		
//		if(BMI() <18.5) { System.out.println((h.getName()) +"님 저체중이시네요. 살 좀 찝시다." );}
//		else if(18.5<BMI() && BMI()<22.9) {System.out.println((h.getName()) + "님 정상이시네요. 유지하세요!");}
//		else if(23.0<BMI() && BMI()<24.9) {System.out.println((h.getName()) + "님 과체중이시네요. 그만 먹자!");}
//		else if(25.0<BMI()) {System.out.println((h.getName()) + "님 비만이시네요. 운동해!");}
//			}
//		}
	}
	
	public void edit() {
		System.out.println("수정하실 번호를 선택해주세요 :");
		System.out.println("[1. 이름, 2. 성별, 3.키, 4. 몸무게] ");
		int num;
		int no = sc.nextInt();
		Human h = human.get(no);
		
		switch(no){
		case 1 :
			System.out.println("변경하실 번호를 입력해주세요 : ");
			print();
			num = sc.nextInt();
			h.setNo(num);
			System.out.println("변경하실 이름을 입력해주세요 : ");
			String name = sc.next();
			h.setName(name);
			System.out.println("변경되었습니다."); break;
		case 2 : 
			System.out.println("변경하실 번호를 입력해주세요 : ");
			print();
			num = sc.nextInt();
			System.out.println("변경하실 성별을 입력해주세요(m,f) : ");
			String gender = sc.next();
			h.setName(gender);
			System.out.println("변경되었습니다.");break;
		case 3 :
			System.out.println("변경하실 번호를 입력해주세요 : ");
			print();
			num = sc.nextInt();
			System.out.println("변경하실 키를 입력해주세요 : ");
			double height = sc.nextDouble();
			h.setHeight(height);
			System.out.println("변경되었습니다.");break;
		case 4 : 
			System.out.println("변경하실 번호를 입력해주세요 : ");
			print();
			num = sc.nextInt();
			System.out.println("변경하실 몸무게를 입력해주세요 : ");
			double weight = sc.nextDouble();
			h.setHeight(weight);
			System.out.println("변경되었습니다.");break;
		default : System.out.println("다시 입력해주세요.");
		}
		
	}
	public void filesave() throws IOException {
		ObjectOutputStream oos = null;
		File f = new File("Humans.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(f,true); // append mode, 그냥 f는 덮어쓰기 (f,true) 는 데이터가 계속 쌓임.
			oos = new ObjectOutputStream(fos);
			
			for(Human h : human.values()) {
				oos.writeObject(h);
			}
			
			System.out.println("Humans.txt save");
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			oos.close();
		}
	}
	public void fileload() throws IOException, ClassNotFoundException {
		File f = new File("Humans.txt");
		FileInputStream fis = null;
		ObjectInputStream bis = null;
		try {
			fis = new FileInputStream(f);
			bis = new ObjectInputStream(fis);
			
			while(true) {
				try {
				Human h = (Human)bis.readObject();
				System.out.println("\t\t\t >> "+ h.getName() +" 정보 << \n");
				System.out.println("이름 \t 성별 \t 키 \t 몸무게 ");
				System.out.println();
				System.out.print(h.getName() + "\t" + h.getGender() + "\t");
				if(isgender == true) System.out.print("남자");
				else System.out.print("여자");
				System.out.println("\t" + h.getHeight() + "\t" + h.getWeight());
				}catch(EOFException e) {
					break;
				}
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
//	class AppendableObjectOutputStream extends ObjectOutputStream {
//	    public AppendableObjectOutputStream(OutputStream out) throws IOException {
//	        super(out);
//	    }
//
//	    @Override
//	    protected void writeStreamHeader() throws IOException {
//	        reset(); // 헤더를 생략하고 reset만 수행
//	    }
//	}
/*
 * ➤ ObjectOutputStream을 append 모드(new FileOutputStream(file, true))로 사용하면	
 * 파일에 Stream Header가 반복해서 저장됨.
 */
	
}