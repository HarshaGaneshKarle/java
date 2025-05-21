package day_3;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="listen";
		String str2="silent";
		if (str1.length()!=str2.length()) {
			System.out.println("NOt Anagrams");
			return;
		}
		int[] count = new int[26];
		for(int i=0;i<str1.length();i++) {
			count[str1.charAt(i)-'a']++;
			count[str1.charAt(i)-'a']--;
		}
		boolean isAnagram = true;
		for(int i=0;i<26;i++) {
			if(count[i]!=0) {
				isAnagram=false;
				break;
			}
		}
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

	}

}
