import java.util.ArrayList;
import java.util.TreeSet;
public class learncollection {
    public static void main(String[] args) {
        String str1 = new String("John");
        String str2 = new String("Lisa");
        String str3 = new String("Sam");
        System.out.println("List method");
        ArrayList<String> stringlist = new ArrayList<>();
        TreeSet<String> newStringlist = new TreeSet<>();
        //HashSet<String> newStringlist = new HashSet<>();
        stringlist.add("one");
        stringlist.add("two");
        stringlist.add(1, "three");
        newStringlist.add(str1);
        newStringlist.add(str2);
        newStringlist.add(str3);
        String str4 = new String("John");
        //System.out.println(stringlist.get(1));
        //newStringlist.addAll(stringlist);
        //newStringlist.addAll(1,stringlist);
        //System.out.println(newStringlist.get(2));
        //System.out.println(newStringlist.indexOf("Sam"));
        for (String element : newStringlist){
            System.out.println(element);
        }
        System.out.println(newStringlist);
    }
}
