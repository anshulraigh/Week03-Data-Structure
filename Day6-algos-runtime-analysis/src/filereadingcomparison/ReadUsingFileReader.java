package filereadingcomparison;

import java.io.FileReader;
import java.io.IOException;

public class ReadUsingFileReader {
    public static void readUsingFileReader(String filePath) throws IOException {
        long startTime = System.nanoTime();
        try (FileReader fr = new FileReader(filePath)) {
            while (fr.read() != -1) {} // Reading character by character
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.printf("FileReader Time: %,dns%n", elapsedTime);
    }

}
