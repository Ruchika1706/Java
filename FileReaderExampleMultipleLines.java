import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
class FileReaderExampleMultipleLines {
        public static void main(String args[]){
        try {
             FileInputStreamReader f = new FileInputStreamReader("test.txt");
            //char c = (char)f.read();
            BufferedReader br = new BufferedReader(f);
            // side-effect we have missed a character read
           // while(br.read()!=-1){
           String str;
           while((str = br.readLine())!=null){
              //String str = br.readLine();
//            System.out.println(c);
              System.out.println(str);
            }   
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
   