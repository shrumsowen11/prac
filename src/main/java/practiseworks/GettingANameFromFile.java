package practiseworks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class GettingANameFromFile {
    public static void main(String[] args) throws IOException {
        /*File file =new File("bmb.txt");
        file.createNewFile();
        if (file.exists()){
            System.out.println("Yes, that file is the computer.");
        }else{
            System.out.println("No, that file is not the computer.");
        }*/
            FileReader fileReader = null;
            fileReader = new FileReader("bmb.txt");
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line;
                //boolean fileHasLine= true;
                while ((line = bufferedReader.readLine()) != null) {
                    //memorise this statement, used 10000 times in real world
                    //while (fileHasLine) {
                    if ("utsala".equals(line)){
                        System.out.println("Found Name: "+ line);
                        break;
                    }
                }
                //System.out.println("No lines left to be printed.");
            }catch(Exception e) {
                e.printStackTrace();
            }
            System.out.println("No lines left to be printed.");
        }
    }
            /*finally {
                if(bufferedReader != null){
                    //try{
                    bufferedReader.close();
                    fileReader.close();
                    // }catch (Exception e){
                    //  e.printStackTrace();
                    //} }
                }
                System.out.println("Done");
            }*/


