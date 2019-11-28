package cla.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiscTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}

	private static void test1() {
		String ptn = "^[+\\-]?(\\d+[lL])|(\\d{10,20})$";
		Pattern ptnLong = Pattern.compile(ptn);
		
		String [] stringsTested = {
				"+1L",
				"-0l",
				"1000000000000",
				"899999",
				"899999L",
				"0.0",
				"0.0L",
				"l",
				"0",
				"0L"
		};
				
		for(String str : stringsTested) {
			Matcher m = ptnLong.matcher(str);
			System.out.println(str+": " + m.matches());
		}
		
	}

}
