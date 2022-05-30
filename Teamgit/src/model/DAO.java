package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	Connection conn; // DB ������ ���Ѱ�ü
	PreparedStatement psmt;// SQL���� �����ϴ� ��ü
	ResultSet rs; //Query �� ������� �޾ƿ��� ��ü
	public void select() {
	
//--------------------------------------------------------------------
		// 1. �����ε�

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // ���������� ����ڰ� ������ ������ ������ ����ó�� ���ش�.

//---------------------------------------------------------------------
		// 2. DB����

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB�ּ�
		String db_id = "campus_e_0516_2"; // db_id
		String db_pw = "smhrd2"; // db_pw
		// DB������ ���� ��ü(Ŭ����)
		// Connection

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) { // conn �ȿ� ���� �̵Ǿ��ٸ� null�� �ƴϹǶ� DB���� ���� ���
				System.out.println("DB ���� ����");
			}

		} catch (SQLException e) { // SQLException e �������ִ��� �˻�
			e.printStackTrace();
		}
//-----------------------------------------------------------------------
		// 3. SQL�� ����
		String sql = "select *from member";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			rs.next();
			System.out.print("ID" + "\t");
			System.out.print("PW" + "\t");
			System.out.println("NAME");
			
			

			while (rs.next()) { // ����Ǿ��ִ� id,pq.name ��������� ������ �ڵ�����
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				System.out.print(id + "\t");
				System.out.print(pw + "\t");
				System.out.println(name);
			}

		} catch (SQLException e) {
			e.printStackTrace();
//-----------------------------------------------------------------------
			// 4. �������� (�������� �ݱ�)
			//conn,psmt,rs
		}finally {
			try {
				if(rs != null) {
					rs.close();
					
				}
				if(psmt != null) {
					psmt.close();
					
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Hello World");
	}

	
	public void selectName(String id) {
//----------------------------------------------------------
		//1 �����ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
//----------------------------------------------------------
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB�ּ�
		String db_id = "campus_e_0516_2"; // db_id
		String db_pw = "smhrd2"; // db_pw
		// DB������ ���� ��ü(Ŭ����)
		// Connection

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) { // conn �ȿ� ���� �̵Ǿ��ٸ� null�� �ƴϹǶ� DB���� ���� ���
				System.out.println("DB ���� ����");
			}

		} catch (SQLException e) { // SQLException e �������ִ��� �˻�
			e.printStackTrace();
		}
//------------------------------------------------------------		
		//3 SQL�� ����
		//member ���̺��� NAME COLUMN select
		//ID���� 'nayeho' �ΰ�!!
		String sql="select name from member where id = ?";
		try {
			psmt=conn.prepareStatement(sql);
			//?�� �ݵ�� execute ���� ������ �Ǿ� �־�� �Ѵ�.
			
			psmt.setString(1, id);
			
			rs=psmt.executeQuery();
			
			if(rs.next()){
				String name=rs.getString("NAME");
				System.out.println(id+"�� �ش��ϴ� �̸���"+name+ "�Դϴ�.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
//-------------------------------------------------------------------------------		
			//4 ���� ����
			// rs,psmt,conn ������ �ݾ��ּ���.
		}finally {
			try {
				if(rs !=null) {
					rs.close();
					
				}if(psmt!=null) {
					psmt.close();
					
				}if(conn != null) {
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		System.out.println("�輱��");
		
	}

	public void login(DTO dto) {// �ܺΰ����ͼ� �α��� id /pw ����  
		//----------------------------------------------------------
				//1 �����ε�
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("����̹� �ε� ����");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
		//----------------------------------------------------------
				String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB�ּ�
				String db_id = "campus_e_0516_2"; // db_id
				String db_pw = "smhrd2"; // db_pw
				// DB������ ���� ��ü(Ŭ����)
				// Connection

				try {
					conn = DriverManager.getConnection(url, db_id, db_pw);
					if (conn != null) { // conn �ȿ� ���� �̵Ǿ��ٸ� null�� �ƴϹǶ� DB���� ���� ���
						System.out.println("DB ���� ����");
					}

				} catch (SQLException e) { // SQLException e �������ִ��� �˻�
					e.printStackTrace();
				}
		//------------------------------------------------------------		
				//3 SQL�� ����
				//id ,pw 
				//member ���̺��� PW column SELECT
				//ID�� ���� id�� ��
				//��ġ�ϸ� "�α��� ����"
				//��ġ���� ������ "�α��� ����"
				String sql="select PW from member where ID =?";
				try {
					psmt=conn.prepareStatement(sql);
					//?�� �ݵ�� execute ���� ������ �Ǿ� �־�� �Ѵ�.
					
					//psmt.setchar(1, dto.getId());
					 
					rs=psmt.executeQuery();
					
					if(rs.next()){
						
						String result=rs.getString("PW");
						if(result.equals(dto.getPw())) {
							System.out.println("�α��� ����");
						}else {
							System.out.println("�α��� ����");
						}
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
		//-------------------------------------------------------------------------------		
					//4 ���� ����
					// rs,psmt,conn ������ �ݾ��ּ���.
				}finally {
					try {
						if(rs !=null) {
							rs.close();
							
						}if(psmt!=null) {
							psmt.close();
							
						}if(conn != null) {
							
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				
				System.out.println("����");
				
			}
	
	
	
}