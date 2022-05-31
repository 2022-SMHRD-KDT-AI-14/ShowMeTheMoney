package model;

public class DTO {
    //-----------------------------------------
	//   id. pw. nick_name
	
	private String id;    //아이디
	private String pw;	//패스워드
	private String name; //닉네임
	private String gender; //닉네임
	
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