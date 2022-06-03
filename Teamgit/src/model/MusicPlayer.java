package model;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	// Controller Class
	// .\\ : 최상위 경로로 
	// .\\music\\음악.mp3
	ArrayList<Music> musicList = new ArrayList<Music>();

	int curIndex = 0;

	MP3Player mp3 = new MP3Player();

	public MusicPlayer() {

		// 음악 전체 목록
//		musicList.add(new Music("BGM", "C:/Users/smhrd/Desktop/BGM.mp3"));
		musicList.add(new Music("BGM", ".\\music\\BGM.mp3"));
	}

	public Music play() {

		// 현재 재생 객체 반환

		Music m = musicList.get(curIndex);

		if (mp3.isPlaying()) {

			mp3.stop();

		}

		mp3.play(musicList.get(curIndex).getMusicPath());

		return m;

	}

}
