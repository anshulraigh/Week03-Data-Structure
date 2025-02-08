package filereadingcomparison;

import java.io.*;

import static filereadingcomparison.ReadUsingFileReader.readUsingFileReader;
import static filereadingcomparison.ReadUsingInputStreamReader.readUsingInputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String filePath ="C:\\Users\\Public\\CapgeminiHandsOn\\Week03\\Day6-algos-runtime-analysis\\src\\filereadingcomparison\\500mb-examplefile-com.txt";
        System.out.println("Comparing FileReader vs InputStreamReader:");
        readUsingFileReader(filePath);
        readUsingInputStreamReader(filePath);
    }
}
