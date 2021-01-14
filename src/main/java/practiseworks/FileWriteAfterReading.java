package practiseworks;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteAfterReading {
    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Paths.get("bmb.txt"));
        File file = new File("temp.txt");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        if(!file.exists()){
            file.createNewFile();
        }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for(String str : list){
                bufferedWriter.write(str + "\n");

        }
        //try{
            //if (bufferedWriter!=null){
                bufferedWriter.close();
                fileWriter.close();
           /* }
        }catch(Exception e){
            e.printStackTrace();
        }*/


    }
}
