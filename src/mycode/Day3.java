package mycode;

import java.util.ArrayList;
import java.util.List;

public class Day3 {

	public static int lengthOfLongestSubstring(String s) {
		int ret = 0;
		List<Character> attempt = new ArrayList<Character>();
		char[] splited = s.toCharArray();
		for (int i = 0; i < splited.length; i++) {
			for (int j = i; j < splited.length; j++) {
				if (!attempt.contains(splited[j])) {
					attempt.add(splited[j]);
					ret = ret > attempt.size() ? ret : attempt.size();
				} else {
					break;
				}
			}
			attempt.clear();
			if (splited.length - i < ret) {
				break;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("a"));
	}

}
