//package ex06.innerClass;
//
//import java.awt.Button;
//import java.awt.Frame;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class InnerEventMain {
//	public static void main(String[] args) {
//		Frame frame = new Frame("이벤트처리 - 이너클래스"); // 프레임(화면)
//		Button btn = new Button("Button-Start");
//		
//	//  2. 
//		btn.addActionListener(new ActionListner() { // 익명(무명) 클래스
//			
//			
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("ActionEvent 발생 22");
//				System.out.println(e.getActionCommand());
//				System.out.println(e.getSource());
//				System.out.println();
//			}
//		});		
//	
//		// 3. 
//		frame.addWindowListener(new WindowAdapter() {
//			@override 
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		})
//		
//		
//		frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
//		frame.setVisible(true);
//		frame.setSize(500,300);
//		frame.setLocation(300, 150);
//	}
// }
//
//
//
//
///*
//package ex06.innerClass;
//
//import java.awt.Button;
//import java.awt.Frame;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class InnerEventMain { //outer class
//	
//	class EventHandler implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("ActionEvent 발생");
//			System.out.println(e.getActionCommand());
//			System.out.println(e.getSource());
//			System.out.println();
//		}
//		
//	}
//	public static void main(String[] args) {
//		Frame frame = new Frame("이벤트처리 - 이너클래스"); // 프레임(화면)
//		Button btn = new Button("Button-Start");
//		
//		EventHandler handle = new InnerEventMain(). new EventHandler();
//		btn.addActionListener(handle); //버튼 액션에 추가 
//				
//		frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
//		frame.setVisible(true);
//		frame.setSize(300,200);
//		frame.setLocation(300, 150);
//	}
//}
//*/