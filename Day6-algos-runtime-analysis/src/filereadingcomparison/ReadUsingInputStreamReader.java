package filereadingcomparison;
import java.io.*;

public class ReadUsingInputStreamReader {
    public static void readUsingInputStreamReader(String filePath) throws IOException {
        long startTime = System.nanoTime();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            while (isr.read() != -1) {} // Reading byte stream converted to characters
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.printf("InputStreamReader Time: %,dns%n", elapsedTime);
    }
}
