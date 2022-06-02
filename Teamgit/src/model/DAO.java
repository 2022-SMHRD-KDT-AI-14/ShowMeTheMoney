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
	
	public void buyNews(int cnt) {
		
		connect();
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
			System.out.print(story + "\t");
			System.out.println();

//			�������� ��¹��� ���� ���� �ٹ� ���~ ���� ��?
//			System.out.printf("%10s\t%10s\t%10s%n", "ID", "PW", "NAME");
//			System.out.printf("%10s\t%10s\t%10s%n", id, pw, name);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void selectNews(int cnt) {
		connect();
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
			System.out.print("������ ���� >>  ");
			System.out.print(story + "\t");
			System.out.println();

			
			
//			�������� ��¹��� ���� ���� �ٹ� ���~ ���� ��?
//			System.out.printf("%10s\t%10s\t%10s%n", "ID", "PW", "NAME");
//			System.out.printf("%10s\t%10s\t%10s%n", id, pw, name);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	// �õ�Ӵ� ��� �޼ҵ�
	public void selectSeed() {
		connect();
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
		}
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



