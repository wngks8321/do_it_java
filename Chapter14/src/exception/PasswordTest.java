package exception;

public class PasswordTest {
	
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if(password.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이하일 수 없습니다.");
		} else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 문자로만 이루어질 수 없습니다.");
		}
		this.password = password;
	}

	public static void main(String[] args) {

		PasswordTest pwdTest = new PasswordTest();
		String pwd = null;
		
		try {
			pwdTest.setPassword(pwd);
		} catch (PasswordException e) {
			System.out.println(e);
		}
		
		pwd = "1234";
		
		try {
			pwdTest.setPassword(pwd);
		} catch (PasswordException e) {
			System.out.println(e);
		}
		
		pwd = "asdfasdf";
		
		try {
			pwdTest.setPassword(pwd);
		} catch (PasswordException e) {
			System.out.println(e);
		}
	}

}
