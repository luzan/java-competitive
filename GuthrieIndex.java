import java.util.ArrayList;
import java.util.List;

public class GuthrieIndex {
    public static void main(String[] args){
        System.out.println(guthrieIndex(7));
    }

    static int guthrieIndex(int n){
        if(n == 1) 
            return 0;

        List<Integer> list = new ArrayList<>();
        while (n != 1){
            if(n % 2 == 0){
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }    
            list.add(n);
        }

        if(list.get(list.size() - 1) == 0) {
            return 0;
        } else {
            return list.size();
        }
    }
}