package DataStructures.HashMap;

/*
  >>In java, elements of Map are stored in key/value pairs. Keys are unique values associated with
    individual values. A map cannot contain duplicate keys. And each key is associated with a single
    value.
    
  >>We can access and modify values using the keys associated with them. In the above diagram, we
    have values: USA , Brazil, Spain. And we have c0orresponding keys: us, br, es.Now, we can 
    access those values using corresponding keys.
    
      Keys             values
    ------------------------------
      us			   USA
      br			   Brazil
      es			   Spain
      
      
 */

/*
	MAP IMPLEMENTATION:
	
	>>Since map is an interface, we cannot create objects from it.
	>>In order to use functionalities of the Map interface, we can use these classes:
		(these classes implements Map)
		1>HashMap
		2>EnumMap
		3>LinkedHashMap
		4>WeakHashMap
		5>TreeMap
		
	>>Map extends Collection.	
 */

/*
 	Methods Of Map:
 	
 	1>put(k, v) -> Inserts the association of a key K and a value V into the map. If the key is 
 					already present, the new value replaces the old value.
 					
 	2>putAll() -> Inserts all the entries from the specified map to this map.
 	
 	3>putIfAbsent(k,v) -> Inserts the association if the key K is not already associated with the 
 						  value v.
 						  
 	4>get(K) -> Returns the value associated with the specified key k. If the Key is not found, it 
 				returns null.
 				
 	5>getOrDefault(k, defaultValue) -> Returns the value associated with specified key K.If the 
 						key is not found, it returns default values.
 						
 	6>containsKey(K) -> Checks if the specified key k is present in the map or not.
 	
 	7>containsValue(V) -> Checks if the specified value V is present in the map or not.
 	
 	8>replace(K, V) -> Replace the value of the key k with the new specified value V.
 	
 	9>replace(k, oldValue, newVlaue) -> Replaces the value of the key k with the new value newValue
 				only if the key is associated with the value oldValue.
 				
 	10>remove(K) -> Removes the entry from the map represented by the key K.
 	
 	11>remove(k, v) -> Removes the entry from the map that has key k associated with the value V.
 	
 	12>keySet() -> Returns a set of all the keys present in a map.
 	
 	13>values() -> Returns a set of all the values present in map.
 	
 	14>entrySet() -> Returns a set of all key/value mapping present in a map.
 	
 */
public class intro {

	public static void main(String[] args) {
		

	}

}
