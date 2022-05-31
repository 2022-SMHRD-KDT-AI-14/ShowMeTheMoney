package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Join {
	public int insert(DTO dto) {
		// 1. 동적 로딩
		// 1-1. ojdbc6.jar 파일 추가!!
		// 동적 로딩할 Class File 찾기!!

		int cnt = 0;
		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			// compile(컴파일) 이후에 알 수 있는 error들에 대해서도
			// 예외처리를 해줘야 한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
       
			// 2. DB 연결
			// 1) url 2) db_id 3) db_pw
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB주소
			String db_id = "campus_e_0516_2"; // db_id
			String db_pw = "smhrd2"; // db_pw
			// getConnection -> 리턴 타입이 Connextion
			// 예외 처리의 이유? :
			// try-catch를 단독으로 할 것인지 아니면 catch를 줄줄 엮을 것인지~ 골라~
			// System.out.println("접속 성공");
			conn = DriverManager.getConnection(url, db_id, db_pw);
			// !conn.isClosed()
			if (conn != null) {
				System.out.println("접속 성공");
			}

			//

			// 3. SQL문장 실행
			// 정형화된 쿼리 언어: SQL
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

			// executeUpdate(); C,U,D 즉 ,Insert,Update,Delete 행의 영향을준다.
			// executQuery(); R 즉 , select

			// sql문을 실행하기 전에 ? 채우자

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, gender);

			cnt = psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			// -> 지워도 되는 이유는 드라이버 로딩 실패가 출력되었다는건
			// ClassNotFoundException가 되었다는 의미니까!
			System.out.println("드라이버 로딩 실패");
		}
		// -> 예외처리 해줘야 한다. 서라운드 트라이 캣츼~
//		System.out.println("프로그램 종료");
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("회원가입 실패");
		}
		// -> 클래스로 변환시켜주는 작업을 자바는 한다.(컴파일러가 컴파일을 한다.)
		// -> 컴파일 이후에 에러가 나오는 것들은 예외처리 해서 알아내야 한다.
		// -> catch (ClassNotFoundException e) { e.printStackTrace();}
		finally {
			// 4. 연결 종료 : 열었던 역순으로 닫는다.
			// psmt 닫기!
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