package cla.edg.pageflow;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class UserLoginInfo {
	protected String userModelName;
	protected Set<String> loginMethods;
	
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
