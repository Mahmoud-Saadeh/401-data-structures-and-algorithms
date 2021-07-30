import kAryTree.KAryTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class kAryTest {
  @Test
  public void kAryTreeThree(){
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(30);
    KAryTree<Integer> kAryTree = new KAryTree<>(list, 3);
    assertEquals("should return 1","1" , "" + kAryTree.getRoot().getKey());

    assertEquals("should return 2","2" , "" + kAryTree.getRoot().getChild(0).getKey());
    assertEquals("should return 3","3" , "" + kAryTree.getRoot().getChild(1).getKey());
    assertEquals("should return 4","4" , "" + kAryTree.getRoot().getChild(2).getKey());

    assertEquals("should return 5","5" , "" + kAryTree.getRoot().getChild(0).getChild(0).getKey());
    assertEquals("should return 6","6" , "" + kAryTree.getRoot().getChild(0).getChild(1).getKey());
    assertEquals("should return 7","7" , "" + kAryTree.getRoot().getChild(0).getChild(2).getKey());

  }
  @Test
  public void kAryTreeFour(){
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(30);
    KAryTree<Integer> kAryTree = new KAryTree<>(list, 4);
    assertEquals("should return 1","1" , "" + kAryTree.getRoot().getKey());

    assertEquals("should return 2","2" , "" + kAryTree.getRoot().getChild(0).getKey());
    assertEquals("should return 3","3" , "" + kAryTree.getRoot().getChild(1).getKey());
    assertEquals("should return 4","4" , "" + kAryTree.getRoot().getChild(2).getKey());
    assertEquals("should return 5","5" , "" + kAryTree.getRoot().getChild(3).getKey());

    assertEquals("should return 6","6" , "" + kAryTree.getRoot().getChild(0).getChild(0).getKey());
    assertEquals("should return 7","7" , "" + kAryTree.getRoot().getChild(0).getChild(1).getKey());
    assertEquals("should return 8","8" , "" + kAryTree.getRoot().getChild(0).getChild(2).getKey());

  }
}
