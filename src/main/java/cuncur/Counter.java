package cuncur;

import java.util.Map;

public class Counter {
    private final Map<Integer,Integer> count;

    public Counter(Map<Integer, Integer> count) {
        this.count = count;
    }

    public void add(Integer value){
        String format =String.format("name=%s i=%d",Thread.currentThread().getName(),value);
        System.out.println(format);
        System.out.println("value = " + value);
//        if (count.containsKey(value)){
//            count.put(value,count.get(value) + 1);
//        }else {
//            count.put(value,0);
//        }
    }

    public Map<Integer, Integer> getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count=" + count +
                '}';
    }
}
