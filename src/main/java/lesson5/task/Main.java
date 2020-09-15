package lesson5.task;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> firstMap = new HashMap<>();
        firstMap.put("Name1",1);
        firstMap.put("Name2", 1);
        firstMap.put("Name3", 2);
        firstMap.put("Name4", 2);
        firstMap.put("Name5", 3);
        firstMap.put("Name6", 3);
        firstMap.put("Name7", 4);

        System.out.println(firstMap);

//        Map<Integer,String> res = reversMap(firstMap);

//        System.out.println(res);

    }
    public <V,K> Map<V,K> reversMap(Map<K,V> map){
        Map<K,V> workingMap = new HashMap<>(map);
        Map<V,K> finalMap = new HashMap<>();
        List<K> kList = new ArrayList<>();
        List<V> vList = new ArrayList<>();
        for (Map.Entry<K,V> entry : workingMap.entrySet()){
            K key = entry.getKey();
            V value = entry.getValue();
            kList.add(key);
            vList.add(value);
        }




        return finalMap;
    }
}
