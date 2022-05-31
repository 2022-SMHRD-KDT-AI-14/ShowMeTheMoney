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
	Connection conn; // DB 연결을 위한 객체
	PreparedStatement psmt; // SQL문을 실행하는 객체
	ResultSet rs; // Query의 결과값을 받아오는 객체
	
	public String login(DTO dto) {
		
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB주소
		String db_id = "campus_e_0516_2"; // db_id
		String db_pw = "smhrd2"; // db_pw
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("로딩성공");
			
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
			
				if(conn!=null) {
//					System.out.println("DB 연결 성공");
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("DB 연결 실패");
			}

			String sql ="select PW from user_info where ID = ? ";
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, dto.getId());
				rs = psmt.executeQuery();
				
				if(rs.next()) {
					String result = rs.getString(1);
					if(result.equals(dto.getPw())) {
						System.out.println("로그인 성공");
					}else {
						System.out.println("로그인 실패");
					}
				}else {
					System.out.println("아이디가 없습니다.");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("로딩실패");
		}
		return dto.getId();
	}
	
}
