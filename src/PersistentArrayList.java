import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PersistentArrayList {
    private ArrayList<String> arrayList;

    public PersistentArrayList(ArrayList<String> arraylist, String filename) {
        this.arrayList = arraylist;
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename, false))) {
            for (String i : arraylist) {
                pw.print(i + " ");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public String get(int i) {
        if (i >= arrayList.size()) {
            System.out.println("Element requested doesn't exist");
        }
        return arrayList.get(i);
    }
}