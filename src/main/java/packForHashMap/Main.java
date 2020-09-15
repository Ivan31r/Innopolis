package packForHashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> test = new HashMap<>();
        test.put("Str1",10);
        test.put("Str2",20);
        test.put("Str3",30);
        test.put("Str1",40);
        System.out.println(test.size);
    }
}
