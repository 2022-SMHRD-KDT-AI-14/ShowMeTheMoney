package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Join {
	
	int cnt = 0;
	Connection conn = null;
	PreparedStatement psmt = null;

	public int insert(DTO dto) {

		connect();

		String id = dto.getId();
		String pw = dto.getPw();
		String name = dto.getName();
		String gender = dto.getGender();

		String sql = "insert into user_info values(?, ?, ?, ?, 1000000)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, gender);

			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;

	}
	
	private void connect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // �������ؾ� ��ΰ� �´��� �ƴ��� Ȯ���ؾ��ϹǷ� ����ó�� (try,catch)

			// 2. DB����
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB�ּ�
			String db_id = "campus_e_0516_2"; // db_id
			String db_pw = "smhrd2"; // db_pw

			// DB ������ ���� �� �ȳ� (��ο���)
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
//				System.out.println("DB ���� ����!");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
		}

	}
	
	private void close() {
		// 4. �ݱ�
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