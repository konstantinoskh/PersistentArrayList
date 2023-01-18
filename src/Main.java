import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(List.of("Hello", "Kon", "how are you"));
        PersistentArrayList text =  new PersistentArrayList(arrayList, "hello.txt");
        System.out.println(text.get(2));
        }
    }