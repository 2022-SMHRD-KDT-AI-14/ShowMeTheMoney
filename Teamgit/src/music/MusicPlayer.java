package music;

import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("====뮤직플레이어====");
		System.out.print("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >>");
		int num = sc.nextInt();
		if (num == 1) {
			// 노래제목,가수이름,노래길이를 입력받은뒤 MusicVO객체로 생성하여
			// MusicController클래스안에 노래정보를 저장한다
			System.out.println("====등록====");
			System.out.print("제목 : ");
			String a = sc.next();
			System.out.print("가수 : ");
			String b = sc.next();
			System.out.print("시간 : ");
			int c = sc.nextInt();
			
		} else if (num == 2) {
			// MusicController클래스에서 현재 저장되어있는 노래리스트의 정보를 받아와서 출력한다
			System.out.println("====노래목록====");
			
		} else if (num == 3) {
			System.out.println("====실행====");
			// 실행을 선택하면 MusicController클래스에서 현재 실행중인 노래의 정보를 받아와서 출력한다
			// (최초시작시 1번째 노래부터 출력)
			
		} else if (num == 4) {
			// 이전곡 선택시 전에있는 또는 다음노래의 MusicController클래스에서 정보를 받아와서 출력한다.
			// 전 또는 다음목록에 노래가 없을시 현재 노래 다시 출력한다.
			System.out.println("====이전곡====");
			
		} else if (num == 5) {
			// 이전곡 선택시 전에있는 또는 다음노래의 MusicController클래스에서 정보를 받아와서 출력한다.
			// 전 또는 다음목록에 노래가 없을시 현재 노래 다시 출력한다.
			System.out.println("====다음곡====");
		} else if (num == 6) {
			System.out.println("====종료====");
		} else {
			System.out.println("정확한 숫자를 입력해주세요.");
		}

	}

	}

