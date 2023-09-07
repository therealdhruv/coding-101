package anonymous.java;

public class digits {
    public static void main(String[] args) {
        int x = 1234;

        System.out.println("This will give us the first digit : " + (x/1)%10);
        System.out.println("This will give us the second digit : " + (x/10)%10);
        System.out.println("This will give us the third digit : " + (x/100)%10);
        System.out.println("This will give us the fourth digit : " + (x/1000)%10);


        // in order to get length of the number we can first convert the int to string
        String no = Integer.toString(x);
        int len = no.length();

        int j = 1;
        for (int i = 0; i < len; i++) {
            System.out.println((x/j)%10);
            j *= 10;
        }
    }
}
