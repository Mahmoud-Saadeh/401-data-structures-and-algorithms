import hashTable.HashTable;

import java.util.Locale;
import java.util.Objects;

public class App {
  public static void main(String[] args) {
    App app = new App();
//    app.mostCommonWord("In a galaxy far far away");
//    app.mostCommonWord("Taco cat ate a taco");

    app.mostCommonWord("No. Try not. Do or do not. There is no try.");
  }

  public String mostCommonWord(String book){
    HashTable<String, Integer> hashTable = new HashTable<>();

    String tempWord = "";
    int tempCount = 0;

    for (String word: book.split("\\W")) {
      if (Objects.equals(word, "")){
        continue;
      }
      word = word.toLowerCase(Locale.ROOT);

      int count = hashTable.get(word) == null ? 1 : hashTable.get(word) + 1;

      if(count > tempCount){
        tempCount = count;
        tempWord = word;
      }

      hashTable.add(word,count);
    }
    return tempWord;

  }
}
