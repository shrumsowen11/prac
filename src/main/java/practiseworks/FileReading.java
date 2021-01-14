package practiseworks;

import java.io.*;

public class FileReading {
    public static void main(String[] args) throws IOException {
        /*File file =new File("bmb.txt");
        file.createNewFile();
        if (file.exists()){
            System.out.println("Yes, that file is the computer.");
        }else{
            System.out.println("No, that file is not the computer.");
        }*/
        FileReader fileReader = null;
        BufferedReader bufferedReader= null;
        try{
            fileReader = new FileReader("bmb.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            boolean fileHasLine= true;
            while(fileHasLine) {
                line = bufferedReader.readLine();
                if(line == null ||line == "\n"){
                    fileHasLine = false;
                    break;
                }
                System.out.println(line);
                Thread.sleep(500);


            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            if(bufferedReader != null){
                //try{
                bufferedReader.close();
                fileReader.close();
                // }catch (Exception e){
                //  e.printStackTrace();
                //} }
            }
            System.out.println("Done");
        }
    }}
