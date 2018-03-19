import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class FileReaderExample1 {
        public static void main(String args[]){
        try {
        FileReader f1 = new FileReader("test.txt");
	FileWriter f2 = new FileWriter("test2.txt");
	int ch;
	while((ch=f1.read())!=-1){
		//c = (char)f.read();
	//	System.out.println(ch);
		f2.write((char)ch);
	}
	f1.close();
	f2.close();
        }
        catch(IOException e) {
        System.out.println(e);
        }
        }
}
