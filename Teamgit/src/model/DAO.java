package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	Connection conn; // DB 연결을 위한객체
	PreparedStatement psmt;// SQL문을 실행하는 객체
	ResultSet rs; //Query 의 결과값을 받아오는 객체
	public void select() {
	
//--------------------------------------------------------------------
		// 1. 동적로딩

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // 문법에러나 사용자가 에러를 냈을때 오류를 유예처리 해준다.

//---------------------------------------------------------------------
		// 2. DB연결

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB주소
		String db_id = "campus_e_0516_2"; // db_id
		String db_pw = "smhrd2"; // db_pw
		// DB연결을 위해 객체(클래스)
		// Connection

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) { // conn 안에 대입 이되었다면 null이 아니므라 DB연결 성공 출력
				System.out.println("DB 연결 성공");
			}

		} catch (SQLException e) { // SQLException e 오류가있는지 검사
			e.printStackTrace();
		}
//-----------------------------------------------------------------------
		// 3. SQL문 실행
		String sql = "select *from member";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			rs.next();
			System.out.print("ID" + "\t");
			System.out.print("PW" + "\t");
			System.out.println("NAME");
			
			

			while (rs.next()) { // 저장되어있는 id,pq.name 까지출력후 없으면 자동종료
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
			// 4. 연결종료 (역순으로 닫기)
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
		//1 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
//----------------------------------------------------------
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB주소
		String db_id = "campus_e_0516_2"; // db_id
		String db_pw = "smhrd2"; // db_pw
		// DB연결을 위해 객체(클래스)
		// Connection

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) { // conn 안에 대입 이되었다면 null이 아니므라 DB연결 성공 출력
				System.out.println("DB 연결 성공");
			}

		} catch (SQLException e) { // SQLException e 오류가있는지 검사
			e.printStackTrace();
		}
//------------------------------------------------------------		
		//3 SQL문 실행
		//member 테이블을 NAME COLUMN select
		//ID값이 'nayeho' 인값!!
		String sql="select name from member where id = ?";
		try {
			psmt=conn.prepareStatement(sql);
			//?는 반드시 execute 전에 설정이 되어 있어야 한다.
			
			psmt.setString(1, id);
			
			rs=psmt.executeQuery();
			
			if(rs.next()){
				String name=rs.getString("NAME");
				System.out.println(id+"에 해당하는 이름은"+name+ "입니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
//-------------------------------------------------------------------------------		
			//4 연결 종료
			// rs,psmt,conn 순으로 닫아주세요.
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
		
		
		
		
		System.out.println("김선규");
		
	}

	public void login(DTO dto) {// 외부가져와서 로그인 id /pw 정의  
		//----------------------------------------------------------
				//1 동적로딩
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("드라이버 로딩 성공");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
		//----------------------------------------------------------
				String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB주소
				String db_id = "campus_e_0516_2"; // db_id
				String db_pw = "smhrd2"; // db_pw
				// DB연결을 위해 객체(클래스)
				// Connection

				try {
					conn = DriverManager.getConnection(url, db_id, db_pw);
					if (conn != null) { // conn 안에 대입 이되었다면 null이 아니므라 DB연결 성공 출력
						System.out.println("DB 연결 성공");
					}

				} catch (SQLException e) { // SQLException e 오류가있는지 검사
					e.printStackTrace();
				}
		//------------------------------------------------------------		
				//3 SQL문 실행
				//id ,pw 
				//member 테이블의 PW column SELECT
				//ID의 값이 id인 것
				//일치하면 "로그인 성공"
				//일치하지 않으면 "로그인 실패"
				String sql="select PW from member where ID =?";
				try {
					psmt=conn.prepareStatement(sql);
					//?는 반드시 execute 전에 설정이 되어 있어야 한다.
					
					//psmt.setchar(1, dto.getId());
					 
					rs=psmt.executeQuery();
					
					if(rs.next()){
						
						String result=rs.getString("PW");
						if(result.equals(dto.getPw())) {
							System.out.println("로그인 성공");
						}else {
							System.out.println("로그인 실패");
						}
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
		//-------------------------------------------------------------------------------		
					//4 연결 종료
					// rs,psmt,conn 순으로 닫아주세요.
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
				
				
				System.out.println("종료");
				
			}
	
	
	
}