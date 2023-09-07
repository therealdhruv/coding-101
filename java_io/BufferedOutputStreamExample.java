package java_io;
import java.io.*;  
public class BufferedOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream f = new FileOutputStream("sex.txt");
        BufferedOutputStream bout = new BufferedOutputStream(f);
        String s = "arjun bada madarchod hai";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        f.close();
    }
}
