package view;

import java.util.Scanner;

import model.Login;
import model.Rank;
import model.Join;
import model.DTO;
import model.Invest;

public class View { // view 사용자에게 보이기 위한 main 만들기

	public static void main(String[] args) {
		
		String login_id = ""; // 로그인한 id 받기
		
		Scanner sc = new Scanner(System.in);
		
//		invest money = new invest();
		Invest money = new Invest();
		System.out.println("강원뱅크에 오신것을 환영합니다. \n신규 계좌 개설시 투자 초기금 100만원을 지원해드립니다. \n* 지금 바로 가입하세요 *");

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
				login_id = log.login(dto); // 받은 아이디값 login에 저장
				
// 			    if() {
//					// 로그인이 성공 게임으로 진행
					break;
//				}

			} else if (menu == 3) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
		
		System.out.println("난이도를 설정하세요!");
		System.out.println("[1] 쉬움(손익률 변동 작음) [2] 보통(손익률 변동 보통) [3] 어려움(손익률 변동 큼)");
	    int select = sc.nextInt();
	    if(select == 1) {
	    	money.investlow();
	    }else if( select == 2) {
	    	money.investmid();
	    } else if (select == 3) {
	    	money.investhigh(login_id); // 로그인한 id로 출력
	    } else {
	    	System.out.println("잘못 입력하셨습니다!");
	    }
		


		
//		//22.05.30 혜원 
//		Rank rank = new Rank();
//		rank.gamerank();

	}
}