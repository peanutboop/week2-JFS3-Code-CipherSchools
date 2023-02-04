import java.io.FileWriter;
import java.io.IOException;
    public class fileWriter {
        public static void main(String[] args) throws IOException {

            FileWriter fw = new FileWriter("C:/Users/ishan/OneDrive/Desktop/myTestFile.txt");

            fw.write("I am The Earth \n");
            fw.write("I am The Forest Green \n");
            fw.write("I am the Four Winds Blowing \n");
            fw.write("I am the Earth \n");

            fw.flush();
            fw.close();
            System.out.println("File Prepared Succesfully!");

        }
    }
