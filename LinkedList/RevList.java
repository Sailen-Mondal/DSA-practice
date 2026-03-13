package LinkedList;

import java.util.LinkedList;

public class RevList {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        LinkedList<Integer> revList = new LinkedList<>();

        while(!list.isEmpty()){
            revList.addLast(list.removeLast());
        }
        System.out.println(revList);
    }
    
}
