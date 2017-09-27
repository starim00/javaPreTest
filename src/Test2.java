import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        for(int i = 0;i<list.size();i++){
            int index = i;
            E max = list.get(i);
            for(int j = i ;j<list.size();j++){
                if(max.compareTo(list.get(j))<0){
                    max = list.get(j);
                    index = j;
                }
            }
            E temp = list.get(i);
            list.set(i,max);
            list.set(index,temp);
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        for(int i = 0;i<10;i++){
            list.add(input.nextInt());
        }
        sort(list);
        for(int i = 0;i<10;i++){
            System.out.println(list.get(i));
        }
    }
}
