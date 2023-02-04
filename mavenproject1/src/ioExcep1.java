import java.io.File;
public class ioExcep1 {
    public static void main(String[] args) {
        File f = new File("C:/Users/ishan/OneDrive/Desktop/myTestFile.txt");

        if(f.exists()) {
            System.out.println("Printing File Details");
            System.out.println("---------------------");
            System.out.println("File name:" +f.getName());
            System.out.println("File size:" +f.length());
            System.out.println("File path:" +f.getAbsolutePath());
            System.out.println("Readable? " +f.canRead());
            System.out.println("Writable? " +f.canWrite());
            System.out.println("---------------------");
        }
        File f1 = new File("C:/Users/ishan/OneDrive/Desktop/yoo");
        f1.mkdir();
    }
}

