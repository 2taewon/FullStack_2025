//videoManage
package quiz_video;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VideoManage extends Video {
	Scanner sc = new Scanner(System.in);
	HashMap<Integer, Video> video = new HashMap<Integer, Video>();
	Calendar date = Calendar.getInstance();
	private int nocnt = 1;
	
	public void add() {
		System.out.println("비디오 제목 : ");
		String title = sc.next();
		System.out.println("장르 : ");
		String category = sc.next();
		System.out.println("대여자 : ");
		String lendName = sc.next();
		Video newV = new Video(title, category, lendName); 
		video.put(nocnt++, newV);
		System.out.println(title + "대여를 완료했습니다. ");
		}
	
	public void edit() {
		System.out.println("수정할 번호를 입력하세요 : ");
		int no = sc.nextInt();
		
		if(video.get(no) == null) {
			System.out.println("해당 번호의 비디오는 없습니다. 다시 시도해주세요");
			return;
			}

			Video v = video.get(no);

			System.out.print("변경할 항목을 입력하세요 \n 제목 : 1\n카테고리 : 2");
			int choiceNumber = sc.nextInt();
			switch (choiceNumber) {
			case 1:
			System.out.println("변경할 제목을 입력하세요");
			String name = sc.next();
			v.setTitle(name);
			System.out.println("변경되었습니다. 정보를 확인하세요");
			System.out.println(v);
			break;

			case 2:
			System.out.println("변경할 카테고리를 입력하세요");
			String category = sc.next();
			v.setCategory(category);
			System.out.println("변경되었습니다. 정보를 확인하세요");
			System.out.println(v);
			break;
			default: System.out.println("다시 시도해 주세요");
		}
	}

	public void show() {
		Collection<Video> v = video.values();
		for(Video video : video.values()) 
		System.out.println(video);
	}
	
	public void delete() {
		boolean isDelete = false;
		System.out.println("삭제할 번호를 입력하세요 : ");
		int no = sc.nextInt();
		System.out.println();
		
		Set set = video.entrySet();
		Iterator it = set.iterator(); 

		while (it.hasNext()) {
		Map.Entry e = (Map.Entry) it.next();

		Set subSet = ((HashMap) e.getValue()).entrySet();
		Iterator subIt = subSet.iterator();

		while (subIt.hasNext()) {
		Map.Entry entry = (Map.Entry)subIt.next();//
		    Video v = (Video)entry.getValue();
		    if(v.getNo() == no) {
		    	video.remove(no);
		    	System.out.println("삭제 완료");
		    	}
			}
		if(isDelete) break;
		}
		if(!isDelete) System.out.println("이 번호는 없습니다.");
	}
		
}
