package view;

import java.util.Scanner;


import model.DAO;
import model.DTO;

public class View { //view ����ڿ��� ���̱� ���� main �����
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("[1]ȸ������ [2]�α��� [3] ������");
			int menu=sc.nextInt();
			if(menu==1) {
				System.out.println("===ȸ������===");
				
				System.out.print("ID�� �Է��ϼ���>>");
				String id=sc.next();
				System.out.print("PW�� �Է��ϼ���>>");
				String pw=sc.next();
				System.out.print("�г����� �Է��ϼ���>>");
				String name=sc.next();
				DTO dto=new DTO(id, pw, name);
				DAO dao= new DAO();
				//int cnt =dao.insert(dto);
				//if(cnt>0) {
					System.out.println("ȸ������ ����");
					
				}else {
					System.out.println("ID�� �ߺ��Ǿ����ϴ�.");
				}
				
		        //}else if(menu==5) {
				System.out.println("��������~");
				break;
			}
		}
		//DAO dao=new DAO(); //model���� ��������
		
	
	}

//}
