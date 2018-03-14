import java.io.FileReader;
import java.io.IOException;
class FileReaderExample1 {
        public static void main(String args[]){
        try {
        FileReader f = new FileReader("test.txt");
        char c = (char)f.read();
        System.out.println(c);
        f.close();
        }
        catch(IOException e) {
        System.out.println(e);
        }
        }
}
