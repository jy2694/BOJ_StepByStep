import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < array.length; i ++) array[i] = scan.nextInt();
        int v = scan.nextInt();
        
        System.out.println(Arrays.stream(array).filter(x -> x == v).count());
    }
}