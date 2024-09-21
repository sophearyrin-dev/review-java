1. Map Interface
The Map interface represents a collection of key-value pairs, where each key is unique. Maps are not part of the Collection hierarchy but are essential for storing key-value mappings.

Key Characteristics:
- Unique Keys: Each key in the map must be unique.
- Key-Value Pair: Maps store data in the form of key-value pairs (e.g., <K, V>).
- No Duplicates: Duplicate values are allowed, but not duplicate keys.

Common Implementations:
HashMap: Unordered, unsorted map backed by a hash table. Provides constant time (O(1)) operations for insertion, deletion, and access, assuming good hash distribution.

```java
Map<String, Integer> hashMap = new HashMap<>();
hashMap.put("Alice", 30);
hashMap.put("Bob", 25);
```

LinkedHashMap: Like HashMap, but it maintains the insertion order of the elements.
```java
Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put("Alice", 30);
linkedHashMap.put("Bob", 25);
```

TreeMap: Implements a Red-Black tree and keeps the keys in a sorted (natural or custom) order. Operations like insertion and lookup take O(log n) time.

```java
Map<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Alice", 30);
treeMap.put("Bob", 25);
```

Common Methods:
- put(K key, V value): Inserts a key-value pair.
- get(Object key): Retrieves the value associated with the key.
- remove(Object key): Removes the key-value pair.
- containsKey(Object key): Checks if a key exists.
- keySet(): Returns a set of all keys.
- values(): Returns a collection of all values.

2. Set Interface
The Set interface represents a collection that does not allow duplicates. It is a subtype of Collection.

Key Characteristics:
- No Duplicates: Ensures that no two elements are equal.
- Unordered or Ordered: Some sets maintain order, others do not.

Common Implementations:
- HashSet: Backed by a hash table, and elements are stored in no particular order. Offers constant time (O(1)) performance for basic operations.
```java
Set<String> hashSet = new HashSet<>();
hashSet.add("Alice");
hashSet.add("Bob");
```

