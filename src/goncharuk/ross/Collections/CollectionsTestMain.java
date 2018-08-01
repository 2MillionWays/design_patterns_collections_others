package goncharuk.ross.Collections;

import goncharuk.ross.Collections.LinkedList.SingleLinkedList;

public class CollectionsTestMain {
    public static void main(String[] args) {
        SingleLinkedList<String> test = new SingleLinkedList<>();
        test.add("One");
        test.add("Two");
        test.add("Three");
        System.out.println(test.size());
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        System.out.println(test.get(2));

        System.out.println(test);

        System.out.println("Element removed? - " + test.remove("One"));

        System.out.println(test);
        System.out.println(test.size());

        System.out.println(test.get(0));
        System.out.println(test.get(1));

        for (String s : test){
            if (s.equals("Three")){
                test.remove("Three");
            }
        }
        System.out.println(test.size());
        System.out.println(test);

        /*LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Iterator i = linkedList.listIterator();

        i.next();
        i.remove();

        System.out.println(linkedList);
        System.out.println(linkedList.size());

        int test1 = 100;
        System.out.println(test1>>1);

        OneDirLink<String> stringOneDirLink = new OneDirLink<>();
        stringOneDirLink.add("test");
        stringOneDirLink.add("test1");
        stringOneDirLink.add("lolol");
        System.out.println(stringOneDirLink.getFirst());
        System.out.println(stringOneDirLink.getLast());
        System.out.println(stringOneDirLink.get(1));
        stringOneDirLink.add(1, "ross");
        System.out.println(stringOneDirLink.get(1));
        System.out.println(stringOneDirLink);*/
    }
}
