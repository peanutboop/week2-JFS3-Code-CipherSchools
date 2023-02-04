import java.io.File;
import java.io.IOException;

public class ioExcep {
    public static void main(String[] args) {
        File f= new File("C:/Users/ishan/OneDrive/Desktop/myTestFile.txt");
        try {
            f.createNewFile();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("File Created Succesfully!!");
    }
}
