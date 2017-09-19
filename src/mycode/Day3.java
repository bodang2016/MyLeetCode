package mycode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	
	public static int SlidingWindowlengthOfLongestSubstring(String s) {
		int ret = 0, i = 0, j = 0, n = s.length();
        Set<Character> attempt = new HashSet<Character>();
        while(i < n && j < n) {
            if(!attempt.contains(s.charAt(j))) {
                attempt.add(s.charAt(j++));
                ret = Math.max(ret, j - i);
            } else {
                attempt.remove(s.charAt(i++));
            }
        }
		return ret;
	}
	
	public static int MapSlidingWindowlengthOfLongestSubstring(String s) {
		int ret = 0, i = 0, j = 0, n = s.length();      
        Map<Character, Integer> attempt = new HashMap<Character, Integer>();
        while(j < n) {
            if(attempt.containsKey(s.charAt(j))) {
                i = Math.max(attempt.get(s.charAt(j)), i);
            }
            attempt.put(s.charAt(j), ++j);
            ret = Math.max(ret, j - i);
        }
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(lengthOfLongestSubstring("a"));
		int i = 0;
		while (i < 10) {
			System.out.println(i++);
		}
	}
}
