import java.util.Scanner;
/*
    泛型方法找出数组最大值
*/
public class Test1 {
    private static <E extends Comparable<E>> E max(E[] list) {
        E max;
        max = list[0];
        for(int i = 1;i<list.length;i++){
            if(max.compareTo(list[i])<0)
                max = list[i];
        }
        return max;
    }
    public static void main(String args[]){
        Integer list[] = new Integer[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<10;i++){
            list[i] = input.nextInt();
        }
        System.out.println(max(list));
    }
}
