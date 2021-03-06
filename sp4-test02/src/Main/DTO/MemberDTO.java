package Main.DTO;

import java.util.Date;

public class MemberDTO { // DB에서 DTO의 값을 넘김
	private Long id;
	private String email;
	private String password;
	private String name;
	private Date registerDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	public void changePassword(String oldPwd, String newPwd) {
		if(password.equals(oldPwd)) {
			password = newPwd;
		} else {
			System.out.println("현재 비밀번호가 틀립니당");
		}
	}
}
