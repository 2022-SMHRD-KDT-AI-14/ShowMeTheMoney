package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Invest {
	Connection conn; // DB 연결을 위한 객체
	PreparedStatement psmt; // SQL문을 실행하는 객체
	int rs; // Query의 결과값을 받아오는 객체

	MusicFile music = new MusicFile();
	public void investhigh(String id) {	
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int num0 = 1000000;
		int cnt = 1;
		int sum = 0;
		int num2 = 0;
		int num3 = 1;

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB주소
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

		// 이익률 140% 손해율 -70%

		int num1 = (num0 / 100) * (r.nextInt(210) - 70);

		while (cnt <= 5) {
			// 알고리즘

			num1 = (num0 / 100) * (r.nextInt(210) - 70);
			if (cnt == 2 || cnt == 4) {
				System.out.println("정보를 구매하시겠습니까?");
				System.out.println(" [1] YES(10만원 차감)  [2] NO");
				int buy = sc.nextInt();
				music.music_plus();
				if (buy == 1) {
					num0 = num0 - 100000;
				}
			}
			System.out.println(cnt + ". 투자할 곳을 선택하세요!");
			System.out.println("[1] 삼성전자 [2] 셀트리온 [3] 카카오 [4] 아무것도 선택하지 않는다(원금유지)");
			int sel = sc.nextInt();
			music.music_plus();
			if (sel == 1) {
				if (cnt == 2) {
					num1 = ((num0 / 100) * 55);
				}
				if (cnt == 4) {
					num1 = - (num0 / 100) * 60;
				}
				num0 = num0 + num1;
				System.out.println("1년 투자 손익액 : " + num1);
				System.out.println("잔액은 " + num0 + "입니다.");

			} else if (sel == 2) {
				if (cnt == 2) {
					num1 = -((num0 / 100) * 35);
				}
				if (cnt == 4) {
					num1 = -(num0 / 100) * 70;
				}

				num0 = num0 + num1;
				System.out.println("1년 투자 손익액 : " + num1);
				System.out.println("잔액은 " + num0 + "원 입니다.");

			} else if (sel == 3) {
				if (cnt == 2) {
					num1 = -(num0 / 100) * 60;
				}
				if (cnt == 4) {
					num1 = (num0 / 100) * 110;
				}
				num0 = num0 + num1;
				System.out.println("1년 투자 손익액 : " + num1);
				System.out.println("잔액은 " + num0 + "원 입니다.");

			} else if (sel == 4) {
				num0 = num0 + sum;
				System.out.println("1년 투자 손익액 : " + num1);
				System.out.println("잔액은 " + num0 + "원 입니다.");

			} else {
				System.out.println("잘못입력하셨습니다.");

			}
			cnt++;
			if (cnt == 6) {
				String sql = "update user_info set SEEDMONEY = ? where id = ?";

				try {
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1,num0);				
					psmt.setString(2,id);
					rs = psmt.executeUpdate();
					System.out.println("종료되었습니다.");
					Rank rank = new Rank();
					rank.gamerank();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {
				System.out.println("계속하시겠습니까?");
				System.out.println("[1] Yes [2] NO");
				num2 = sc.nextInt();
				music.music_plus();
			}
			if (num2 == 2) {
				System.out.println("잔액은 " + num0 + "원 입니다.");
				System.out.println("종료되었습니다!");
				break;
			}

		}

	}

	public void investmid() {
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB주소
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

		// 이익률 100% 손해율 -55%

		int num1 = ((num0 / 100) * r.nextInt(155) - 55);
		while (cnt <= 5) {
			// 알고리즘
			if (cnt == 2 || cnt == 4) {
				System.out.println("정보를 구매하시겠습니까?");
				System.out.println(" [1] YES(10만원 차감)  [2] NO");
				int buy = sc.nextInt();
				music.music_plus();
				
				if (buy == 1) {
					num0 = num0 - 100000;
				}
			}

			num1 = ((num0 / 100) * r.nextInt(155) - 55);
			System.out.println(cnt + ". 투자할 곳을 선택하세요!");
			System.out.println("[1] 삼성전자 [2] 셀트리온 [3] 카카오 [4] 아무것도 선택하지 않는다(원금유지)");
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
				System.out.println("1년 투자 손익액 : " + num1);
				System.out.println("잔액은 " + num0 + "입니다.");

			} else if (sel == 2) {
				if (cnt == 2) {
					num1 = -((num0 / 100) * 35);
				}
				if (cnt == 4) {
					num1 = -(num0 / 100) * 45;
				}

				num0 = num0 + num1;
				System.out.println("1년 투자 손익액 : " + num1);
				System.out.println("잔액은 " + num0 + "원 입니다.");

			} else if (sel == 3) {
				if (cnt == 2) {
					num1 = -(num0 / 100) * 36;
				}
				if (cnt == 4) {
					num1 = (num0 / 100) * 75;
				}
				num0 = num0 + num1;
				System.out.println("1년 투자 손익액 : " + num1);
				System.out.println("잔액은 " + num0 + "원 입니다.");

			} else if (sel == 4) {
				num0 = num0 + sum;
				System.out.println("1년 투자 손익액 : " + num1);
				System.out.println("잔액은 " + num0 + "원 입니다.");

			} else {
				System.out.println("잘못입력하셨습니다.");

			}
			cnt++;
			if (cnt == 6) {
				System.out.println("종료되었습니다.");
			} else {
				System.out.println("계속하시겠습니까?");
				System.out.println("[1] Yes [2] NO");
				num2 = sc.nextInt();
				music.music_plus();
			}
			if (num2 == 2) {
				System.out.println("잔액은 " + num0 + "원 입니다.");
				System.out.println("종료되었습니다!");
				break;
			}

		}

	}

	public void investlow() {
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB주소
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

		// 이익률 70% 손해율 -35%

		int num1 = ((num0 / 100) * r.nextInt(95) - 35);
		while (cnt <= 5) {
			// 알고리즘
			if (cnt == 2 || cnt == 4) {
				System.out.println("정보를 구매하시겠습니까?");
				System.out.println("[1] YES(10만원 차감)  [2] NO");
				int buy = sc.nextInt();
				music.music_plus();
				if (buy == 1) {
					num0 = num0 - 100000;
				}
			}

			num1 = ((num0 / 100) * r.nextInt(95) - 35);
			System.out.println(cnt + ". 투자할 곳을 선택하세요!");
			System.out.println("[1] 삼성전자 [2] 셀트리온 [3] 카카오 [4] 아무것도 선택하지 않는다(원금유지)");
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
				System.out.println("1년 투자 손익액 : " + num1);
				System.out.println("잔액은 " + num0 + "입니다.");

			} else if (sel == 2) {
				if (cnt == 2) {
					num1 = -((num0 / 100) * 30);
				}
				if (cnt == 4) {
					num1 = -(num0 / 100) * 25;
				}

				num0 = num0 + num1;
				System.out.println("1년 투자 손익액 : " + num1);
				System.out.println("잔액은 " + num0 + "원 입니다.");

			} else if (sel == 3) {
				if (cnt == 2) {
					num1 = -(num0 / 100) * 30;
				}
				if (cnt == 4) {
					num1 = (num0 / 100) * 60;
				}
				num0 = num0 + num1;
				System.out.println("1년 투자 손익액 : " + num1);
				System.out.println("잔액은 " + num0 + "원 입니다.");

			} else if (sel == 4) {
				num0 = num0 + sum;
				System.out.println("1년 투자 손익액 : " + num1);
				System.out.println("잔액은 " + num0 + "원 입니다.");

			} else {
				System.out.println("잘못입력하셨습니다.");

			}
			cnt++;
			if (cnt == 6) {
				System.out.println("종료되었습니다.");
			} else {
				System.out.println("계속하시겠습니까?");
				System.out.println("[1] Yes [2] NO");
				num2 = sc.nextInt();
				music.music_plus();
			}
			if (num2 == 2) {
				System.out.println("잔액은 " + num0 + "원 입니다.");
				System.out.println("종료되었습니다!");
				break;
			}

		}

	}
}
