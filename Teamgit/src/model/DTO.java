package model;

public class DTO {
    //-----------------------------------------
	//   id. pw. nick_name
	
	private String id;    //���̵�
	private String pw;	//�н�����
	private String name; //�г���
	
	//----------------------------------------
	
	
	public DTO(String id,String pw,String name) {
		super();
		this.id=id;
		this.pw=pw;
		this.name=name;
		
	//------------------------------------------	
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
