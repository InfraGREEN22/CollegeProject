import java.io.File;
import java.io.IOException;
public class fileinstance {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\Lenovo User\\IdeaProjects\\CollegeProject\\IOlessonb");
        if (dir.exists()) System.out.println("The directory is already there!");
        else {
            boolean sucess = dir.mkdir();
            if (sucess) System.out.println("The directory has been created successfully!");
             else {
                System.out.println("Error when creating the directory!");
                System.exit(0);
                }
            }
        String dirPath = dir.getAbsolutePath();
        File file = new File(dirPath + "\\test.txt");
        if (file.createNewFile())
            System.out.println("The file has been successfully created!");
        else
            System.out.println("Error, file already exists.");
        File renamedFile = new File(dirPath + "\\test-renamed.txt");
        renamedFile.createNewFile();
        if (file.renameTo(renamedFile))
            System.out.println("The file has been successfully renamed!");
        else
            System.out.println("Error when renaming file");
        if (renamedFile.delete())
            System.out.println("The file has been successfully deleted");
        else
            System.out.println("Error when deleting the file");

    }
}
