
package com.company;

        import java.util.Comparator;
        import java.util.TreeMap;

public class TreemapDemo {
    public static void main(String arg[]){
        TreeMap map=new TreeMap();
        map.put(101,"ZZZ");
        map.put(103,"EEE");
        map.put(104,"YYY");
        map.put(107,"AAA");
        //  map.put("FFF","MMM");  ClassCastException
        //  map.put(null,"FFF");  NullPointerException
        System.out.println(map);
        System.out.println("====================================");
        TreeMap map1=new TreeMap();
        map1.put("AAA",10);
        map1.put("YYY",20);
        map1.put("EEE",30);
        map1.put("III",40);
        map1.put("FFF",50);
        System.out.println(map1);

        System.out.println("====================================");
        TreeMap map2=new TreeMap(new MyStringComparator());
        map2.put("AAA",10);
        map2.put("YYY",20);
        map2.put("EEE",30);
        map2.put("III",40);
        map2.put("FFF",50);
        System.out.println(map2);




    }
}

class MyStringComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s1=(String) o1;
        String s2=(String) o2;
        return s2.compareTo(s1);
    }
}