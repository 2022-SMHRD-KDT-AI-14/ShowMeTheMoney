package music;

public class MusicVO {
	String title; // 노래 제목을 저장할 필드
	String singer; // 가수 이름을 저장할 필드
	int playTime; // 노래길이를 초단위로 저장할 필드
	
	// 생성자
	public MusicVO(String title, String singer, int playTime) {
		super();
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}

	// Getter & Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	
}
