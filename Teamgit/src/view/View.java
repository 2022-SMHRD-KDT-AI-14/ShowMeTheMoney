package view;

import java.util.Scanner;


import model.DAO;
import model.DTO;

public class View { //view 사용자에게 보이기 위한 main 만들기
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("[1]회원가입 [2]로그인 [3] 나가기");
			int menu=sc.nextInt();
			if(menu==1) {
				System.out.println("===회원가입===");
				
				System.out.print("ID을 입력하세요>>");
				String id=sc.next();
				System.out.print("PW를 입력하세요>>");
				String pw=sc.next();
				System.out.print("닉네임을 입력하세요>>");
				String name=sc.next();
				DTO dto=new DTO(id, pw, name);
				DAO dao= new DAO();
				//int cnt =dao.insert(dto);
				//if(cnt>0) {
					System.out.println("회원가입 성공");
					
				}else {
					System.out.println("ID가 중복되었습니다.");
				}
				
		        //}else if(menu==5) {
				System.out.println("다음으로~");
				break;
			}
		}
		//DAO dao=new DAO(); //model에서 가져오기
		
	
	}

//}
