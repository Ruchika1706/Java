import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class FileReaderWriterCaptializeReadCharacter     {
	public static void main(String args[]){
		try {
			FileInputStream f = new FileInputStream("test.txt");
			InputStreamReader is = new InputStreamReader(f);
			BufferedReader br = new BufferedReader(is);
			int ch;
			FileWriter f2 = new FileWriter("test2.txt");
			int flag=0;
			ch = br.read();
			if(ch!=-1)
				f2.write(Character.toUpperCase((char)ch));	
			while((ch = br.read())!=-1){
				if(flag==1) {
					f2.write(Character.toUpperCase((char)ch));
					flag = 0;
					continue;
				}
				//ASCII value for space is 32, new line is 10
				if((ch == 32) || (ch == 10)){
					flag = 1;
				} 
				f2.write((char)ch);

			}
			f.close();
			br.close();
			f2.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
