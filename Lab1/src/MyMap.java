/*
* This is the implementation for my Custom Map. This has 4 methods: get, put, size and contains.
* We are using LinkedList as our primary data structure.
* LinkedList myCustomMap has a custom data type of KeyValue so that we can create LinkedList of Key value pair objects.
* */

import java.math.BigDecimal;
import java.util.LinkedList;
public class MyMap {
    LinkedList<KeyValue> myCustomMap;

    public MyMap(){
        this.myCustomMap = new LinkedList<KeyValue>(); //Initializing the linked-list of type KeyValue
    }


    public Object get(Object key){
        BigDecimal tempKey = null; // Using BigDecimal to handle the precision for Float and Double
        if(key instanceof Float){
            tempKey = new BigDecimal((Float) key); //Type Casting the key to Float so that it can be accepted by BigDecimal
        }else if(key instanceof Double){
            tempKey = new BigDecimal((Double) key); //Type Casting the key to Double so that it can be accepted by BigDecimal
        }
        for(KeyValue i:this.myCustomMap){
            // Checking whether it is Float or Double
            if(tempKey != null && i.key instanceof BigDecimal){
                if(((BigDecimal) i.key).compareTo(tempKey) == 0){
                    return i.value;
                }
            }else if(i.key != null && i.key.equals(key)){ // Checking for non-null types other than Float or Double
                return i.value;
            }else if(i.key == null && key == null){ // Checking for null keys
                return i.value;
            }
        }
        return null;
    }

    public void put(Object key , Object value){
        BigDecimal tempKey = null;
        if(key instanceof Float){
            tempKey = new BigDecimal((Float) key);
        }else if(key instanceof Double){
            tempKey = new BigDecimal((Double) key);
        }
        for(KeyValue i: this.myCustomMap){
           if(tempKey != null && i.key instanceof BigDecimal){
               if(((BigDecimal) i.key).compareTo(tempKey) == 0){
                   i.value = value;
                   return;
               }
           }else if(i.key != null && i.key.equals(key)){
               i.value = value;
               return;
           }else if(i.key == null && key == null){
               i.value = value;
               return;
           }
        }
        KeyValue keyValuePair = tempKey != null ? new KeyValue(tempKey,value) : new KeyValue(key,value); // Creating a KeyValue Object to store in the Linked List
        this.myCustomMap.add(keyValuePair);
    }

    public int size(){
        return this.myCustomMap.size();
    }

    public boolean containsKey(Object key){
        BigDecimal tempKey = null;
        if(key instanceof Float){
            tempKey = new BigDecimal((Float) key);
        }else if(key instanceof Double){
            tempKey = new BigDecimal((Double) key);
        }
        for(KeyValue i:this.myCustomMap){
            if(tempKey != null && i.key instanceof BigDecimal){
                if(((BigDecimal) i.key).compareTo(tempKey) == 0){
                    return true;
                }
            }else if(i.key != null && i.key.equals(key)){
                return true;
            }else if(i.key == null && key == null){
                return true;
            }
        }
        return false;
    }
}
