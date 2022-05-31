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
	Connection conn; // DB ������ ���� ��ü
	PreparedStatement psmt; // SQL���� �����ϴ� ��ü
	ResultSet rs; // Query�� ������� �޾ƿ��� ��ü
	
	public String login(DTO dto) {
		
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB�ּ�
		String db_id = "campus_e_0516_2"; // db_id
		String db_pw = "smhrd2"; // db_pw
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("�ε�����");
			
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
			
				if(conn!=null) {
//					System.out.println("DB ���� ����");
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("DB ���� ����");
			}

			String sql ="select PW from user_info where ID = ? ";
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, dto.getId());
				rs = psmt.executeQuery();
				
				if(rs.next()) {
					String result = rs.getString(1);
					if(result.equals(dto.getPw())) {
						System.out.println("�α��� ����");
					}else {
						System.out.println("�α��� ����");
					}
				}else {
					System.out.println("���̵� �����ϴ�.");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ε�����");
		}
		return dto.getId();
	}
	
}
