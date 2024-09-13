/*
* This is a class to create Key Value pair Objects so that it can be saved in a map LinkedList.
* I created this as a separate class because KeyValue is a Noun.
* Made key and value class variables which would allow for more methods like hash functions to be able to use for further modification. Thus, making it possible for scalability.
* */
public class KeyValue {
    //class variables
    Object key;
    Object value;

    //constructor
    public KeyValue(Object key, Object value){
        this.key = key;
        this.value = value;

    }
}
