package view;

import java.util.Scanner;

import model.Login;
import model.MusicFile;
import model.Rank;
import model.Join;
import model.DTO;
import model.Invest;

public class View { // view 사용자에게 보이기 위한 main 만들기

	public static void main(String[] args) {
		MusicFile music = new MusicFile();
		// .\\music\\음악.mp3
		
		String user_id = ""; // 로그인한 id 받기
		String welcome = "스마트문에 오신것을 환영합니다. \n신규 계좌 개설시 투자 초기금 100만원을 지원해드립니다. \n지금 바로 가입하세요 !!!!!!! ";
		String[] strArray = welcome.split("");
		
		Scanner sc = new Scanner(System.in);
		
//		invest money = new invest();
		Invest money = new Invest();
		music.musicMain();
		System.out.println(" \n"
				+ "\n"
				+ "                                     . .                                             \n"
				+ "                                   - - ~:-                                           \n"
				+ "                                   ~  $ .:                                           \n"
				+ "                -.,                 :.*.:     ,;. .-                                 \n"
				+ "             ;,,;~~!                          ~~~~~;-,-!.                            \n"
				+ "          !--~~~~~~-;                        $-~-~~~,-~~~--*~                        \n"
				+ "    ,,.:~~~~$$-~~~~~*.        ~..-          ..::-~~-$$~~~~~~-                        \n"
				+ "     *-~~~~~~-~~-*- .        :~~~~,~~             ;*--~~~~~:,                        \n"
				+ "      !~~~~:~,:-            ,~~~~~~~~-:- ,            ,*,,,:                         \n"
				+ "       ;;;.,.               ::-~~~-$$~~~~:---                                        \n"
				+ "                    . .        !--:~~~~-~~-*                                         \n"
				+ "      ..;:.;,.;   . -$ .:          ~.,!~~~--     ..,;,.;..;.                         \n"
				+ "     ;        ;    ., ,~:      .-    .  =       ;          ;                         \n"
				+ "     ;        ; =        ..=;;;;;;;;*,.         ;          ;                         \n"
				+ "      ,,,,,,,,, ~        :;;;;;;;!-*;;;;         ,,,,,,,,,,-                         \n"
				+ "     !--------~         $;;;;;;;$    $;;;        -~------~~!                         \n"
				+ "     !--------~        ,;*!--~~       ,!=        -~------~~!                         \n"
				+ "     !--------~        ,;!.  ●  !. ●   !=        -~------~~!                         \n"
				+ "     !--------~        : ;       ~     *-.       -~------~~!                         \n"
				+ "     !--------~        -.;       >     *:,       -~------~~!                         \n"
				+ "     !--------~          ;  :,.....,   *         -~------~~!                         \n"
				+ "     !--------~         ~;   ;....~   .*-        ~~------~~!                         \n"
				+ "     !-----------------~:~ !         ; ~:--------~~------~~!                         \n"
				+ "     !----------------:;:;,. .*-.;=   ~;~;~--------------~~!                         \n"
				+ "     !----------------~~!~;~. :=#*;~  :~;:---------------~~!                         \n"
				+ "     *----------------~:--~,  ,=#;   $~-~:~---------------*                          \n"
				+ "      .~~----------~---~~~-:. -##!  .~-:!--------------~~~.                          \n"
				+ "       ..........!~~----~;:~! -###, ~~~;~-----~,..........                           \n"
				+ "                 *--------::~=~###,:~=~-------~*                                     \n"
				+ "                 *---------~::*##$:;:~--------~*                                     \n"
				+ "                 *-----------~;;#;:~----------~*                                     \n"
				+ "                 *-----------~-~~~------------~*                                     \n"
				+ "                 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~:*                                     \n"
				+ "                                                                                     \n");
	
		

        try {
        	for(int i=0; i < welcome.length(); i++) {
    			System.out.print(welcome.charAt(i));
    			Thread.sleep(100);
    		}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
		while(true) {
			System.out.println("  [1]신규회원가입 [2]로그인 [3] 랭크조회 [4]종료");
			int menu = sc.nextInt();
			music.musicPlus();
			if (menu == 1) {
				System.out.println("=== 회원가입 ===");
				System.out.print("ID을 입력하세요 >> ");
				String id = sc.next();
				music.musicPlus();
				System.out.print("PW를 입력하세요 >> ");
				String pw = sc.next();
				music.musicPlus();
				System.out.print("닉네임을 입력하세요 >> ");
				String name = sc.next();
				music.musicPlus();
				System.out.print("성별을 입력하세요 (MAN, WOMAN) >> ");
				String gender = sc.next();
				music.musicPlus();
				DTO dto = new DTO(id, pw, name, gender);
				Join dao = new Join();
				int cnt = dao.insert(dto);
				if (cnt > 0) {
//					System.out.println("!! 회원가입 성공 !!");
					System.out.println("\r\n"
							+ "\r\n"
							+ "                                                                      \r\n"
							+ "  .@-           @   .    @@  .        .    ..   .    .   .   ......   \r\n"
							+ "  :~@;        @@@@@ @  ~@:*@ @, ,@@@@ @   =@:@  @    @   @   @@@@@@   \r\n"
							+ "  -@. @@            @  ;@  @ @,    .@ @   @  @! @   -@ @@@        @   \r\n"
							+ "  -@.   ~!@;  !@@@; @   :@@. @,    @: @   @- @- @   @$@  @     @. ;   \r\n"
							+ "  -@.     @@  @. *@ @  @@@@@@@,   *#  @@:  @@   @  @= ~@ @  @@@@@@@@  \r\n"
							+ "  -@. ;#;~     @@@  @    .@~;@,  *@   @    @.   @    -@@@.    .@@@    \r\n"
							+ "  -@@#          @   @   @.@  @, -@    @    @@@@@@   ,@.  @   #@  :@   \r\n"
							+ "  -@.        ~@@@@@~@   @             @    @,   @   ,@   @   @*  .@.  \r\n"
							+ "  -@.               @   @@@@@@~       @    @@@@@@    .@@@,    :@@@.   \r\n"
							+ "  -@.                                                                 \r\n"
							+ "");
					System.out.println("로그인으로 이동해 주세요^^");
				} else {
					System.out.println("회원가입 실패..다시 가입해주세요");
				}
			} else if (menu == 2) {
				System.out.println("==== 로그인 ====");
				Login log = new Login();
				System.out.print("아이디 입력 >> ");
				user_id = sc.next();
				music.musicPlus();
				System.out.print("비밀번호 입력 >> ");
				String user_pw = sc.next();
				music.musicPlus();
				DTO dto = new DTO(user_id, user_pw);
				boolean result = log.login(dto); // 받은 아이디값 login에 저장
				
				if(result == true) {
//					System.out.println("!! 로그인 성공 !!");
					System.out.println("\r\n"
							+ " @@:                                 @       .   .   ......           \r\n"
							+ ".@~@,,       @@@@@@   :@@@@@;  ,@@@~ @       @:., @  ~@@@@@*          \r\n"
							+ ".@.-;@@;-    :::::@       ,@;  @  :@ @       @*-@@@    ~, @!          \r\n"
							+ ".@.   --@=-  @@@@@@       ,@;  @  :@ @      =@#:  @    =@ -.          \r\n"
							+ ".@.    .=@~  @=           ,@;   @@@: @     $@ ~@~ @ -@@@@@@@;         \r\n"
							+ ".@..-,=!     @@@@@@       ,#:   .,   @       -:@@-   .-@@@-,          \r\n"
							+ ".@@;       ;;;=@;;; ,;;;;!#!,   ~@   :       @;;;@!  @=;;;@~          \r\n"
							+ ".@-         @@@@@@@@  @@@@@@@   ~@@@@@       @!  @-  @#,  @*          \r\n"
							+ ".@-                                           !@@,    ;@@#.           \r\n"
							+ "");
					break;
					
				}else {
					System.out.println("로그인 실패..");
					continue;
				}

			} else if (menu == 3) {
				Rank rank = new Rank();
				rank.gameRank();
			}else if(menu==4) {
				System.out.println("종료되었습니다.");
				break;
			}
			
		}
		
		System.out.println();
		System.out.println("========================= 난이도를 설정하세요! =========================");
		System.out.println("[1] 쉬움(손익률 변동 작음) [2] 보통(손익률 변동 보통) [3] 어려움(손익률 변동 큼)   ");
		System.out.println("==================================================================");
	    int select = sc.nextInt();
	    if(select == 1) {
	    	money.investLow(user_id);
	    }else if( select == 2) {
	    	money.investMid(user_id);
	    } else if (select == 3) {
	    	money.investHigh(user_id); // 로그인한 id로 출력
	    } else {
	    	System.out.println("잘못 입력하셨습니다!");
	    }

	}
}