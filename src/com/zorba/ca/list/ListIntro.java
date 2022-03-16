package com.zorba.ca.list;

import java.util.*;

public class ListIntro {
    public static void main(String[] args) {

        List l = new ArrayList();
        //System.out.println(l.size());
        l.add(1);
        l.add(2);
        l.add(4);
        //System.out.println(l.size());
        l.add(3);
        l.add(2);
        l.add(5);
        l.add(1);
        //System.out.println(l);


        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(1);
        //System.out.println(set);

        Map map = new HashMap();
        map.put(1,"hello");
        map.put(2,"every one");
        map.put(3,"good");

        System.out.println(map);





    }
}
