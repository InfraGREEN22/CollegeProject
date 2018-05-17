import java.io.InputStream;
import java.io.*;
import java.lang.String;
public class fileinstance3 {
    public static void main(String[] args) throws IOException{
        try (
                FileInputStream in = new FileInputStream("C:\\Users\\Lenovo User\\IdeaProjects\\CollegeProject\\IOlessonb\\Sample1.txt");
                FileOutputStream out = new FileOutputStream("C:\\Users\\Lenovo User\\IdeaProjects\\CollegeProject\\IOlessonb\\Sample2.txt");
                BufferedInputStream bis = new BufferedInputStream(in);
                BufferedOutputStream bos = new BufferedOutputStream((new FileOutputStream("C:\\Users\\Lenovo User\\IdeaProjects\\CollegeProject\\IOlessonb\\Sample2.txt")));

        )
        {
            int data;
            while ((data = bis.read()) != -1)
                bos.write(data);

        }
    }
}
