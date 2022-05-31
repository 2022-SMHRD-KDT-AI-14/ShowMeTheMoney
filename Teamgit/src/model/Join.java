package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Join {
	public int insert(DTO dto) {
		// 1. ���� �ε�
		// 1-1. ojdbc6.jar ���� �߰�!!
		// ���� �ε��� Class File ã��!!

		int cnt = 0;
		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			// compile(������) ���Ŀ� �� �� �ִ� error�鿡 ���ؼ���
			// ����ó���� ����� �Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
       
			// 2. DB ����
			// 1) url 2) db_id 3) db_pw
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB�ּ�
			String db_id = "campus_e_0516_2"; // db_id
			String db_pw = "smhrd2"; // db_pw
			// getConnection -> ���� Ÿ���� Connextion
			// ���� ó���� ����? :
			// try-catch�� �ܵ����� �� ������ �ƴϸ� catch�� ���� ���� ������~ ���~
			// System.out.println("���� ����");
			conn = DriverManager.getConnection(url, db_id, db_pw);
			// !conn.isClosed()
			if (conn != null) {
				System.out.println("���� ����");
			}

			//

			// 3. SQL���� ����
			// ����ȭ�� ���� ���: SQL
			String id = dto.getId();
			String pw = dto.getPw();
			String name = dto.getName();
			String gender=dto.getGender();
			
			String sql = "insert into user_info values(?, ?, ?, ?, 1000000)";
			psmt = conn.prepareStatement(sql);
			// CRUD
			// C: Create (Insert)
			// R: Read (select)
			// U: Update (Update)
			// D: Delete (Delete)

			// executeUpdate(); C,U,D �� ,Insert,Update,Delete ���� �������ش�.
			// executQuery(); R �� , select

			// sql���� �����ϱ� ���� ? ä����

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, gender);

			cnt = psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			// -> ������ �Ǵ� ������ ����̹� �ε� ���а� ��µǾ��ٴ°�
			// ClassNotFoundException�� �Ǿ��ٴ� �ǹ̴ϱ�!
			System.out.println("����̹� �ε� ����");
		}
		// -> ����ó�� ����� �Ѵ�. ������ Ʈ���� Ĺ�M~
//		System.out.println("���α׷� ����");
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ȸ������ ����");
		}
		// -> Ŭ������ ��ȯ�����ִ� �۾��� �ڹٴ� �Ѵ�.(�����Ϸ��� �������� �Ѵ�.)
		// -> ������ ���Ŀ� ������ ������ �͵��� ����ó�� �ؼ� �˾Ƴ��� �Ѵ�.
		// -> catch (ClassNotFoundException e) { e.printStackTrace();}
		finally {
			// 4. ���� ���� : ������ �������� �ݴ´�.
			// psmt �ݱ�!
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
		return cnt;
	}
	
	}