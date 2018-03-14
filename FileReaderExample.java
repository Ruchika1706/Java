import java.io.FileReader; 
import java.io.IOException; 
import java.io.BufferedReader; 
class FileReaderExample { 
        public static void main(String args[]){ 
        try { 
        FileReader f = new FileReader("test.txt"); 
	// f.read() function reads a character and returns the ASCII value for that character
        //char c = (char)f.read(); 
        BufferedReader br = new BufferedReader(f); 
	//readLine() function reads a String. To read an integer from it, Integer.parseInt() and for Double, use Double.parseDouble()
        String str = br.readLine(); 
//      System.out.println(c); 
        System.out.println(str); 
        f.close(); 
        br.close(); 
        } 
        catch(IOException e) { 
        System.out.println(e); 
        } 
/*      catch(FileNotFoundException f) { 
                System.out.println(f); 
        }*/ 
        } 
} 
