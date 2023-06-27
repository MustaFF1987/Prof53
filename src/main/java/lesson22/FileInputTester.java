package lesson22;

import java.io.*;

public class FileInputTester {
    public static void main(String[] args) {
        try {
            // InputStream дает возожность считывать только байты
            InputStream testFileStream = new FileInputStream("testfile.txt");
            // Reader позволяет читать символы и строки
            Reader testFileReader = new InputStreamReader(testFileStream);
            int symbol = testFileReader.read();
            while (symbol != -1)
            {
                System.out.print((char) symbol);
                symbol = testFileReader.read();
            }
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        //
    }
}
