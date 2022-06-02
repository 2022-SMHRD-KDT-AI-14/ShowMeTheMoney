package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	Connection conn; // DB������ ���� ��ü
	PreparedStatement psmt; // SQL���� �����ϴ� ��ü
	ResultSet rs; // Query�� ������� �޾ƿ��� ��ü

	// ���� ��� �޼ҵ�
	public void selectNews(int cnt) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id = "campus_e_0516_2";
		String db_pw = "smhrd2";

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
				System.out.println("DB ���� ����");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sql = "select * from news";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			// -> ����Ÿ���� ResultSet�̰�, ����ϸ� ����� �����ش�.
			// -> rs�� ���콺 Ŀ��ó�� ����� �÷��� �� ���� ����Ų��.
			// -> rs. next();�� ����ϸ� ���� ������ �Ѿ��.
			// -> rs.getString(1);�� ����ϸ� ù��° ���� ��Ʈ������ �����´ٴ� �ǹ̴�. ? ���ڴ� ���� �÷����� ������ ���ߴ� ����
			// -> rs.getString(�÷���);�� ����~
			// -> rs.next();�� boolean���̴�. ���� ������ true, ���� ������ false

//			System.out.print("No." + "\t");
//			System.out.print("Story" + "\t");

			for(int i=0; i<cnt; i++){
				rs.next();
			}
			
			String news_id = rs.getString(1);
			String story = rs.getString(2);
			System.out.println();
			System.out.print("������ ���� >> " + "\t");
			System.out.print(story + "\t");
			System.out.println();

			
			
//			�������� ��¹��� ���� ���� �ٹ� ���~ ���� ��?
//			System.out.printf("%10s\t%10s\t%10s%n", "ID", "PW", "NAME");
//			System.out.printf("%10s\t%10s\t%10s%n", id, pw, name);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (rs != null) {
					rs.close();
				}
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

	
	// �õ�Ӵ� ��� �޼ҵ�
	public void selectSeed() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id = "campus_e_0516_2";
		String db_pw = "smhrd2";

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
				System.out.println("DB ���� ����");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sql = "select name, seedmoney from user_info";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			// -> ����Ÿ���� ResultSet�̰�, ����ϸ� ����� �����ش�.
			// -> rs�� ���콺 Ŀ��ó�� ����� �÷��� �� ���� ����Ų��.
			// -> rs. next();�� ����ϸ� ���� ������ �Ѿ��.
			// -> rs.getString(1);�� ����ϸ� ù��° ���� ��Ʈ������ �����´ٴ� �ǹ̴�. ? ���ڴ� ���� �÷����� ������ ���ߴ� ����
			// -> rs.getString(�÷���);�� ����~
			// -> rs.next();�� boolean���̴�. ���� ������ true, ���� ������ false

			System.out.print("Name" + "\t");
			System.out.print("SeedMoney" + "\t");

			while (rs.next()) {
				String name = rs.getString(1);
				String seed = rs.getString(2);
				System.out.println();
				System.out.print(name + "\t");
				System.out.print(seed + "\t");
			}
//			�������� ��¹��� ���� ���� �ٹ� ���~ ���� ��?
//			System.out.printf("%10s\t%10s\t%10s%n", "ID", "PW", "NAME");
//			System.out.printf("%10s\t%10s\t%10s%n", id, pw, name);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (rs != null) {
					rs.close();
				}
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

	
	
	
}
