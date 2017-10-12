import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortUtils2 {
    public static TreeMap sort(HashMap<Teacher,String> noSort) {
        TreeMap<Teacher,String> result = new TreeMap<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getID().compareTo(o2.getID());
            }
        });
        result.putAll(noSort);
        return result;
    }
    public static void main(String args[]){
        HashMap<Teacher,String> noSort=new HashMap<>();
        for(int i = 0 ;i<20;i++){
            noSort.put(new Teacher(Integer.toString(i)),"Teacher");
        }
        TreeMap<Teacher,String> sorted = sort(noSort);
        System.out.println(sorted);
    }
}
