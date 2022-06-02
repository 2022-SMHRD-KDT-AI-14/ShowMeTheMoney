package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Rank {
	// 랭킹조회

	// 22.05.30 혜원
	// 사용자의 닉네임과 시드머니 안내
	// 회원테이블의 아이디, 닉네임, 시드머니 랭킹 안내
	// 랭킹 조회 후 종료하기

	Connection conn = null; // DB 연결을 위한 객체
	PreparedStatement psmt = null; // SQL문을 실행하는 객체
	ResultSet rs = null; // Query의 결과값을 받아오는 객체

	public void gameRank() {

		connect();
		String sql = "select * from user_info order by seedmoney desc";
	
			try {
				psmt = conn.prepareStatement(sql);
				rs = psmt.executeQuery();
				System.out.print("RANK" + "\t");
				System.out.print("ID" + "\t");
				System.out.print("NAME" + "\t");
				System.out.println("SEEDMONEY");
				
				int cnt = 1;
				while (rs.next()) {
					System.out.print(cnt + "등" + "\t");
					String id = rs.getString(1);
					String name = rs.getString(3);
					String seedMoney = rs.getString(5);
					System.out.print(id + "\t");
					System.out.print(name + "\t");
					System.out.println(seedMoney);
					cnt++;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		

	}

	private void connect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 컴파일해야 경로가 맞는지 아닌지 확인해야하므로 예외처리 (try,catch)

			// 2. DB연결
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB주소
			String db_id = "campus_e_0516_2"; // db_id
			String db_pw = "smhrd2"; // db_pw

			// DB 연결을 위한 길 안내 (통로열기)
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
//				System.out.println("DB 연결 성공!");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}

	}

	private void close() {
		// 4. 닫기
		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
