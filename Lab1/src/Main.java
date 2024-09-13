/*
* Added some test cases to ensure my Custom Map is working.
* */
public class Main {

    public static void main(String[] args) {
        MyMap map = new MyMap();

        int[] test = {1,2,3,4};

        map.put("1","value1");
        map.put(1,1.234);
        map.put(1.234,"yoo");
        map.put(null, 1);
        map.put(true, true);
        map.put(test,"hello");

        Object key1 = map.get("1");
        Object key2 = map.get(1);
        Object key3 = map.get(1.234);
        Object key4 = map.get(null);
        Object key5 = map.get(true);
        Object key8 = map.get(test);

        System.out.println("key1: " + key1);
        System.out.println("key2: " + key2);
        System.out.println("key3: " + key3);
        System.out.println("key4: " + key4);
        System.out.println("key5: " + key5);
        System.out.println("key8: " + key8);

        map.put(1.234,"1");
        map.put(null, "hello World");

        Object key6 = map.get(1.234);
        Object key7 = map.get(null);

        System.out.println("key3 Updated: " + key6);
        System.out.println("key4 Updated: " + key7);


        System.out.println("size: " + map.size());
        System.out.println("contains: " + map.containsKey(1.234));
        System.out.println("contains: " + map.containsKey(1.2345));
        System.out.println("contains: " + map.containsKey(null));
        System.out.println("contains: " + map.containsKey(true));

    }


}