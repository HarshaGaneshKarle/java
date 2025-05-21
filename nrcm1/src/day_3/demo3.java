package day_3;

public class demo3 {
    public static void main(String[] args) {
        String a = "HellowOrld";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            for (char v : vowels) {
                if (ch == v) {
                    System.out.println(ch);
                }
            }
        }
    }
}
