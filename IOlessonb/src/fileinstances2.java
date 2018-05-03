import java.io.File;
import java.io.IOException;
public class fileinstances2 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Lenovo User\\IdeaProjects\\CollegeProject\\IOlessonb");
        if (dir.exists())
            System.out.println("The directory is already there");
        else {
                boolean success = dir.mkdir();
                if (success)
                    System.out.println("");

        }
    }
}
