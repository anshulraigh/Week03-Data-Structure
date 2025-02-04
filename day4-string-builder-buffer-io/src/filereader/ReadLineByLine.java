package filereader;

import java.io.*;

public class ReadLineByLine {
    public static void main(String[] args){
        String filepath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week03\\day4-string-builder-buffer-io\\src\\filereader\\file.txt";
        try(BufferedReader bf = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line=bf.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
