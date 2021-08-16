import hashTable.HashTable;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class hashTableTests {

  @Test
  public void addToHashTable(){
    HashTable<String, Integer> hashTable = new HashTable<>();
    hashTable.add("Mahmoud",23);
    hashTable.add("Mohammad",28);

    assertNotNull(hashTable.contains("Mahmoud"));
    assertTrue(hashTable.contains("Mahmoud"));
    assertEquals(23, hashTable.get("Mahmoud"));
    assertNull(hashTable.get("Malek"));
  }

  @Test
  public void collision(){
    System.out.println(Objects.hashCode("FB"));
    System.out.println(Objects.hashCode("Ea"));

    HashTable<String, Integer> hashTable = new HashTable<>();
    hashTable.add("Mahmoud",23);
    hashTable.add("Mohammad",28);
    hashTable.add("FB",35);
    hashTable.add("Ea",20);

    assertTrue(hashTable.contains("FB"));
    assertTrue(hashTable.contains("Ea"));

    assertEquals(35, hashTable.get("FB"));
    assertEquals(20, hashTable.get("Ea"));

  }
}
