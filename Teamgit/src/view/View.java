package view;

import java.util.Scanner;

import model.Login;
import model.Rank;

import model.Join;
import model.DTO;

public class View { // view 사용자에게 보이기 위한 main 만들기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("강원뱅크에 오신것을 환영합니다. \n신규 계좌 개설시 투자 초기금 10만원을 지원해드립니다. \n* 지금 바로 가입하세요 *");

		while(true) {
			System.out.println("[1]회원가입 [2]로그인 [3] 종료");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("===회원가입===");
				System.out.print("ID을 입력하세요 >> ");
				String id = sc.next();
				System.out.print("PW를 입력하세요 >> ");
				String pw = sc.next();
				System.out.print("닉네임을 입력하세요 >> ");
				String name = sc.next();
				System.out.print("성별을 입력하세요 (MAN, WOMAN) >> ");
				String gender = sc.next();
				DTO dto = new DTO(id, pw, name, gender);
				Join dao = new Join();
				int cnt = dao.insert(dto);
				if (cnt > 0) {
					System.out.println("회원가입 성공");
					System.out.println("로그인으로 이동해 주세요^^");
				} else {
					System.out.println("회원가입 실패..다시 가입해주세요");
				}
//				System.out.println("다음으로~");
			} else if (menu == 2) {
				System.out.println("==== 로그인 ====");
				model.Login log = new Login();
				System.out.print("아이디 입력");
				String user_id = sc.next();
				System.out.print("비밀번호 입력");
				String user_pw = sc.next();
				DTO dto = new DTO(user_id, user_pw);
				log.login(dto);
				
//				if() {
//					// 로그인이 성공 게임으로 진행
//					break;
//				}

			} else if (menu == 3) {
				System.out.println("종료되었습니다.");
				break;
			}
		}


		
//		//22.05.30 혜원 
//		Rank rank = new Rank();
//		rank.gamerank();

	}
}