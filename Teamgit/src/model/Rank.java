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
	
	Connection conn; // DB 연결을 위한 객체
	PreparedStatement psmt; // SQL문을 실행하는 객체
	ResultSet rs; // Query의 결과값을 받아오는 객체
	public void gamerank() {
		
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB주소
		String db_id = "campus_e_0516_2"; // db_id
		String db_pw = "smhrd2"; // db_pw
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로딩성공");
			
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
			
				if(conn!=null) {
					System.out.println("DB 연결 성공");
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("로딩실패");
		}
		
		
		String sql = "select * from user_info order by seedmoney desc";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
//			rs.next();// 커서 한칸 내리기
			System.out.print("RANK"+"\t");
			System.out.print("ID"+"\t");
//			System.out.print("PW"+"\t");
			System.out.print("NAME"+"\t");
			System.out.println("SEEDMONEY");
			
			int cnt = 1;
			while (rs.next()) { // true 결과값이 있다.
				System.out.print(cnt+"등" +"\t");
				String id = rs.getString(1);
//				String pw = rs.getString(2);
				String name = rs.getString(3);
//				int money = rs.getType(4);
				String seedMoney = rs.getString(4);
				System.out.print(id + "\t");
//				System.out.print(pw + "\t");
				System.out.print(name+ "\t");
				System.out.println(seedMoney);
				cnt++;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { // 4. 연결 종료
			try {
				if(rs!=null) { 
					rs.close();
				}
				if(psmt != null) {
					psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	
}

