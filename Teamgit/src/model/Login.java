package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

	// 22.05.30 ����
	// �α���
	Scanner sc = new Scanner(System.in);
	Connection conn = null; // DB ������ ���� ��ü
	PreparedStatement psmt = null; // SQL���� �����ϴ� ��ü
	ResultSet rs = null; // Query�� ������� �޾ƿ��� ��ü

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
