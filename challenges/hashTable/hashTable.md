# Hash Table
The Hashtable class implements a hash table, which maps keys to values. To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method.

## HashTable Methods
1. hashCode: to hash the given Key
2. getBucketIndex: to get the index for the key within the size of the array
3. getSize: to get the size of all the node in the array
4. isEmpty: to check if the array is empty
5. add: to add a new element into the array by giving the key and the value
6. remove: to remove the node of the given key
7. get: to get the value of the given key

## Efficiency

1. Space Complexity
    - Best case: O(n)
    - Worst case: O(n)
1. Time Complexity
  - add:
    - Best case: O(1)
    - Worst case: O(n)
  - remove:
    - Best case: O(1)
    - Worst case: O(n)
  - get:
      - Best case: O(1)
      - Worst case: O(n)
