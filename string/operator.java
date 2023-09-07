package string;

public class operator {
    public static void main(String[] args) {
        System.out.println('a');
        System.out.println('b');
        System.out.println((char)('a'+3));
        System.out.println((int)('a'+3));
        System.out.println((int)('b'+3));
        System.out.println("a"+3);  // int 3 will be converted to Integer 3 which will call toString();
    }
}
