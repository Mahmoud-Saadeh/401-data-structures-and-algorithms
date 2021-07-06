package linkedlist;

//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class LinkedListTest {
  @Test
  @DisplayName("test the insert and includes methods")
  public void insertAndIncludesTest() {
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.insert(3);
    testList.insert(8);
    testList.insert(44);
    testList.insert(6);

    Assertions.assertTrue((testList.includes(44)), "app should return true for testList, 44");
    Assertions.assertFalse(testList.includes(45), "app should return false for testList, 45");
    Assertions.assertTrue(testList.includes(8), "app should return true for testList, 8");

  }

  @Test
  @DisplayName("test the first value in the LinkedList")
  public void nodeHeadTest(){
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.insert(3);
    testList.insert(8);
    testList.insert(44);
    testList.insert(6);

    Assertions.assertEquals(6,testList.getHead().value, "app should return 6 as a head for testList");
  }

  @Test
  @DisplayName("test the print all value in the LinkedList")
  public void printAllTest(){
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.insert(3);
    testList.insert(8);
    testList.insert(44);
    testList.insert(6);

    Assertions.assertEquals("{ 6 } -> { 44 } -> { 8 } -> { 3 } -> NULL",testList.valuesToString(), "app should print { 6 } -> { 44 } -> { 8 } -> { 3 } -> NULL");
  }

  @Test
  @DisplayName("test the order of the values in the LinkedList for append")
  public void appendTest(){
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.append(3);
    testList.append(8);
    testList.append(44);
    testList.append(6);

    Assertions.assertEquals("{ 3 } -> { 8 } -> { 44 } -> { 6 } -> NULL",testList.valuesToString(), "app should print { 3 } -> { 8 } -> { 44 } -> { 6 } -> NULL");
  }
  @Test
  @DisplayName("test the order of the values in the LinkedList for insertBefore")
  public void insertBeforeTest(){
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.append(3);
    testList.append(8);
    testList.append(44);
    testList.append(6);

    testList.insertBefore(44,5);
    testList.insertBefore(3,7);
    testList.insertBefore(3,7);

    Assertions.assertEquals("{ 7 } -> { 7 } -> { 3 } -> { 8 } -> { 5 } -> { 44 } -> { 6 } -> NULL",testList.valuesToString(), "app should print { 7 } -> { 7 } -> { 3 } -> { 8 } -> { 5 } -> { 44 } -> { 6 } -> NULL");
  }
  @Test
  @DisplayName("test the order of the values in the LinkedList for insertAfter")
  public void insertAfterTest(){
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.append(3);
    testList.append(8);
    testList.append(44);
    testList.append(6);

    testList.insertAfter(44,5);
    testList.insertAfter(3,7);
    testList.insertAfter(3,7);
    testList.insertAfter(6,55);

    Assertions.assertEquals("{ 3 } -> { 7 } -> { 7 } -> { 8 } -> { 44 } -> { 5 } -> { 6 } -> { 55 } -> NULL",testList.valuesToString(), "app should print { 3 } -> { 7 } -> { 7 } -> { 8 } -> { 44 } -> { 5 } -> { 6 } -> { 55 } -> NULL");
  }

  @Test
  public void kGreaterThanList(){
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.append(3);
    testList.append(8);
    testList.append(44);
    testList.append(6);

    Assertions.assertEquals("the value is greater than the length of the list",testList.kthFromEnd(5), "kthFromEnd should print the value is greater than the length of the list");

  }

  @Test
  public void kEqualList(){
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.append(3);
    testList.append(8);
    testList.append(44);
    testList.append(6);

    Assertions.assertEquals("3",testList.kthFromEnd(4), "kthFromEnd should print 3");

  }

  @Test
  public void kNotPositiveList(){
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.append(3);
    testList.append(8);
    testList.append(44);
    testList.append(6);

    Assertions.assertEquals("Can not enter a negative number",testList.kthFromEnd(-3), "kthFromEnd should print Can not enter a negative number");
  }

  @Test
  public void ListSizeOne(){
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.append(3);

    Assertions.assertEquals("3",testList.kthFromEnd(0), "kthFromEnd should print 3");
    Assertions.assertEquals("Can not enter a negative number",testList.kthFromEnd(-1), "kthFromEnd should print Can not enter a negative number");
    Assertions.assertEquals("the value is greater than the length of the list",testList.kthFromEnd(5), "kthFromEnd should print the value is greater than the length of the list");

  }

  @Test
  public void kInBetweenList(){
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.append(3);
    testList.append(8);
    testList.append(44);
    testList.append(6);

    Assertions.assertEquals("44",testList.kthFromEnd(1), "kthFromEnd should print 44");
  }

  @Test
  public void reverseTest(){
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.append(3);
    testList.append(8);
    testList.append(44);
    testList.append(6);

    testList.reverse();

    Assertions.assertEquals("{ 6 } -> { 44 } -> { 8 } -> { 3 } -> NULL",testList.valuesToString(), "reverseTest should print { 6 } -> { 44 } -> { 8 } -> { 3 } -> NULL");
  }

  @Test
  public void zipListsTest(){
    LinkedList<java.io.Serializable> testList = new LinkedList<>();

    testList.append(3);
    testList.append(8);
    testList.append(44);
    testList.append(6);

    LinkedList<java.io.Serializable> testList2 = new LinkedList<>();

    testList2.append(32);
    testList2.append(82);

    Assertions.assertEquals("{ 3 } -> { 32 } -> { 8 } -> { 82 } -> { 44 } -> { 6 } -> NULL",testList.zipLists(testList,testList2).valuesToString(), "zipListsTest should print { 3 } -> { 32 } -> { 8 } -> { 82 } -> { 44 } -> { 6 } -> NULL");
  }
}
