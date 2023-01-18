import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PersistentArrayList {
    private ArrayList<String> arrayList;
    private String filename;

    public PersistentArrayList(ArrayList<String> arraylist, String filename) {
        this.filename = filename;
        this.arrayList = arraylist;
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename + ".txt", false);
            PrintWriter pw = new PrintWriter(fw);
            for (String i : arraylist) {
                pw.print(i + " ");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }finally {
            try {
                assert fw != null;
                fw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public String get(int i) {
        if (i >= arrayList.size()) {
            System.out.println("Element requested doesn't exist");
        }
        return arrayList.get(i);
    }
    public void add(String text){
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename, true))){
            for (String i:arrayList) {
                pw.print(i + " ");
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}