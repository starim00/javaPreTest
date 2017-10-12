import java.util.*;

public class SortUtils {
    public static Set<Student> sort(ArrayList<Student> noSort){
        Set<Student> sorted = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(Integer.parseInt(o1.getID())>Integer.parseInt(o2.getID()))
                    return -1;
                else if (Integer.parseInt(o1.getID())==Integer.parseInt(o2.getID()))
                    return 0;
                else
                    return 1;
            }
        });
        sorted.addAll(noSort);
        return sorted;
    }

    public static void main (String args[]){
        ArrayList<Student> noSort = new ArrayList<>();
        for(int i = 0 ;i < 20;i++){
            noSort.add(new Student(Integer.toString(i)));
        }
        Set<Student> sort = sort(noSort);
        System.out.println(sort);
    }
}
