package view;

import java.util.Scanner;

import model.Login;
import model.MusicFile;
import model.Rank;
import model.Join;
import model.DTO;
import model.Invest;

public class View { // view ����ڿ��� ���̱� ���� main �����

	public static void main(String[] args) {
		MusicFile music = new MusicFile();
		// .\\music\\����.mp3
		
		String user_id = ""; // �α����� id �ޱ�
		String welcome = "����Ʈ���� ���Ű��� ȯ���մϴ�. \n�ű� ���� ������ ���� �ʱ�� 100������ �����ص帳�ϴ�. \n���� �ٷ� �����ϼ��� !!!!!!! ";
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
				+ "     !--------~        ,;!.  ��  !. ��   !=        -~------~~!                         \n"
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
			System.out.println("  [1]�ű�ȸ������ [2]�α��� [3] ��ũ��ȸ [4]����");
			int menu = sc.nextInt();
			music.musicPlus();
			if (menu == 1) {
				System.out.println("=== ȸ������ ===");
				System.out.print("ID�� �Է��ϼ��� >> ");
				String id = sc.next();
				music.musicPlus();
				System.out.print("PW�� �Է��ϼ��� >> ");
				String pw = sc.next();
				music.musicPlus();
				System.out.print("�г����� �Է��ϼ��� >> ");
				String name = sc.next();
				music.musicPlus();
				System.out.print("������ �Է��ϼ��� (MAN, WOMAN) >> ");
				String gender = sc.next();
				music.musicPlus();
				DTO dto = new DTO(id, pw, name, gender);
				Join dao = new Join();
				int cnt = dao.insert(dto);
				if (cnt > 0) {
//					System.out.println("!! ȸ������ ���� !!");
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
					System.out.println("�α������� �̵��� �ּ���^^");
				} else {
					System.out.println("ȸ������ ����..�ٽ� �������ּ���");
				}
			} else if (menu == 2) {
				System.out.println("==== �α��� ====");
				Login log = new Login();
				System.out.print("���̵� �Է� >> ");
				user_id = sc.next();
				music.musicPlus();
				System.out.print("��й�ȣ �Է� >> ");
				String user_pw = sc.next();
				music.musicPlus();
				DTO dto = new DTO(user_id, user_pw);
				boolean result = log.login(dto); // ���� ���̵� login�� ����
				
				if(result == true) {
//					System.out.println("!! �α��� ���� !!");
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
					System.out.println("�α��� ����..");
					continue;
				}

			} else if (menu == 3) {
				Rank rank = new Rank();
				rank.gameRank();
			}else if(menu==4) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			
		}
		
		System.out.println();
		System.out.println("========================= ���̵��� �����ϼ���! =========================");
		System.out.println("[1] ����(���ͷ� ���� ����) [2] ����(���ͷ� ���� ����) [3] �����(���ͷ� ���� ŭ)   ");
		System.out.println("==================================================================");
	    int select = sc.nextInt();
	    if(select == 1) {
	    	money.investLow(user_id);
	    }else if( select == 2) {
	    	money.investMid(user_id);
	    } else if (select == 3) {
	    	money.investHigh(user_id); // �α����� id�� ���
	    } else {
	    	System.out.println("�߸� �Է��ϼ̽��ϴ�!");
	    }

	}
}