package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	Connection conn; // DB연결을 위한 객체
	PreparedStatement psmt; // SQL문을 실행하는 객체
	ResultSet rs; // Query의 결과값을 받아오는 객체

	// 뉴스 출력 메소드
	
	public void buyNews(int cnt) {
		
		connect();
		String sql = "select * from news";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			// -> 리턴타입이 ResultSet이고, 사용하면 결과를 돌려준다.
			// -> rs는 마우스 커서처럼 생겼고 컬럼의 한 행을 가르킨다.
			// -> rs. next();를 사용하면 다음 행으로 넘어간다.
			// -> rs.getString(1);을 사용하면 첫번째 행의 스트링값을 가져온다는 의미다. ? 숫자는 쉽게 컬럼들의 개수를 맞추는 느낌
			// -> rs.getString(컬럼명);도 가능~
			// -> rs.next();는 boolean형이다. 값이 있으면 true, 값이 없으면 false

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

//			선생님이 출력문을 보기 좋게 꾸민 방법~ 몰라도 됨?
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
			// -> 리턴타입이 ResultSet이고, 사용하면 결과를 돌려준다.
			// -> rs는 마우스 커서처럼 생겼고 컬럼의 한 행을 가르킨다.
			// -> rs. next();를 사용하면 다음 행으로 넘어간다.
			// -> rs.getString(1);을 사용하면 첫번째 행의 스트링값을 가져온다는 의미다. ? 숫자는 쉽게 컬럼들의 개수를 맞추는 느낌
			// -> rs.getString(컬럼명);도 가능~
			// -> rs.next();는 boolean형이다. 값이 있으면 true, 값이 없으면 false

//			System.out.print("No." + "\t");
//			System.out.print("Story" + "\t");

			for(int i=0; i<cnt; i++){
				rs.next();
			}
			
			String news_id = rs.getString(1);
			String story = rs.getString(2);
			System.out.println();
			System.out.print("오늘의 뉴스 >>  ");
			System.out.print(story + "\t");
			System.out.println();

			
			
//			선생님이 출력문을 보기 좋게 꾸민 방법~ 몰라도 됨?
//			System.out.printf("%10s\t%10s\t%10s%n", "ID", "PW", "NAME");
//			System.out.printf("%10s\t%10s\t%10s%n", id, pw, name);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	// 시드머니 출력 메소드
	public void selectSeed() {
		connect();
		String sql = "select name, seedmoney from user_info";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			// -> 리턴타입이 ResultSet이고, 사용하면 결과를 돌려준다.
			// -> rs는 마우스 커서처럼 생겼고 컬럼의 한 행을 가르킨다.
			// -> rs. next();를 사용하면 다음 행으로 넘어간다.
			// -> rs.getString(1);을 사용하면 첫번째 행의 스트링값을 가져온다는 의미다. ? 숫자는 쉽게 컬럼들의 개수를 맞추는 느낌
			// -> rs.getString(컬럼명);도 가능~
			// -> rs.next();는 boolean형이다. 값이 있으면 true, 값이 없으면 false

			System.out.print("Name" + "\t");
			System.out.print("SeedMoney" + "\t");

			while (rs.next()) {
				String name = rs.getString(1);
				String seed = rs.getString(2);
				System.out.println();
				System.out.print(name + "\t");
				System.out.print(seed + "\t");
			}
//			선생님이 출력문을 보기 좋게 꾸민 방법~ 몰라도 됨?
//			System.out.printf("%10s\t%10s\t%10s%n", "ID", "PW", "NAME");
//			System.out.printf("%10s\t%10s\t%10s%n", id, pw, name);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	
	private void connect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 컴파일해야 경로가 맞는지 아닌지 확인해야하므로 예외처리 (try,catch)

			// 2. DB연결
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DB주소
			String db_id = "campus_e_0516_2"; // db_id
			String db_pw = "smhrd2"; // db_pw

			// DB 연결을 위한 길 안내 (통로열기)
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
//				System.out.println("DB 연결 성공!");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}

	}

	private void close() {
		// 4. 닫기
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



