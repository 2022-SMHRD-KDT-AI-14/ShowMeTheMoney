package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Invest {
	MusicFile music = new MusicFile();
	
	
	Connection conn; // DB ������ ���� ��ü
	PreparedStatement psmt; // SQL���� �����ϴ� ��ü
	int rs; // Query�� ������� �޾ƿ��� ��ü
	DAO dao = new DAO();

	public void investhigh(String id) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int num0 = 1000000;

		int cnt = 1;
		int sum = 0;
		int num2 = 0;
		int num3 = 1;
		int buy = 0;

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB�ּ�
		String db_id = "campus_e_0516_2"; // db_id
		String db_pw = "smhrd2"; // db_pw

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ���ͷ� 140% ������ -70%
		music.music_main();

		int num1 = (num0 / 100) * (r.nextInt(210) - 70);

		while (cnt <= 5) {
			// �˰���

			num1 = (num0 / 100) * (r.nextInt(210) - 70);

			dao.selectNews(cnt);
			if (cnt == 2 ) {
				System.out.println(
						"                                          \r\n"
						+ "                  -;;,                  \r\n"
						+ "               -@@#==#@@.               \r\n"
						+ "              #@~------~-.              \r\n"
						+ "             !@----------@-             \r\n"
						+ "             @-----------~@             \r\n"
						+ "            @*------------$=            \r\n"
						+ "            @--------------@            \r\n"
						+ "           :@---*@@@@@@!---@,           \r\n"
						+ "           @~-;@#.....,#@:-=*           \r\n"
						+ "           @-$@$=:....;=#@*-@           \r\n"
						+ "           @!@=!*#@~~@$*!=@:@           \r\n"
						+ "          ,#@;    $@@-    !@@           \r\n"
						+ "          @@#=    #:=$    @@@;          \r\n"
						+ "          @@*@:  :@..@-  =@*@@          \r\n"
						+ "          @=*@#@@#...,@@@@$*#@          \r\n"
						+ "          @**$$..........@=**@          \r\n"
						+ "       @@@@@@@@@@@@@@.@@@@@@@@@@@       \r\n"
						+ "      ~=           -@           @.      \r\n"
						+ "      ~=           @-           #.      \r\n"
						+ "      ~=           @            #.      \r\n"
						+ "      $=          -#            #.      \r\n"
						+ "      @=          #~            #,      \r\n"
						+ "     @$=          @             #;      \r\n"
						+ "    :@*=         ~@             #;@,    \r\n"
						+ "    @:*=         *@@@@          #;;@    \r\n"
						+ "   #=:*=            *$          #;:#=   \r\n"
						+ "  .@:#@=            @.          #@#:@   \r\n"
						+ "  @!;=!=            @           #~$@@#  \r\n"
						+ "  @---!=           ~@           #~--@@  \r\n"
						+ " :#---!=           @-           #~---@. \r\n"
						+ " ==---!=           @            #~---#~ \r\n"
						+ " ;#---!=.                       #~---@, \r\n"
						+ "  @:--~@@@@@@@@@@@@.~@@@@@@@@@@@@---;@  \r\n"
						+ "  .@@##=~~~~~~~~~~~  ~~~~~~~~~~~@$#@@   \r\n"
						+ "     .:@========================@~.     \r\n"
						+ "       -;;;;;;;;;;;;;;;;;;;;;;;;,       ");
				System.out.println();
				System.out.println("!!����!! ��.S �ù�~ !!!");
				System.out.println();
				System.out.println("-----------------------------");
				System.out.println(" �ù� ����!! �������� ������õ !! �����Ͻðڽ��ϱ�? (��ȸ1��)");
				System.out.println("-----------------------------");
					System.out.println("[1] Yes(10���� ����) [2] NO");
					buy = sc.nextInt();
					music.music_plus();
					if (buy == 1) {
						num0 = num0 - 100000;
						System.out.println();
						System.out.println("===========================");
						System.out.println("� ������ ������ �����Ͻðڽ��ϱ�?");
						System.out.println("===========================");
						System.out.println("[1] �Ｚ����  [2] ��Ʈ����  [3] īī��");
					    int buy2 = sc.nextInt();
						music.music_plus();
					    if(buy2==1) {
					System.out.println("                            ..                       ..                                    \r\n"
							+ "                      @@@@=   @@@@   @@@$ :@@@  -@@@@,  @@ =@#  @@@  @@  !@@@@.                     \r\n"
							+ "                     !@; @@   @@@@   @@$$ @@@@  @@-:@=  @@ =@$  @#@- @@  @@,:@*                     \r\n"
							+ "                     !@# ~~  .@#=@,  @@*@ @=@@  @@!.--  @@ =@$  @##= @@  @@ ,!:                     \r\n"
							+ "                      @@@*   :@==@,  @@:@ @.@@  .@@@,   @@ =@$  @#*@ @@  @@ ---                     \r\n"
							+ "                       ;@@#  @@-;@#  @@ @,@.@@   .$@@;  @@ =@$  @# @.@@  @@ @@$                     \r\n"
							+ "                     ~;- @@. @@ .@@  @@ @~@ @@  ==.-@@  @@ =@#  @@ @:@@  @@ -@$                     \r\n"
							+ "                     *@= #@. @@  @@  @@ @@@ @@  @@,.@@  @@ $@;  @@ *@@@  @@.:@*                     \r\n"
							+ "                     .@@@@# .@@  @@  @@ #@= @@  :@@@@~  *@@@@   @@ -@@@  :@@@@.                     \r\n"
							+ "                       ..                         ..      .                         ");
					    	dao.buyNews(10);
					    } else if(buy2 == 2) {
					    	System.out.println("                                                                                           \r\n"
					    			+ "                                                                                                    \r\n"
					    			+ "          ,~~~~.     ,=###!   ,$$$$$$* =$$:    =$$-  :$$$$$$$.=$$=;   ;,  .!#$$:   ::      $        \r\n"
					    			+ "         ~-~---~.   ,#######  -######$ ###;    ###-      $    $.  -!  ;, ,#    -#  ;$-     #        \r\n"
					    			+ "        ----~~-~~   ########$ -###.... ###;    ###-      =    $.   #  ;, #      -= ;-$-    #        \r\n"
					    			+ "        ~-~----~-. :###  .$$$.-###...  ###;    ###-      =    $.  ,*  ;,-:       $ ;- $.   #        \r\n"
					    			+ "        ~-----~-~- *##~       -######. ###;    ###-      =    $$$$!   ;,!,       *,;-  #.  #        \r\n"
					    			+ "        ~~-------, !##!   ~~~ -###***  ###;    ###-      $    $. .#   ;,:-       =.;-   $  #        \r\n"
					    			+ "        ~---~----  -###;,*### ,###     ###;    ###-      $    $.  ,!  ;,.=       # ;-   ,# #        \r\n"
					    			+ "         ~-~~-~~-   =#######; ,###**** #######.#######   $    $.   *, ;, *:     =, ;-    -*#        \r\n"
					    			+ "          ~--~--     $#####!  -####### @######.#######   $    $.    # ;,  ;#:-!#,  ;-     ~#        \r\n"
					    			+ "           ...        ,;!;.    ,,,,,,. ,,,,,,, .,,,,,,   ,    ,     ...     --,    .       ,   ");
					    	dao.buyNews(11);
					    } else if(buy2 == 3) {
					    	System.out.println("                                                                                          \r\n"
					    			+ "                            -#.              ,#                                                    \r\n"
					    			+ "                            -#.              ,$                                                    \r\n"
					    			+ "                            -#.  -~   :!!~   ,$   ..   ,::.     .-.                                \r\n"
					    			+ "                            ~#.  $*  ;$==#;  ,$  .$!  *$$$$,   !#$$$.                              \r\n"
					    			+ "                            ~#..=*.      ;#  -$ .*=.  -.  **  !=- ,$*                              \r\n"
					    			+ "                            ~#.;#.       :#  -$ :#.       ~#  #;   ,$,                             \r\n"
					    			+ "                            ~#,$;    -!==$#  -$.#-    -~;;*# ,#:    #,                             \r\n"
					    			+ "                            ~# !#-  ,$;..;#  -$ *=   ,$;,,;# -#~    #,                             \r\n"
					    			+ "                            ~#  ==. ~#.  :#  -$ -$!  ~$   ~$ .#;   .#,                             \r\n"
					    			+ "                            ~#   ** -#:.:=#  -$  -$: ~$. ,*$  ==. .=*                              \r\n"
					    			+ "                            ~$   -=. !$$=~$  -=   ~$ .=##=*$   $#=$$-                              \r\n"
					    			+ "                                                   .   ~- .,   .~::  ");
					    	dao.buyNews(12);
					    }
					}
					
				
				}if (cnt == 4 ) {
					System.out.println(
							"                                          \r\n"
							+ "                  -;;,                  \r\n"
							+ "               -@@#==#@@.               \r\n"
							+ "              #@~------~-.              \r\n"
							+ "             !@----------@-             \r\n"
							+ "             @-----------~@             \r\n"
							+ "            @*------------$=            \r\n"
							+ "            @--------------@            \r\n"
							+ "           :@---*@@@@@@!---@,           \r\n"
							+ "           @~-;@#.....,#@:-=*           \r\n"
							+ "           @-$@$=:....;=#@*-@           \r\n"
							+ "           @!@=!*#@~~@$*!=@:@           \r\n"
							+ "          ,#@;    $@@-    !@@           \r\n"
							+ "          @@#=    #:=$    @@@;          \r\n"
							+ "          @@*@:  :@..@-  =@*@@          \r\n"
							+ "          @=*@#@@#...,@@@@$*#@          \r\n"
							+ "          @**$$..........@=**@          \r\n"
							+ "       @@@@@@@@@@@@@@.@@@@@@@@@@@       \r\n"
							+ "      ~=           -@           @.      \r\n"
							+ "      ~=           @-           #.      \r\n"
							+ "      ~=           @            #.      \r\n"
							+ "      $=          -#            #.      \r\n"
							+ "      @=          #~            #,      \r\n"
							+ "     @$=          @             #;      \r\n"
							+ "    :@*=         ~@             #;@,    \r\n"
							+ "    @:*=         *@@@@          #;;@    \r\n"
							+ "   #=:*=            *$          #;:#=   \r\n"
							+ "  .@:#@=            @.          #@#:@   \r\n"
							+ "  @!;=!=            @           #~$@@#  \r\n"
							+ "  @---!=           ~@           #~--@@  \r\n"
							+ " :#---!=           @-           #~---@. \r\n"
							+ " ==---!=           @            #~---#~ \r\n"
							+ " ;#---!=.                       #~---@, \r\n"
							+ "  @:--~@@@@@@@@@@@@.~@@@@@@@@@@@@---;@  \r\n"
							+ "  .@@##=~~~~~~~~~~~  ~~~~~~~~~~~@$#@@   \r\n"
							+ "     .:@========================@~.     \r\n"
							+ "       -;;;;;;;;;;;;;;;;;;;;;;;;,       ");
					System.out.println();
					System.out.println("!!����!! ��.S �ù�~ !!!");
					System.out.println();
					System.out.println("-----------------------------");
					System.out.println(" �ù� ����!! �������� ������õ !! �����Ͻðڽ��ϱ�? (��ȸ1��)");
					System.out.println("-----------------------------");
					System.out.println("[1] Yes(10���� ����) [2] NO");
					buy = sc.nextInt();
					music.music_plus();
					if (buy == 1) {
						num0 = num0 - 100000;
						System.out.println();
						System.out.println("===========================");
						System.out.println("� ������ ������ �����Ͻðڽ��ϱ�?");
						System.out.println("===========================");
						System.out.println("[1] �Ｚ����  [2] ��Ʈ����  [3] īī��");
					    int buy2 = sc.nextInt();
						music.music_plus();
					    if(buy2==1) {
					    	System.out.println("   ..                         ..                       ..                       \r\n"
					    			+ "                      @@@@=   @@@@   @@@$ :@@@  -@@@@,  @@ =@#  @@@  @@  !@@@@.                     \r\n"
					    			+ "                     !@; @@   @@@@   @@$$ @@@@  @@-:@=  @@ =@$  @#@- @@  @@,:@*                     \r\n"
					    			+ "                     !@# ~~  .@#=@,  @@*@ @=@@  @@!.--  @@ =@$  @##= @@  @@ ,!:                     \r\n"
					    			+ "                      @@@*   :@==@,  @@:@ @.@@  .@@@,   @@ =@$  @#*@ @@  @@ ---                     \r\n"
					    			+ "                       ;@@#  @@-;@#  @@ @,@.@@   .$@@;  @@ =@$  @# @.@@  @@ @@$                     \r\n"
					    			+ "                     ~;- @@. @@ .@@  @@ @~@ @@  ==.-@@  @@ =@#  @@ @:@@  @@ -@$                     \r\n"
					    			+ "                     *@= #@. @@  @@  @@ @@@ @@  @@,.@@  @@ $@;  @@ *@@@  @@.:@*                     \r\n"
					    			+ "                     .@@@@# .@@  @@  @@ #@= @@  :@@@@~  *@@@@   @@ -@@@  :@@@@.                     \r\n"
					    			+ "                       ..                         ..      .                         ");
					    	dao.buyNews(7);
					    } else if(buy2 == 2) {
					    	System.out.println("                                                                                           \r\n"
					    			+ "                                                                                                    \r\n"
					    			+ "          ,~~~~.     ,=###!   ,$$$$$$* =$$:    =$$-  :$$$$$$$.=$$=;   ;,  .!#$$:   ::      $        \r\n"
					    			+ "         ~-~---~.   ,#######  -######$ ###;    ###-      $    $.  -!  ;, ,#    -#  ;$-     #        \r\n"
					    			+ "        ----~~-~~   ########$ -###.... ###;    ###-      =    $.   #  ;, #      -= ;-$-    #        \r\n"
					    			+ "        ~-~----~-. :###  .$$$.-###...  ###;    ###-      =    $.  ,*  ;,-:       $ ;- $.   #        \r\n"
					    			+ "        ~-----~-~- *##~       -######. ###;    ###-      =    $$$$!   ;,!,       *,;-  #.  #        \r\n"
					    			+ "        ~~-------, !##!   ~~~ -###***  ###;    ###-      $    $. .#   ;,:-       =.;-   $  #        \r\n"
					    			+ "        ~---~----  -###;,*### ,###     ###;    ###-      $    $.  ,!  ;,.=       # ;-   ,# #        \r\n"
					    			+ "         ~-~~-~~-   =#######; ,###**** #######.#######   $    $.   *, ;, *:     =, ;-    -*#        \r\n"
					    			+ "          ~--~--     $#####!  -####### @######.#######   $    $.    # ;,  ;#:-!#,  ;-     ~#        \r\n"
					    			+ "           ...        ,;!;.    ,,,,,,. ,,,,,,, .,,,,,,   ,    ,     ...     --,    .       ,   ");
					    	dao.buyNews(8);
					    } else if(buy2 == 3) {
					    	System.out.println("                                                                                          \r\n"
					    			+ "                            -#.              ,#                                                    \r\n"
					    			+ "                            -#.              ,$                                                    \r\n"
					    			+ "                            -#.  -~   :!!~   ,$   ..   ,::.     .-.                                \r\n"
					    			+ "                            ~#.  $*  ;$==#;  ,$  .$!  *$$$$,   !#$$$.                              \r\n"
					    			+ "                            ~#..=*.      ;#  -$ .*=.  -.  **  !=- ,$*                              \r\n"
					    			+ "                            ~#.;#.       :#  -$ :#.       ~#  #;   ,$,                             \r\n"
					    			+ "                            ~#,$;    -!==$#  -$.#-    -~;;*# ,#:    #,                             \r\n"
					    			+ "                            ~# !#-  ,$;..;#  -$ *=   ,$;,,;# -#~    #,                             \r\n"
					    			+ "                            ~#  ==. ~#.  :#  -$ -$!  ~$   ~$ .#;   .#,                             \r\n"
					    			+ "                            ~#   ** -#:.:=#  -$  -$: ~$. ,*$  ==. .=*                              \r\n"
					    			+ "                            ~$   -=. !$$=~$  -=   ~$ .=##=*$   $#=$$-                              \r\n"
					    			+ "                                                   .   ~- .,   .~::  ");
					    	dao.buyNews(9);
					    }
					}
					
				
				}
		    System.out.println();
			System.out.println(cnt + ". ������ ���� �����ϼ���!");
			System.out.println("[1] �Ｚ���� [2] ��Ʈ���� [3] īī�� [4] �ƹ��͵� �������� �ʴ´�(��������)");
			int sel = sc.nextInt();
			music.music_plus();
			if (sel == 1) {
				if (cnt == 2) {
					num1 = ((num0 / 100) * 55);
				}
				if (cnt == 4) {
					num1 = (num0 / 100) * 120;
				}
				num0 = num0 + num1;
				System.out.println("1�� ���� ���;� : " + num1 + "��");
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");

			} else if (sel == 2) {
				if (cnt == 2) {
					num1 = -((num0 / 100) * 35);
				}
				if (cnt == 4) {
					num1 = -(num0 / 100) * 70;
				}

				num0 = num0 + num1;
				System.out.println("1�� ���� ���;� : " + num1 + "��");
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");

			} else if (sel == 3) {
				if (cnt == 2) {
					num1 = -(num0 / 100) * 60;
				}
				if (cnt == 4) {
					num1 = (num0 / 100) * 130;
				}
				num0 = num0 + num1;
				System.out.println("1�� ���� ���;� : " + num1 + "��");
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");

			} else if (sel == 4) {
				num0 = num0 + sum;
				if(cnt == 2 || cnt == 4) {
					if(buy == 1) {
						System.out.println("1�� ���� ���;� : - 100000��" );
				} else {
					System.out.println("1�� ���� ���;� : " + sum + "��");
				}
				}
				
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");

			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");

			}
			cnt++;
			if (cnt == 6) {
				String sql = "update user_info set SEEDMONEY = ? where id = ?";

				try {
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1,num0);				
					psmt.setString(2,id);
					rs = psmt.executeUpdate();
					System.out.println("����Ǿ����ϴ�.");
					Rank rank = new Rank();
					rank.gamerank();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {
				System.out.println("����Ͻðڽ��ϱ�?");
				System.out.println("[1] Yes [2] NO");
				num2 = sc.nextInt();
				music.music_plus();
			}
			if (num2 == 2) {
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");
				System.out.println("����Ǿ����ϴ�!");
				break;
			}
			}
		}
		

	

	public void investmid(String id) {
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB�ּ�
		String db_id = "campus_e_0516_2"; // db_id
		String db_pw = "smhrd2"; // db_pw

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int num0 = 1000000;

		int cnt = 1;
		int sum = 0;
		int num2 = 0;
		int buy = 0;

		// ���ͷ� 100% ������ -55%

		int num1 = ((num0 / 100) * r.nextInt(155) - 55);
		while (cnt <= 5) {
			dao.selectNews(cnt);
			// �˰���
			if (cnt == 2 ) {
				System.out.println(
						"                                 \r\n"
						+ "                  -;;,                  \r\n"
						+ "               -@@#==#@@.               \r\n"
						+ "              #@~------~-.              \r\n"
						+ "             !@----------@-             \r\n"
						+ "             @-----------~@             \r\n"
						+ "            @*------------$=            \r\n"
						+ "            @--------------@            \r\n"
						+ "           :@---*@@@@@@!---@,           \r\n"
						+ "           @~-;@#.....,#@:-=*           \r\n"
						+ "           @-$@$=:....;=#@*-@           \r\n"
						+ "           @!@=!*#@~~@$*!=@:@           \r\n"
						+ "          ,#@;    $@@-    !@@           \r\n"
						+ "          @@#=    #:=$    @@@;          \r\n"
						+ "          @@*@:  :@..@-  =@*@@          \r\n"
						+ "          @=*@#@@#...,@@@@$*#@          \r\n"
						+ "          @**$$..........@=**@          \r\n"
						+ "       @@@@@@@@@@@@@@.@@@@@@@@@@@       \r\n"
						+ "      ~=           -@           @.      \r\n"
						+ "      ~=           @-           #.      \r\n"
						+ "      ~=           @            #.      \r\n"
						+ "      $=          -#            #.      \r\n"
						+ "      @=          #~            #,      \r\n"
						+ "     @$=          @             #;      \r\n"
						+ "    :@*=         ~@             #;@,    \r\n"
						+ "    @:*=         *@@@@          #;;@    \r\n"
						+ "   #=:*=            *$          #;:#=   \r\n"
						+ "  .@:#@=            @.          #@#:@   \r\n"
						+ "  @!;=!=            @           #~$@@#  \r\n"
						+ "  @---!=           ~@           #~--@@  \r\n"
						+ " :#---!=           @-           #~---@. \r\n"
						+ " ==---!=           @            #~---#~ \r\n"
						+ " ;#---!=.                       #~---@, \r\n"
						+ "  @:--~@@@@@@@@@@@@.~@@@@@@@@@@@@---;@  \r\n"
						+ "  .@@##=~~~~~~~~~~~  ~~~~~~~~~~~@$#@@   \r\n"
						+ "     .:@========================@~.     \r\n"
						+ "       -;;;;;;;;;;;;;;;;;;;;;;;;,       ");
				System.out.println();
				System.out.println("!!����!! ��.S �ù�~ !!!");
				System.out.println();
				System.out.println("-----------------------------");
				System.out.println(" �ù� ����!! �������� ������õ !! �����Ͻðڽ��ϱ�? (��ȸ1��)");
				System.out.println("-----------------------------");
					System.out.println("[1] Yes(10���� ����) [2] NO");
					buy = sc.nextInt();
					music.music_plus();
					if (buy == 1) {
						num0 = num0 - 100000;
						System.out.println("==============================");
						System.out.println("� ������ ������ �����Ͻðڽ��ϱ�?");
						System.out.println("==============================");
						System.out.println("[1] �Ｚ����  [2] ��Ʈ����  [3] īī��");
					    int buy2 = sc.nextInt();
					    if(buy2==1) {
					    	System.out.println("                            ..                       ..                                         \\r\\n\"\r\n"
					    			+ "	+ \"                      @@@@=   @@@@   @@@$ :@@@  -@@@@,  @@ =@#  @@@  @@  !@@@@.                     \\r\\n\"\r\n"
					    			+ "	+ \"                     !@; @@   @@@@   @@$$ @@@@  @@-:@=  @@ =@$  @#@- @@  @@,:@*                     \\r\\n\"\r\n"
					    			+ "	+ \"                     !@# ~~  .@#=@,  @@*@ @=@@  @@!.--  @@ =@$  @##= @@  @@ ,!:                     \\r\\n\"\r\n"
					    			+ "	+ \"                      @@@*   :@==@,  @@:@ @.@@  .@@@,   @@ =@$  @#*@ @@  @@ ---                     \\r\\n\"\r\n"
					    			+ "	+ \"                       ;@@#  @@-;@#  @@ @,@.@@   .$@@;  @@ =@$  @# @.@@  @@ @@$                     \\r\\n\"\r\n"
					    			+ "	+ \"                     ~;- @@. @@ .@@  @@ @~@ @@  ==.-@@  @@ =@#  @@ @:@@  @@ -@$                     \\r\\n\"\r\n"
					    			+ "	+ \"                     *@= #@. @@  @@  @@ @@@ @@  @@,.@@  @@ $@;  @@ *@@@  @@.:@*                     \\r\\n\"\r\n"
					    			+ "	+ \"                     .@@@@# .@@  @@  @@ #@= @@  :@@@@~  *@@@@   @@ -@@@  :@@@@.                     \\r\\n\"\r\n"
					    			+ "	+ \"                       ..                         ..      .                         ");
					    	dao.buyNews(10);
					    } else if(buy2 == 2) {
					    	System.out.println("                                                                                           \r\n"
					    			+ "                                                                                                    \r\n"
					    			+ "          ,~~~~.     ,=###!   ,$$$$$$* =$$:    =$$-  :$$$$$$$.=$$=;   ;,  .!#$$:   ::      $        \r\n"
					    			+ "         ~-~---~.   ,#######  -######$ ###;    ###-      $    $.  -!  ;, ,#    -#  ;$-     #        \r\n"
					    			+ "        ----~~-~~   ########$ -###.... ###;    ###-      =    $.   #  ;, #      -= ;-$-    #        \r\n"
					    			+ "        ~-~----~-. :###  .$$$.-###...  ###;    ###-      =    $.  ,*  ;,-:       $ ;- $.   #        \r\n"
					    			+ "        ~-----~-~- *##~       -######. ###;    ###-      =    $$$$!   ;,!,       *,;-  #.  #        \r\n"
					    			+ "        ~~-------, !##!   ~~~ -###***  ###;    ###-      $    $. .#   ;,:-       =.;-   $  #        \r\n"
					    			+ "        ~---~----  -###;,*### ,###     ###;    ###-      $    $.  ,!  ;,.=       # ;-   ,# #        \r\n"
					    			+ "         ~-~~-~~-   =#######; ,###**** #######.#######   $    $.   *, ;, *:     =, ;-    -*#        \r\n"
					    			+ "          ~--~--     $#####!  -####### @######.#######   $    $.    # ;,  ;#:-!#,  ;-     ~#        \r\n"
					    			+ "           ...        ,;!;.    ,,,,,,. ,,,,,,, .,,,,,,   ,    ,     ...     --,    .       ,   ");
					    	dao.buyNews(11);
					    } else if(buy2 == 3) {
					    	System.out.println("                                                                   \r\n"
					    			+ "                            -#.              ,#                                                    \r\n"
					    			+ "                            -#.              ,$                                                    \r\n"
					    			+ "                            -#.  -~   :!!~   ,$   ..   ,::.     .-.                                \r\n"
					    			+ "                            ~#.  $*  ;$==#;  ,$  .$!  *$$$$,   !#$$$.                              \r\n"
					    			+ "                            ~#..=*.      ;#  -$ .*=.  -.  **  !=- ,$*                              \r\n"
					    			+ "                            ~#.;#.       :#  -$ :#.       ~#  #;   ,$,                             \r\n"
					    			+ "                            ~#,$;    -!==$#  -$.#-    -~;;*# ,#:    #,                             \r\n"
					    			+ "                            ~# !#-  ,$;..;#  -$ *=   ,$;,,;# -#~    #,                             \r\n"
					    			+ "                            ~#  ==. ~#.  :#  -$ -$!  ~$   ~$ .#;   .#,                             \r\n"
					    			+ "                            ~#   ** -#:.:=#  -$  -$: ~$. ,*$  ==. .=*                              \r\n"
					    			+ "                            ~$   -=. !$$=~$  -=   ~$ .=##=*$   $#=$$-                              \r\n"
					    			+ "                                                   .   ~- .,   .~::  ");
					    	dao.buyNews(12);
					    }
					}
					
				
				}if (cnt == 4 ) {
					System.out.println(
							"                                          \r\n"
							+ "                  -;;,                  \r\n"
							+ "               -@@#==#@@.               \r\n"
							+ "              #@~------~-.              \r\n"
							+ "             !@----------@-             \r\n"
							+ "             @-----------~@             \r\n"
							+ "            @*------------$=            \r\n"
							+ "            @--------------@            \r\n"
							+ "           :@---*@@@@@@!---@,           \r\n"
							+ "           @~-;@#.....,#@:-=*           \r\n"
							+ "           @-$@$=:....;=#@*-@           \r\n"
							+ "           @!@=!*#@~~@$*!=@:@           \r\n"
							+ "          ,#@;    $@@-    !@@           \r\n"
							+ "          @@#=    #:=$    @@@;          \r\n"
							+ "          @@*@:  :@..@-  =@*@@          \r\n"
							+ "          @=*@#@@#...,@@@@$*#@          \r\n"
							+ "          @**$$..........@=**@          \r\n"
							+ "       @@@@@@@@@@@@@@.@@@@@@@@@@@       \r\n"
							+ "      ~=           -@           @.      \r\n"
							+ "      ~=           @-           #.      \r\n"
							+ "      ~=           @            #.      \r\n"
							+ "      $=          -#            #.      \r\n"
							+ "      @=          #~            #,      \r\n"
							+ "     @$=          @             #;      \r\n"
							+ "    :@*=         ~@             #;@,    \r\n"
							+ "    @:*=         *@@@@          #;;@    \r\n"
							+ "   #=:*=            *$          #;:#=   \r\n"
							+ "  .@:#@=            @.          #@#:@   \r\n"
							+ "  @!;=!=            @           #~$@@#  \r\n"
							+ "  @---!=           ~@           #~--@@  \r\n"
							+ " :#---!=           @-           #~---@. \r\n"
							+ " ==---!=           @            #~---#~ \r\n"
							+ " ;#---!=.                       #~---@, \r\n"
							+ "  @:--~@@@@@@@@@@@@.~@@@@@@@@@@@@---;@  \r\n"
							+ "  .@@##=~~~~~~~~~~~  ~~~~~~~~~~~@$#@@   \r\n"
							+ "     .:@========================@~.     \r\n"
							+ "       -;;;;;;;;;;;;;;;;;;;;;;;;,       ");
					System.out.println();
					System.out.println("!!����!! ��.S �ù�~ !!!");
					System.out.println();
					System.out.println("-----------------------------");
					System.out.println(" �ù� ����!! �������� ������õ !! �����Ͻðڽ��ϱ�? (��ȸ1��)");
					System.out.println("-----------------------------");
					System.out.println("[1] Yes(10���� ����) [2] NO");
					buy = sc.nextInt();
					music.music_plus();
					if (buy == 1) {
						num0 = num0 - 100000;
						System.out.println("==============================");
						System.out.println("� ������ ������ �����Ͻðڽ��ϱ�?");
						System.out.println("==============================");
						System.out.println("[1] �Ｚ����  [2] ��Ʈ����  [3] īī��");
					    int buy2 = sc.nextInt();
						music.music_plus();
					    if(buy2==1) {
					    	System.out.println("                            ..                       ..                                         \\r\\n\"\r\n"
					    			+ "	+ \"                      @@@@=   @@@@   @@@$ :@@@  -@@@@,  @@ =@#  @@@  @@  !@@@@.                     \\r\\n\"\r\n"
					    			+ "	+ \"                     !@; @@   @@@@   @@$$ @@@@  @@-:@=  @@ =@$  @#@- @@  @@,:@*                     \\r\\n\"\r\n"
					    			+ "	+ \"                     !@# ~~  .@#=@,  @@*@ @=@@  @@!.--  @@ =@$  @##= @@  @@ ,!:                     \\r\\n\"\r\n"
					    			+ "	+ \"                      @@@*   :@==@,  @@:@ @.@@  .@@@,   @@ =@$  @#*@ @@  @@ ---                     \\r\\n\"\r\n"
					    			+ " + \"                       ;@@#  @@-;@#  @@ @,@.@@   .$@@;  @@ =@$  @# @.@@  @@ @@$                     \\r\\n\"\r\n"
					    			+ "	+ \"                     ~;- @@. @@ .@@  @@ @~@ @@  ==.-@@  @@ =@#  @@ @:@@  @@ -@$                     \\r\\n\"\r\n"
					    			+ "	+ \"                     *@= #@. @@  @@  @@ @@@ @@  @@,.@@  @@ $@;  @@ *@@@  @@.:@*                     \\r\\n\"\r\n"
					    			+ "	+ \"                     .@@@@# .@@  @@  @@ #@= @@  :@@@@~  *@@@@   @@ -@@@  :@@@@.                     \\r\\n\"\r\n"
					    			+ "	+ \"                       ..                         ..      .                         ");
					    	dao.buyNews(7);
					    } else if(buy2 == 2) {
					    	System.out.println("                                                                                         \r\n"
					    			+ "                                                                                                    \r\n"
					    			+ "          ,~~~~.     ,=###!   ,$$$$$$* =$$:    =$$-  :$$$$$$$.=$$=;   ;,  .!#$$:   ::      $        \r\n"
					    			+ "         ~-~---~.   ,#######  -######$ ###;    ###-      $    $.  -!  ;, ,#    -#  ;$-     #        \r\n"
					    			+ "        ----~~-~~   ########$ -###.... ###;    ###-      =    $.   #  ;, #      -= ;-$-    #        \r\n"
					    			+ "        ~-~----~-. :###  .$$$.-###...  ###;    ###-      =    $.  ,*  ;,-:       $ ;- $.   #        \r\n"
					    			+ "        ~-----~-~- *##~       -######. ###;    ###-      =    $$$$!   ;,!,       *,;-  #.  #        \r\n"
					    			+ "        ~~-------, !##!   ~~~ -###***  ###;    ###-      $    $. .#   ;,:-       =.;-   $  #        \r\n"
					    			+ "        ~---~----  -###;,*### ,###     ###;    ###-      $    $.  ,!  ;,.=       # ;-   ,# #        \r\n"
					    			+ "         ~-~~-~~-   =#######; ,###**** #######.#######   $    $.   *, ;, *:     =, ;-    -*#        \r\n"
					    			+ "          ~--~--     $#####!  -####### @######.#######   $    $.    # ;,  ;#:-!#,  ;-     ~#        \r\n"
					    			+ "           ...        ,;!;.    ,,,,,,. ,,,,,,, .,,,,,,   ,    ,     ...     --,    .       ,   ");
					    	dao.buyNews(8);
					    } else if(buy2 == 3) {
					    	System.out.println("                                                                                          \r\n"
					    			+ "                            -#.              ,#                                                    \r\n"
					    			+ "                            -#.              ,$                                                    \r\n"
					    			+ "                            -#.  -~   :!!~   ,$   ..   ,::.     .-.                                \r\n"
					    			+ "                            ~#.  $*  ;$==#;  ,$  .$!  *$$$$,   !#$$$.                              \r\n"
					    			+ "                            ~#..=*.      ;#  -$ .*=.  -.  **  !=- ,$*                              \r\n"
					    			+ "                            ~#.;#.       :#  -$ :#.       ~#  #;   ,$,                             \r\n"
					    			+ "                            ~#,$;    -!==$#  -$.#-    -~;;*# ,#:    #,                             \r\n"
					    			+ "                            ~# !#-  ,$;..;#  -$ *=   ,$;,,;# -#~    #,                             \r\n"
					    			+ "                            ~#  ==. ~#.  :#  -$ -$!  ~$   ~$ .#;   .#,                             \r\n"
					    			+ "                            ~#   ** -#:.:=#  -$  -$: ~$. ,*$  ==. .=*                              \r\n"
					    			+ "                            ~$   -=. !$$=~$  -=   ~$ .=##=*$   $#=$$-                              \r\n"
					    			+ "                                                   .   ~- .,   .~::  ");
					    	dao.buyNews(9);
					    }
					}
					
				
				}

			num1 = ((num0 / 100) * r.nextInt(155) - 55);
			System.out.println();
			System.out.println(cnt + ". ������ ���� �����ϼ���!");
			System.out.println("[1] �Ｚ���� [2] ��Ʈ���� [3] īī�� [4] �ƹ��͵� �������� �ʴ´�(��������)");
			int sel = sc.nextInt();
			music.music_plus();
			if (sel == 1) {
				if (cnt == 2) {
					num1 = ((num0 / 100) * 60);
				}
				if (cnt == 4) {
					num1 = -(num0 / 100) * 40;
				}
				num0 = num0 + num1;
				System.out.println("1�� ���� ���;� : " + num1 + "��");
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");

			} else if (sel == 2) {
				if (cnt == 2) {
					num1 = -((num0 / 100) * 35);
				}
				if (cnt == 4) {
					num1 = -(num0 / 100) * 45;
				}

				num0 = num0 + num1;
				System.out.println("1�� ���� ���;� : " + num1 + "��");
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");

			} else if (sel == 3) {
				if (cnt == 2) {
					num1 = -(num0 / 100) * 36;
				}
				if (cnt == 4) {
					num1 = (num0 / 100) * 75;
				}
				num0 = num0 + num1;
				System.out.println("1�� ���� ���;� : " + num1 + "��");
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");

			} else if (sel == 4) {
				num0 = num0 + sum;
				if(cnt == 2 || cnt == 4) {
					if(buy == 1) {
						System.out.println("1�� ���� ���;� : - 100000��" );
				} else {
					System.out.println("1�� ���� ���;� : " + sum + "��");
				}
				}
				
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");
	

			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");

			}
			cnt++;
			if (cnt == 6) {
				String sql = "update user_info set SEEDMONEY = ? where id = ?";

				try {
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1,num0);				
					psmt.setString(2,id);
					rs = psmt.executeUpdate();
					System.out.println("����Ǿ����ϴ�.");
					Rank rank = new Rank();
					rank.gamerank();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("����Ͻðڽ��ϱ�?");
				System.out.println("[1] Yes [2] NO");
				num2 = sc.nextInt();
				music.music_plus();
			}
			if (num2 == 2) {
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");
				System.out.println("����Ǿ����ϴ�!");
				break;
			}

		}

	}

	public void investlow(String id) {
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB�ּ�
		String db_id = "campus_e_0516_2"; // db_id
		String db_pw = "smhrd2"; // db_pw

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int num0 = 1000000;

		int cnt = 1;
		int sum = 0;
		int num2 = 0;
		int buy = 0;

		// ���ͷ� 60% ������ -35%

		int num1 = ((num0 / 100) * r.nextInt(95) - 35);
		while (cnt <= 5) {
			// �˰���
			dao.selectNews(cnt);
			if (cnt == 2 ) {
				System.out.println(
						"                                 \r\n"
						+ "                  -;;,                  \r\n"
						+ "               -@@#==#@@.               \r\n"
						+ "              #@~------~-.              \r\n"
						+ "             !@----------@-             \r\n"
						+ "             @-----------~@             \r\n"
						+ "            @*------------$=            \r\n"
						+ "            @--------------@            \r\n"
						+ "           :@---*@@@@@@!---@,           \r\n"
						+ "           @~-;@#.....,#@:-=*           \r\n"
						+ "           @-$@$=:....;=#@*-@           \r\n"
						+ "           @!@=!*#@~~@$*!=@:@           \r\n"
						+ "          ,#@;    $@@-    !@@           \r\n"
						+ "          @@#=    #:=$    @@@;          \r\n"
						+ "          @@*@:  :@..@-  =@*@@          \r\n"
						+ "          @=*@#@@#...,@@@@$*#@          \r\n"
						+ "          @**$$..........@=**@          \r\n"
						+ "       @@@@@@@@@@@@@@.@@@@@@@@@@@       \r\n"
						+ "      ~=           -@           @.      \r\n"
						+ "      ~=           @-           #.      \r\n"
						+ "      ~=           @            #.      \r\n"
						+ "      $=          -#            #.      \r\n"
						+ "      @=          #~            #,      \r\n"
						+ "     @$=          @             #;      \r\n"
						+ "    :@*=         ~@             #;@,    \r\n"
						+ "    @:*=         *@@@@          #;;@    \r\n"
						+ "   #=:*=            *$          #;:#=   \r\n"
						+ "  .@:#@=            @.          #@#:@   \r\n"
						+ "  @!;=!=            @           #~$@@#  \r\n"
						+ "  @---!=           ~@           #~--@@  \r\n"
						+ " :#---!=           @-           #~---@. \r\n"
						+ " ==---!=           @            #~---#~ \r\n"
						+ " ;#---!=.                       #~---@, \r\n"
						+ "  @:--~@@@@@@@@@@@@.~@@@@@@@@@@@@---;@  \r\n"
						+ "  .@@##=~~~~~~~~~~~  ~~~~~~~~~~~@$#@@   \r\n"
						+ "     .:@========================@~.     \r\n"
						+ "       -;;;;;;;;;;;;;;;;;;;;;;;;,       ");
				System.out.println();
				System.out.println("!!����!! ��.S �ù�~ !!!");
				System.out.println();
				System.out.println("-----------------------------");
				System.out.println(" �ù� ����!! �������� ������õ !! �����Ͻðڽ��ϱ�? (��ȸ1��)");
				System.out.println("-----------------------------");
					System.out.println("[1] Yes(10���� ����) [2] NO");
					buy = sc.nextInt();
					music.music_plus();
					if (buy == 1) {
						num0 = num0 - 100000;
						System.out.println("==============================");
						System.out.println("� ������ ������ �����Ͻðڽ��ϱ�?");
						System.out.println("==============================");
						System.out.println("[1] �Ｚ����  [2] ��Ʈ����  [3] īī��");
					    int buy2 = sc.nextInt();
						music.music_plus();
					    if(buy2==1) {
					    	System.out.println("                            ..                       ..                                         \\r\\n\"\r\n"
					    			+ "	+ \"                      @@@@=   @@@@   @@@$ :@@@  -@@@@,  @@ =@#  @@@  @@  !@@@@.                     \\r\\n\"\r\n"
					    			+ "	+ \"                     !@; @@   @@@@   @@$$ @@@@  @@-:@=  @@ =@$  @#@- @@  @@,:@*                     \\r\\n\"\r\n"
					    			+ "	+ \"                     !@# ~~  .@#=@,  @@*@ @=@@  @@!.--  @@ =@$  @##= @@  @@ ,!:                     \\r\\n\"\r\n"
					    			+ "	+ \"                      @@@*   :@==@,  @@:@ @.@@  .@@@,   @@ =@$  @#*@ @@  @@ ---                     \\r\\n\"\r\n"
					    			+ "	+ \"                       ;@@#  @@-;@#  @@ @,@.@@   .$@@;  @@ =@$  @# @.@@  @@ @@$                     \\r\\n\"\r\n"
					    			+ "	+ \"                     ~;- @@. @@ .@@  @@ @~@ @@  ==.-@@  @@ =@#  @@ @:@@  @@ -@$                     \\r\\n\"\r\n"
					    			+ "	+ \"                     *@= #@. @@  @@  @@ @@@ @@  @@,.@@  @@ $@;  @@ *@@@  @@.:@*                     \\r\\n\"\r\n"
					    			+ "	+ \"                     .@@@@# .@@  @@  @@ #@= @@  :@@@@~  *@@@@   @@ -@@@  :@@@@.                     \\r\\n\"\r\n"
					    			+ "	+ \"                       ..                         ..      .                         ");
					    	dao.buyNews(10);
					    } else if(buy2 == 2) {
					    	System.out.println("                                                                                           \r\n"
					    			+ "                                                                                                    \r\n"
					    			+ "          ,~~~~.     ,=###!   ,$$$$$$* =$$:    =$$-  :$$$$$$$.=$$=;   ;,  .!#$$:   ::      $        \r\n"
					    			+ "         ~-~---~.   ,#######  -######$ ###;    ###-      $    $.  -!  ;, ,#    -#  ;$-     #        \r\n"
					    			+ "        ----~~-~~   ########$ -###.... ###;    ###-      =    $.   #  ;, #      -= ;-$-    #        \r\n"
					    			+ "        ~-~----~-. :###  .$$$.-###...  ###;    ###-      =    $.  ,*  ;,-:       $ ;- $.   #        \r\n"
					    			+ "        ~-----~-~- *##~       -######. ###;    ###-      =    $$$$!   ;,!,       *,;-  #.  #        \r\n"
					    			+ "        ~~-------, !##!   ~~~ -###***  ###;    ###-      $    $. .#   ;,:-       =.;-   $  #        \r\n"
					    			+ "        ~---~----  -###;,*### ,###     ###;    ###-      $    $.  ,!  ;,.=       # ;-   ,# #        \r\n"
					    			+ "         ~-~~-~~-   =#######; ,###**** #######.#######   $    $.   *, ;, *:     =, ;-    -*#        \r\n"
					    			+ "          ~--~--     $#####!  -####### @######.#######   $    $.    # ;,  ;#:-!#,  ;-     ~#        \r\n"
					    			+ "           ...        ,;!;.    ,,,,,,. ,,,,,,, .,,,,,,   ,    ,     ...     --,    .       ,   ");
					    	dao.buyNews(11);
					    } else if(buy2 == 3) {
					    	System.out.println("                                                                                          \r\n"
					    			+ "                            -#.              ,#                                                    \r\n"
					    			+ "                            -#.              ,$                                                    \r\n"
					    			+ "                            -#.  -~   :!!~   ,$   ..   ,::.     .-.                                \r\n"
					    			+ "                            ~#.  $*  ;$==#;  ,$  .$!  *$$$$,   !#$$$.                              \r\n"
					    			+ "                            ~#..=*.      ;#  -$ .*=.  -.  **  !=- ,$*                              \r\n"
					    			+ "                            ~#.;#.       :#  -$ :#.       ~#  #;   ,$,                             \r\n"
					    			+ "                            ~#,$;    -!==$#  -$.#-    -~;;*# ,#:    #,                             \r\n"
					    			+ "                            ~# !#-  ,$;..;#  -$ *=   ,$;,,;# -#~    #,                             \r\n"
					    			+ "                            ~#  ==. ~#.  :#  -$ -$!  ~$   ~$ .#;   .#,                             \r\n"
					    			+ "                            ~#   ** -#:.:=#  -$  -$: ~$. ,*$  ==. .=*                              \r\n"
					    			+ "                            ~$   -=. !$$=~$  -=   ~$ .=##=*$   $#=$$-                              \r\n"
					    			+ "                                                   .   ~- .,   .~::  ");
					    	dao.buyNews(12);
					    }
					}
					
				
				}if (cnt == 4 ) {
					System.out.println(
							"                                 \r\n"
							+ "                  -;;,                  \r\n"
							+ "               -@@#==#@@.               \r\n"
							+ "              #@~------~-.              \r\n"
							+ "             !@----------@-             \r\n"
							+ "             @-----------~@             \r\n"
							+ "            @*------------$=            \r\n"
							+ "            @--------------@            \r\n"
							+ "           :@---*@@@@@@!---@,           \r\n"
							+ "           @~-;@#.....,#@:-=*           \r\n"
							+ "           @-$@$=:....;=#@*-@           \r\n"
							+ "           @!@=!*#@~~@$*!=@:@           \r\n"
							+ "          ,#@;    $@@-    !@@           \r\n"
							+ "          @@#=    #:=$    @@@;          \r\n"
							+ "          @@*@:  :@..@-  =@*@@          \r\n"
							+ "          @=*@#@@#...,@@@@$*#@          \r\n"
							+ "          @**$$..........@=**@          \r\n"
							+ "       @@@@@@@@@@@@@@.@@@@@@@@@@@       \r\n"
							+ "      ~=           -@           @.      \r\n"
							+ "      ~=           @-           #.      \r\n"
							+ "      ~=           @            #.      \r\n"
							+ "      $=          -#            #.      \r\n"
							+ "      @=          #~            #,      \r\n"
							+ "     @$=          @             #;      \r\n"
							+ "    :@*=         ~@             #;@,    \r\n"
							+ "    @:*=         *@@@@          #;;@    \r\n"
							+ "   #=:*=            *$          #;:#=   \r\n"
							+ "  .@:#@=            @.          #@#:@   \r\n"
							+ "  @!;=!=            @           #~$@@#  \r\n"
							+ "  @---!=           ~@           #~--@@  \r\n"
							+ " :#---!=           @-           #~---@. \r\n"
							+ " ==---!=           @            #~---#~ \r\n"
							+ " ;#---!=.                       #~---@, \r\n"
							+ "  @:--~@@@@@@@@@@@@.~@@@@@@@@@@@@---;@  \r\n"
							+ "  .@@##=~~~~~~~~~~~  ~~~~~~~~~~~@$#@@   \r\n"
							+ "     .:@========================@~.     \r\n"
							+ "       -;;;;;;;;;;;;;;;;;;;;;;;;,       ");
					System.out.println();
					System.out.println("!!����!! ��.S �ù�~ !!!");
					System.out.println();
					System.out.println("-----------------------------");
					System.out.println(" �ù� ����!! �������� ������õ !! �����Ͻðڽ��ϱ�? (��ȸ1��)");
					System.out.println("-----------------------------");
					System.out.println("[1] Yes(10���� ����) [2] NO");
					buy = sc.nextInt();
					music.music_plus();
					if (buy == 1) {
						num0 = num0 - 100000;
						System.out.println();
						System.out.println("==========================");
						System.out.println("� ������ ������ �����Ͻðڽ��ϱ�?");
						System.out.println("==========================");
						System.out.println("[1] �Ｚ����  [2] ��Ʈ����  [3] īī��");
					    int buy2 = sc.nextInt();
						music.music_plus();
					    if(buy2==1) {
					    	System.out.println("                            ..                       ..                                         \\r\\n\"\r\n"
					    			+ "	+ \"                      @@@@=   @@@@   @@@$ :@@@  -@@@@,  @@ =@#  @@@  @@  !@@@@.                     \\r\\n\"\r\n"
					    			+ "	+ \"                     !@; @@   @@@@   @@$$ @@@@  @@-:@=  @@ =@$  @#@- @@  @@,:@*                     \\r\\n\"\r\n"
					    			+ "	+ \"                     !@# ~~  .@#=@,  @@*@ @=@@  @@!.--  @@ =@$  @##= @@  @@ ,!:                     \\r\\n\"\r\n"
					    			+ "	+ \"                      @@@*   :@==@,  @@:@ @.@@  .@@@,   @@ =@$  @#*@ @@  @@ ---                     \\r\\n\"\r\n"
					    			+ "	+ \"                       ;@@#  @@-;@#  @@ @,@.@@   .$@@;  @@ =@$  @# @.@@  @@ @@$                     \\r\\n\"\r\n"
					    			+ "	+ \"                     ~;- @@. @@ .@@  @@ @~@ @@  ==.-@@  @@ =@#  @@ @:@@  @@ -@$                     \\r\\n\"\r\n"
					    			+ "	+ \"                     *@= #@. @@  @@  @@ @@@ @@  @@,.@@  @@ $@;  @@ *@@@  @@.:@*                     \\r\\n\"\r\n"
					    			+ "	+ \"                     .@@@@# .@@  @@  @@ #@= @@  :@@@@~  *@@@@   @@ -@@@  :@@@@.                     \\r\\n\"\r\n"
					    			+ "	+ \"                       ..                         ..      .                         ");
					    	dao.buyNews(7);
					    } else if(buy2 == 2) {
					    	System.out.println("                                                                                           \r\n"
					    			+ "                                                                                                    \r\n"
					    			+ "          ,~~~~.     ,=###!   ,$$$$$$* =$$:    =$$-  :$$$$$$$.=$$=;   ;,  .!#$$:   ::      $        \r\n"
					    			+ "         ~-~---~.   ,#######  -######$ ###;    ###-      $    $.  -!  ;, ,#    -#  ;$-     #        \r\n"
					    			+ "        ----~~-~~   ########$ -###.... ###;    ###-      =    $.   #  ;, #      -= ;-$-    #        \r\n"
					    			+ "        ~-~----~-. :###  .$$$.-###...  ###;    ###-      =    $.  ,*  ;,-:       $ ;- $.   #        \r\n"
					    			+ "        ~-----~-~- *##~       -######. ###;    ###-      =    $$$$!   ;,!,       *,;-  #.  #        \r\n"
					    			+ "        ~~-------, !##!   ~~~ -###***  ###;    ###-      $    $. .#   ;,:-       =.;-   $  #        \r\n"
					    			+ "        ~---~----  -###;,*### ,###     ###;    ###-      $    $.  ,!  ;,.=       # ;-   ,# #        \r\n"
					    			+ "         ~-~~-~~-   =#######; ,###**** #######.#######   $    $.   *, ;, *:     =, ;-    -*#        \r\n"
					    			+ "          ~--~--     $#####!  -####### @######.#######   $    $.    # ;,  ;#:-!#,  ;-     ~#        \r\n"
					    			+ "           ...        ,;!;.    ,,,,,,. ,,,,,,, .,,,,,,   ,    ,     ...     --,    .       ,   ");
					    	dao.buyNews(8);
					    } else if(buy2 == 3) {
					    	System.out.println("                                                                                          \r\n"
					    			+ "                            -#.              ,#                                                    \r\n"
					    			+ "                            -#.              ,$                                                    \r\n"
					    			+ "                            -#.  -~   :!!~   ,$   ..   ,::.     .-.                                \r\n"
					    			+ "                            ~#.  $*  ;$==#;  ,$  .$!  *$$$$,   !#$$$.                              \r\n"
					    			+ "                            ~#..=*.      ;#  -$ .*=.  -.  **  !=- ,$*                              \r\n"
					    			+ "                            ~#.;#.       :#  -$ :#.       ~#  #;   ,$,                             \r\n"
					    			+ "                            ~#,$;    -!==$#  -$.#-    -~;;*# ,#:    #,                             \r\n"
					    			+ "                            ~# !#-  ,$;..;#  -$ *=   ,$;,,;# -#~    #,                             \r\n"
					    			+ "                            ~#  ==. ~#.  :#  -$ -$!  ~$   ~$ .#;   .#,                             \r\n"
					    			+ "                            ~#   ** -#:.:=#  -$  -$: ~$. ,*$  ==. .=*                              \r\n"
					    			+ "                            ~$   -=. !$$=~$  -=   ~$ .=##=*$   $#=$$-                              \r\n"
					    			+ "                                                   .   ~- .,   .~::  ");
					    	dao.buyNews(9);
					    }
					}
					
				
				}

			num1 = ((num0 / 100) * r.nextInt(95) - 35);
			
			System.out.println();
			System.out.println(cnt + ". ������ ���� �����ϼ���!");
			System.out.println("[1] �Ｚ���� [2] ��Ʈ���� [3] īī�� [4] �ƹ��͵� �������� �ʴ´�(��������)");
			int sel = sc.nextInt();
			music.music_plus();
			if (sel == 1) {
				if (cnt == 2) {
					num1 = ((num0 / 100) * 50);
				}
				if (cnt == 4) {
					num1 = -(num0 / 100) * 30;
				}
				num0 = num0 + num1;
				System.out.println("1�� ���� ���;� : " + num1 + "��");
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");

			} else if (sel == 2) {
				if (cnt == 2) {
					num1 = -((num0 / 100) * 30);
				}
				if (cnt == 4) {
					num1 = -(num0 / 100) * 25;
				}

				num0 = num0 + num1;
				System.out.println("1�� ���� ���;� : " + num1 + "��");
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");

			} else if (sel == 3) {
				if (cnt == 2) {
					num1 = -(num0 / 100) * 30;
				}
				if (cnt == 4) {
					num1 = (num0 / 100) * 60;
				}
				num0 = num0 + num1;
				System.out.println("1�� ���� ���;� : " + num1 + "��");
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");

			} else if (sel == 4) {
				num0 = num0 + sum;
				if(cnt == 2 || cnt == 4) {
					if(buy == 1) {
						System.out.println("1�� ���� ���;� : - 100000��" );
				}  else {
					System.out.println("1�� ���� ���;� : " + sum + "��");
				}
				}
				
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");

			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");

			}
			cnt++;
			if (cnt == 6) {
				String sql = "update user_info set SEEDMONEY = ? where id = ?";

				try {
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1,num0);				
					psmt.setString(2,id);
					rs = psmt.executeUpdate();
					System.out.println("����Ǿ����ϴ�.");
					Rank rank = new Rank();
					rank.gamerank();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("����Ͻðڽ��ϱ�?");
				System.out.println("[1] Yes [2] NO");
				num2 = sc.nextInt();
				music.music_plus();
			}
			if (num2 == 2) {
				System.out.println("�ܾ��� " + num0 + "�� �Դϴ�.");
				System.out.println("����Ǿ����ϴ�!");
				break;
			}

		}

	}
}
