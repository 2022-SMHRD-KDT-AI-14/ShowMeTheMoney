package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

	// 22.05.30 혜원
	// 로그인
	Scanner sc = new Scanner(System.in);
	Connection conn = null; // DB 연결을 위한 객체
	PreparedStatement psmt = null; // SQL문을 실행하는 객체
	ResultSet rs = null; // Query의 결과값을 받아오는 객체

	public boolean login(DTO dto) {

		boolean result = false;
		connect();

		String sql = "select * from user_info where ID = ? and PW = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			rs = psmt.executeQuery();

			if (rs.next()) {
				result = true;

			} else {
				result = false;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
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
