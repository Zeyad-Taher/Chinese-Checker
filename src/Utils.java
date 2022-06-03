import java.util.ArrayList;

public class Utils {
    public static ArrayList<Pair> deepCopyPairs(ArrayList<Pair> pairs) {
        ArrayList<Pair> result = new ArrayList<>();
        for (Pair pair: pairs) {
            result.add((Pair)pair.clone());
        }
        return result;
    }
}
