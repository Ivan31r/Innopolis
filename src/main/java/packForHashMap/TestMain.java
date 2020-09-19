package packForHashMap;

public class TestMain {
    public static void main(String[] args) {
        HashMap<String, Integer> localHashMap = new HashMap<>(20);
        localHashMap.put("Str1",10);
        localHashMap.put("Str2",10);
        System.out.println(localHashMap.get("Str1"));
    }
}


