package music;

import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("====�����÷��̾�====");
		System.out.print("1.��� 2.��� 3.���� 4.������ 5.������ 6.���� >>");
		int num = sc.nextInt();
		if (num == 1) {
			// �뷡����,�����̸�,�뷡���̸� �Է¹����� MusicVO��ü�� �����Ͽ�
			// MusicControllerŬ�����ȿ� �뷡������ �����Ѵ�
			System.out.println("====���====");
			System.out.print("���� : ");
			String a = sc.next();
			System.out.print("���� : ");
			String b = sc.next();
			System.out.print("�ð� : ");
			int c = sc.nextInt();
			
		} else if (num == 2) {
			// MusicControllerŬ�������� ���� ����Ǿ��ִ� �뷡����Ʈ�� ������ �޾ƿͼ� ����Ѵ�
			System.out.println("====�뷡���====");
			
		} else if (num == 3) {
			System.out.println("====����====");
			// ������ �����ϸ� MusicControllerŬ�������� ���� �������� �뷡�� ������ �޾ƿͼ� ����Ѵ�
			// (���ʽ��۽� 1��° �뷡���� ���)
			
		} else if (num == 4) {
			// ������ ���ý� �����ִ� �Ǵ� �����뷡�� MusicControllerŬ�������� ������ �޾ƿͼ� ����Ѵ�.
			// �� �Ǵ� ������Ͽ� �뷡�� ������ ���� �뷡 �ٽ� ����Ѵ�.
			System.out.println("====������====");
			
		} else if (num == 5) {
			// ������ ���ý� �����ִ� �Ǵ� �����뷡�� MusicControllerŬ�������� ������ �޾ƿͼ� ����Ѵ�.
			// �� �Ǵ� ������Ͽ� �뷡�� ������ ���� �뷡 �ٽ� ����Ѵ�.
			System.out.println("====������====");
		} else if (num == 6) {
			System.out.println("====����====");
		} else {
			System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");
		}

	}

	}

