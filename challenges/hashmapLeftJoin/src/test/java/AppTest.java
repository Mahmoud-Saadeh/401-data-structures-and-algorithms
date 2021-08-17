import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppTest {
  @Test
  public void leftJoinTest(){
    App app = new App();
    HashMap<String,String> synonym = new HashMap<>();
    HashMap<String,String> antonym = new HashMap<>();

    synonym.put("fond", "enamored");
    synonym.put("wrath", "anger");
    synonym.put("diligent", "employed");
    synonym.put("outfit", "garb");
    synonym.put("guide", "usher");

    antonym.put("fond", "averse");
    antonym.put("wrath", "delight");
    antonym.put("diligent", "idle");
    antonym.put("guide", "follow");
    antonym.put("flow", "jam");

    List<List<String>> res = app.hashMapLeftJoin(synonym,antonym);

    List<String> test1 = new ArrayList<>();
    test1.add("fond");
    test1.add("enamored");
    test1.add("averse");

    assertEquals(3, res.get(0).size());
    assertEquals(5, res.size());
    assertTrue( res.contains(test1));
  }
}
