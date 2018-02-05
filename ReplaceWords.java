
class ReplaceWords {
    public static void main(String args[]){
        String arr = "Hi this is test test test you";
        String result;
        System.out.println("Before:");
        System.out.println(arr);
        /*First Way*/
        result = arr.replaceAll("test","newword");
        System.out.println("After:");
        System.out.println(result);
        /*Second Way will only replace first occurence*/
        result = arr.replaceFirst("test","newword");
        System.out.println("After:");
        System.out.println(result);
        /* Third way using split*/
        String sample[] = arr.split(" ");
        String empty ="";
        for(int i=0;i<sample.length;i++){
            if(sample[i].equals("test")){
                sample[i] = "newword";
                empty += sample[i]+" ";
            }
            else {
                empty += sample[i]+" ";
            }
        }
        System.out.println(empty);


    }
}