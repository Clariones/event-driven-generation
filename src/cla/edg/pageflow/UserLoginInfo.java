package cla.edg.pageflow;

import java.util.HashSet;
import java.util.Set;

public class UserLoginInfo {
	protected String userModelName;
	protected Set<String> loginMethods;
	
	
	
	public String getUserModelName() {
		return userModelName;
	}
	public void setUserModelName(String userModelName) {
		this.userModelName = userModelName;
	}
	public Set<String> getLoginMethods() {
		return loginMethods;
	}
	public void setLoginMethods(Set<String> loginMethods) {
		this.loginMethods = loginMethods;
	}
	public void addLoginMethod(String methodName) {
		ensureMethods();
		loginMethods.add(methodName);
	}
	private void ensureMethods() {
		if (loginMethods == null) {
			loginMethods = new HashSet<>();
		}
	}
	public boolean canLoginBy(String loginMethodName) {
		ensureMethods();
		return loginMethods.contains(loginMethodName);
	}
	
}
