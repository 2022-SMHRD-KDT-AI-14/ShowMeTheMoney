package music;

public class MusicVO {
	String title; // �뷡 ������ ������ �ʵ�
	String singer; // ���� �̸��� ������ �ʵ�
	int playTime; // �뷡���̸� �ʴ����� ������ �ʵ�
	
	// ������
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
