import hashTable.HashTable;

public class App {
  public static void main(String[] args) {
    HashTable<String, Integer> hashTable = new HashTable<>();
    hashTable.add("John", 300);
    hashTable.add("Sally", 400);
    hashTable.add("Tom", 200);
    hashTable.add("Jade", 100);

    System.out.println("The size is => " + hashTable.getSize());
    System.out.println("The Sally allowance is => " + hashTable.get("Sally"));
    System.out.println("Delete Sally => " + hashTable.remove("Sally"));
    System.out.println("The size is => " + hashTable.getSize());
  }
}
