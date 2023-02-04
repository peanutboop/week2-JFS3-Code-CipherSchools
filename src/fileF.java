import java.io.File;
public class fileF {
    public static void main(String[] args) {
        File f = new File("C:/Users/ishan/OneDrive/Desktop/keylogger");

        String[] files= f.list();

        for(String file : files) {
            System.out.println(file);
        }
        File[] files_arr= f.listFiles();

        for(File ff: files_arr) {
            ff.delete();
        }
    }
}
