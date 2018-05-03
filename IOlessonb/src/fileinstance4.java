import java.io.*;

public class fileinstance4 {
    public static void main(String[] args) throws IOException {
        String dataFile = "C:\\Users\\Lenovo User\\IdeaProjects\\CollegeProject\\IOlessonb\\Sample1.txt";
        double[] values = { 10.55, 33.11, 8.08, 0.99, 45.00};
        System.out.println("db");
        DataOutputStream out = new DataOutputStream(new
                BufferedOutputStream(new
                FileOutputStream("C:\\Users\\Lenovo User\\IdeaProjects\\CollegeProject\\IOlessonb\\Sample1.txt")));

        for (int i = 0; i < values.length; i++){
            //out.writeUTF();
            out.writeBytes(Double.toString(values[i])+"\n");
            out.writeBytes(System.getProperty("line.separator"));

            //out.writeDouble(values[i]);
            //System.out.println(values[i]);
            //out.writeUTF(Double.toString(i));
        }
        out.close();

    }
}
