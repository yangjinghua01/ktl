import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Copy {


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);
        List<Integer> list2 = list1;
        System.out.println(list2);
        list1.add(55);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("----------------->执行depinCopy");
        depinCopy();
    }

    /**
     * 深拷贝
     */
    private static void depinCopy(){
        List<Integer> oldlist = new ArrayList<>();
        oldlist.add(1);
        oldlist.add(2);
        oldlist.add(3);
        List<Integer> newlist = new ArrayList<>();
        Collections.addAll(newlist,new Integer[oldlist.size()]);
        Collections.copy(newlist,oldlist);
        System.out.println(oldlist);
        System.out.println(newlist);
        oldlist.add(55);
        System.out.println(oldlist);
        System.out.println(newlist);
    }


}
