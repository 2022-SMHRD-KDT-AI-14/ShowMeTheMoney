package view;

import java.util.Scanner;

import model.Login;
import model.Rank;

import model.Join;
import model.DTO;

public class View { // view ����ڿ��� ���̱� ���� main �����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ũ�� ���Ű��� ȯ���մϴ�. \n�ű� ���� ������ ���� �ʱ�� 10������ �����ص帳�ϴ�. \n* ���� �ٷ� �����ϼ��� *");

		while(true) {
			System.out.println("[1]ȸ������ [2]�α��� [3] ����");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("===ȸ������===");
				System.out.print("ID�� �Է��ϼ��� >> ");
				String id = sc.next();
				System.out.print("PW�� �Է��ϼ��� >> ");
				String pw = sc.next();
				System.out.print("�г����� �Է��ϼ��� >> ");
				String name = sc.next();
				System.out.print("������ �Է��ϼ��� (MAN, WOMAN) >> ");
				String gender = sc.next();
				DTO dto = new DTO(id, pw, name, gender);
				Join dao = new Join();
				int cnt = dao.insert(dto);
				if (cnt > 0) {
					System.out.println("ȸ������ ����");
					System.out.println("�α������� �̵��� �ּ���^^");
				} else {
					System.out.println("ȸ������ ����..�ٽ� �������ּ���");
				}
//				System.out.println("��������~");
			} else if (menu == 2) {
				System.out.println("==== �α��� ====");
				model.Login log = new Login();
				System.out.print("���̵� �Է�");
				String user_id = sc.next();
				System.out.print("��й�ȣ �Է�");
				String user_pw = sc.next();
				DTO dto = new DTO(user_id, user_pw);
				log.login(dto);
				
//				if() {
//					// �α����� ���� �������� ����
//					break;
//				}

			} else if (menu == 3) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}


		
//		//22.05.30 ���� 
//		Rank rank = new Rank();
//		rank.gamerank();

	}
}