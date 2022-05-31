package model;
import java.util.Scanner;

public class MusicMain {
	  public static void main(String[] args) {

		      Scanner sc = new Scanner(System.in);

		      MusicPlayer p = new MusicPlayer();

		      while (true) {

		         System.out.print("[1]재생 [2]정지 : ");

		         int menu = sc.nextInt();

		         Music m;

		         switch (menu) {

		         case 1:

		            m = p.play();

		            break;

		         case 2:

		            String msg = p.stop();

		            System.out.println(msg);

		            break;

		         }

		      }

		   }



}
