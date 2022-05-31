package model;

public class MusicFile {

	
	public void music_main() {
		// main BGM
		MusicPlayer p = new MusicPlayer();

		Music m;

		m = p.play();
	}
	
	public void music_minus() {
		// 손실 BGM
		
		MusicPlayer2 w = new MusicPlayer2();

		Music n;
	
		
		n = w.play();
	}
	
	public void music_plus() {
		
		// 이익 bgm
		
		MusicPlayer3 v = new MusicPlayer3();

		Music e;
	
		
		e = v.play();
	}
	
	
}
