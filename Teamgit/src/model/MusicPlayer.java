package model;
import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
public class MusicPlayer {
	  // Controller Class

	   ArrayList<Music> musicList = new ArrayList<Music>();

	   int curIndex = 0;

	   MP3Player mp3 = new MP3Player();

	   public MusicPlayer() {

	      // 음악 전체 목록
	      musicList.add(new Music("BGM", "C:/Users/smhrd/Desktop/BGM.mp3"));
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

	   public Music nextPlay() {

	      curIndex++;

	      if (curIndex == musicList.size()) {

	         curIndex = 0;

	      }

	      if (mp3.isPlaying()) {

	         mp3.stop();

	      }

	      mp3.play(musicList.get(curIndex).getMusicPath());

	      return musicList.get(curIndex);

	   }

	   public Music previewPlay() {

	      curIndex--;

	      if (curIndex < 0) {

	         curIndex = musicList.size() - 1;

	      }

	      if (mp3.isPlaying()) {

	         mp3.stop();

	      }

	      mp3.play(musicList.get(curIndex).getMusicPath());

	      return musicList.get(curIndex);

	   }

	   public String stop() {

	      if (mp3.isPlaying()) {

	         mp3.stop();

	      }

	      return "노래가 정지되었습니다.";

	   }



}
