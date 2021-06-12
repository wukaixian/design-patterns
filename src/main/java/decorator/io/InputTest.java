package decorator.io;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        ClassLoader classLoader = InputTest.class.getClassLoader();
        File file = new File(classLoader.getResource("file.txt").getFile());
        int c;
        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println();
        try (InputStream upIn = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while ((c = upIn.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
