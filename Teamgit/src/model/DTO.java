package model;

public class DTO {
    //-----------------------------------------
	//   id. pw. nick_name
	
	private String id;    //���̵�
	private String pw;	//�н�����
	private String name; //�г���
	private String gender; //�г���
	
	//----------------------------------------
	
	
	public DTO(String id,String pw,String name ,String gender) {
		super();
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.gender=gender;
	//------------------------------------------	
	
}
	
	

	public DTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}