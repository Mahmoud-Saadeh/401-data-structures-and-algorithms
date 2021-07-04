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
}
