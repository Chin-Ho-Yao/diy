package diy;

public class DIY {
	public static int strStr(String haystack, String needle) {
		int index = 0;
		String h = haystack;
		String n = needle;
		if (needle.equals("")) {
			return 0;
		}
		char[] ch = new char[h.length()];
		char[] cn = new char[n.length()];
		for (int i = 0; i <= ch.length - cn.length; i++) {
			if (ch[i] == cn[0]) {
				for (int j = 0; j < cn.length; j++) {
				}
			}
		}
		return index;
	}
	public static void main(String[] args) {

	}
}
/*
 * 
 * 
 * */