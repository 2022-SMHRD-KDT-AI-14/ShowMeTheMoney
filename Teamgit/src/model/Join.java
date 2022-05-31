package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Join {
	public int insert(DTO dto) {
		// 1. µ¿Àû ·Îµù
		// 1-1. ojdbc6.jar ÆÄÀÏ Ãß°¡!!
		// µ¿Àû ·ÎµùÇÒ Class File Ã£±â!!

		int cnt = 0;
		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			// compile(ÄÄÆÄÀÏ) ÀÌÈÄ¿¡ ¾Ë ¼ö ÀÖ´Â errorµé¿¡ ´ëÇØ¼­µµ
			// ¿¹¿ÜÃ³¸®¸¦ ÇØÁà¾ß ÇÑ´Ù.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("µå¶óÀÌ¹ö ·Îµù ¼º°ø");
       
			// 2. DB ¿¬°á
			// 1) url 2) db_id 3) db_pw
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // DBÁÖ¼Ò
			String db_id = "campus_e_0516_2"; // db_id
			String db_pw = "smhrd2"; // db_pw
			// getConnection -> ¸®ÅÏ Å¸ÀÔÀÌ Connextion
			// ¿¹¿Ü Ã³¸®ÀÇ ÀÌÀ¯? :
			// try-catch¸¦ ´Üµ¶À¸·Î ÇÒ °ÍÀÎÁö ¾Æ´Ï¸é catch¸¦ ÁÙÁÙ ¿«À» °ÍÀÎÁö~ °ñ¶ó~
			// System.out.println("Á¢¼Ó ¼º°ø");
			conn = DriverManager.getConnection(url, db_id, db_pw);
			// !conn.isClosed()
			if (conn != null) {
				System.out.println("Á¢¼Ó ¼º°ø");
			}

			//

			// 3. SQL¹®Àå ½ÇÇà
			// Á¤ÇüÈ­µÈ Äõ¸® ¾ð¾î: SQL
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

			// executeUpdate(); C,U,D Áï ,Insert,Update,Delete ÇàÀÇ ¿µÇâÀ»ÁØ´Ù.
			// executQuery(); R Áï , select

			// sql¹®À» ½ÇÇàÇÏ±â Àü¿¡ ? Ã¤¿ìÀÚ

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, gender);

			cnt = psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			// -> Áö¿öµµ µÇ´Â ÀÌÀ¯´Â µå¶óÀÌ¹ö ·Îµù ½ÇÆÐ°¡ Ãâ·ÂµÇ¾ú´Ù´Â°Ç
			// ClassNotFoundException°¡ µÇ¾ú´Ù´Â ÀÇ¹Ì´Ï±î!
			System.out.println("µå¶óÀÌ¹ö ·Îµù ½ÇÆÐ");
		}
		// -> ¿¹¿ÜÃ³¸® ÇØÁà¾ß ÇÑ´Ù. ¼­¶ó¿îµå Æ®¶óÀÌ Ä¹¯M~
//		System.out.println("ÇÁ·Î±×·¥ Á¾·á");
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("È¸¿ø°¡ÀÔ ½ÇÆÐ");
		}
		// -> Å¬·¡½º·Î º¯È¯½ÃÄÑÁÖ´Â ÀÛ¾÷À» ÀÚ¹Ù´Â ÇÑ´Ù.(ÄÄÆÄÀÏ·¯°¡ ÄÄÆÄÀÏÀ» ÇÑ´Ù.)
		// -> ÄÄÆÄÀÏ ÀÌÈÄ¿¡ ¿¡·¯°¡ ³ª¿À´Â °ÍµéÀº ¿¹¿ÜÃ³¸® ÇØ¼­ ¾Ë¾Æ³»¾ß ÇÑ´Ù.
		// -> catch (ClassNotFoundException e) { e.printStackTrace();}
		finally {
			// 4. ¿¬°á Á¾·á : ¿­¾ú´ø ¿ª¼øÀ¸·Î ´Ý´Â´Ù.
			// psmt ´Ý±â!
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