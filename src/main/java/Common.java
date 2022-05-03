import java.util.List;

public class Common {

    public static int [] ListToArray(List<Integer> list){
        int [] res = new int [list.size()];

        for (int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
