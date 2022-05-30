package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Rank {
	// ��ŷ��ȸ

	// 22.05.30 ����
	// ������� �г��Ӱ� �õ�Ӵ� �ȳ�
	// ȸ�����̺��� ���̵�, �г���, �õ�Ӵ� ��ŷ �ȳ�
	// ��ŷ ��ȸ �� �����ϱ�
	
	Connection conn; // DB ������ ���� ��ü
	PreparedStatement psmt; // SQL���� �����ϴ� ��ü
	ResultSet rs; // Query�� ������� �޾ƿ��� ��ü
	public void gamerank() {
		
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB�ּ�
		String db_id = "campus_e_0516_2"; // db_id
		String db_pw = "smhrd2"; // db_pw
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("�ε�����");
			
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
			
				if(conn!=null) {
					System.out.println("DB ���� ����");
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ε�����");
		}
		
		
		String sql = "select * from user_info order by seedmoney desc";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
//			rs.next();// Ŀ�� ��ĭ ������
			System.out.print("RANK"+"\t");
			System.out.print("ID"+"\t");
//			System.out.print("PW"+"\t");
			System.out.print("NAME"+"\t");
			System.out.println("SEEDMONEY");
			
			int cnt = 1;
			while (rs.next()) { // true ������� �ִ�.
				System.out.print(cnt+"��" +"\t");
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
		}finally { // 4. ���� ����
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

