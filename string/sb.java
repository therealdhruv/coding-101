package string;

public class sb {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder();

        // Let add a string with all english alphabets in it
        for (int i=0; i<26; i++) {
            char ch = (char) ('a'+i);
            sc.append(ch);
        }

        System.out.println(sc.toString());
        System.out.println(sc.reverse());

    }
}
