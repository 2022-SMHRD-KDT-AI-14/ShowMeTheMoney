package model;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	// Controller Class
	// .\\ : �ֻ��� ��η� 
	// .\\music\\����.mp3
	ArrayList<Music> musicList = new ArrayList<Music>();

	int curIndex = 0;

	MP3Player mp3 = new MP3Player();

	public MusicPlayer() {

		// ���� ��ü ���
//		musicList.add(new Music("BGM", "C:/Users/smhrd/Desktop/BGM.mp3"));
		musicList.add(new Music("BGM", ".\\music\\BGM.mp3"));
	}

	public Music play() {

		// ���� ��� ��ü ��ȯ

		Music m = musicList.get(curIndex);

		if (mp3.isPlaying()) {

			mp3.stop();

		}

		mp3.play(musicList.get(curIndex).getMusicPath());

		return m;

	}

}
