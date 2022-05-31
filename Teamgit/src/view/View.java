package view;

import java.util.Scanner;

import model.Login;
import model.Rank;
import model.Join;
import model.DTO;
import model.Invest;

public class View { // view ����ڿ��� ���̱� ���� main �����

	public static void main(String[] args) {
		
		String login_id = ""; // �α����� id �ޱ�
		
		Scanner sc = new Scanner(System.in);
		
//		invest money = new invest();
		Invest money = new Invest();
		System.out.println("������ũ�� ���Ű��� ȯ���մϴ�. \n�ű� ���� ������ ���� �ʱ�� 100������ �����ص帳�ϴ�. \n* ���� �ٷ� �����ϼ��� *");

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
				login_id = log.login(dto); // ���� ���̵� login�� ����
				
// 			    if() {
//					// �α����� ���� �������� ����
					break;
//				}

			} else if (menu == 3) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
		
		
		System.out.println("���̵��� �����ϼ���!");
		System.out.println("[1] ����(���ͷ� ���� ����) [2] ����(���ͷ� ���� ����) [3] �����(���ͷ� ���� ŭ)");
	    int select = sc.nextInt();
	    if(select == 1) {
	    	money.investlow();
	    }else if( select == 2) {
	    	money.investmid();
	    } else if (select == 3) {
	    	money.investhigh(login_id); // �α����� id�� ���
	    } else {
	    	System.out.println("�߸� �Է��ϼ̽��ϴ�!");
	    }
		


		
//		//22.05.30 ���� 
//		Rank rank = new Rank();
//		rank.gamerank();

	}
}