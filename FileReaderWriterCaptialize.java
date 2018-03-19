import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class FileReaderWriterCaptialize     {
	public static void main(String args[]){
		try {
			FileInputStream f = new FileInputStream("test.txt");
			InputStreamReader is = new InputStreamReader(f);
			BufferedReader br = new BufferedReader(is);
			String str;
			FileWriter f2 = new FileWriter("test2.txt");
			while((str = br.readLine())!=null){
				for(int i=0;i<str.length();i++){
					if((i==0)||(str.charAt(i-1)==32)){
						f2.write(Character.toUpperCase(str.charAt(i)));

					}
					else {
						f2.write(str.charAt(i));
					}
				}
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
