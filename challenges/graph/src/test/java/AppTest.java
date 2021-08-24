import graph.Graph;
import graph.Vertex;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
  @Test
  public void addNode(){
    Graph graph = new Graph();

    graph.addVertex("Mahmoud");
    graph.addVertex("Mahmoud2");

    assertNotNull(graph.getVertices());
    assertEquals(2, graph.getVertices().size());
    assertTrue(graph.getVertices().contains(new Vertex("Mahmoud")));
  }

  @Test
  public void addEdge(){
    Graph graph = new Graph();

    graph.addVertex("Mahmoud");
    graph.addVertex("Mahmoud2");

    graph.addEdge("Mahmoud","Mahmoud2");

    assertNotNull(graph.getVertices());
    assertEquals(2, graph.getVertices().size());
    assertTrue(graph.getNeighbors("Mahmoud").contains(new Vertex("Mahmoud2")));
    assertTrue(graph.getNeighbors("Mahmoud2").contains(new Vertex("Mahmoud")));
  }

  @Test
  public void allNodes(){
    Graph graph = new Graph();

    graph.addVertex("Mahmoud");
    graph.addVertex("Mahmoud2");
    graph.addVertex("Mahmoud3");

    assertEquals(3, graph.getVertices().size());
    assertTrue(graph.getVertices().contains(new Vertex("Mahmoud")));
    assertTrue(graph.getVertices().contains(new Vertex("Mahmoud2")));
    assertTrue(graph.getVertices().contains(new Vertex("Mahmoud3")));
    assertFalse(graph.getVertices().contains(new Vertex("Mahmoud4")));
  }

  @Test
  public void nodeNeighbors(){
    Graph graph = new Graph();

    graph.addVertex("Mahmoud");
    graph.addVertex("Mahmoud2");

    graph.addEdge("Mahmoud","Mahmoud2");

    assertEquals(1, graph.getNeighbors("Mahmoud").size());
    assertTrue(graph.getNeighbors("Mahmoud").contains(new Vertex("Mahmoud2")));
    assertTrue(graph.getNeighbors("Mahmoud2").contains(new Vertex("Mahmoud")));
  }

  @Test
  public void nodeNeighborsWeight(){
    Graph graph = new Graph();

    graph.addVertex("Mahmoud");
    graph.addVertex("Mahmoud2");
    graph.addVertex("Mahmoud3");

    graph.addEdge("Mahmoud","Mahmoud2",3);
    graph.addEdge("Mahmoud","Mahmoud3",2);

    assertEquals(2, graph.getNeighbors("Mahmoud").size());
    assertEquals(3, graph.getNeighbors("Mahmoud").get(0).weight);
    assertEquals(2, graph.getNeighbors("Mahmoud").get(1).weight);
//    assertTrue(graph.getNeighbors("Mahmoud2").contains(new Vertex("Mahmoud")));
  }

  @Test
  public void emptyGraph(){
    Graph graph = new Graph();

    assertNull(graph.getNeighbors("Mahmoud"));
  }

  @Test
  public void oneNodeOneEdge(){
    Graph graph = new Graph();
    graph.addVertex("Mahmoud");
    graph.addEdge("Mahmoud","Mahmoud");

    System.out.println(graph.getNeighbors("Mahmoud"));

    assertEquals(2, graph.getNeighbors("Mahmoud").size());
    assertTrue( graph.getNeighbors("Mahmoud").contains(new Vertex("Mahmoud")));
    assertEquals(1, graph.getVertices().size());

  }

  @Test
  public void graphBreadthFirst(){
    Graph graph = new Graph();
    graph.addVertex("Pandora");
    graph.addVertex("Arendelle");
    graph.addVertex("Metroville");
    graph.addVertex("Monstroplolis");
    graph.addVertex("Narnia");
    graph.addVertex("Naboo");

    graph.addEdge("Pandora","Arendelle");
    graph.addEdge("Arendelle","Metroville");
    graph.addEdge("Arendelle","Monstroplolis");
    graph.addEdge("Metroville","Narnia");
    graph.addEdge("Metroville","Naboo");
    graph.addEdge("Monstroplolis","Metroville");
    graph.addEdge("Monstroplolis","Naboo");
    graph.addEdge("Naboo","Narnia");

    List<String> bf = graph.breadthTraverse("Pandora");

    System.out.println(bf);
    assertEquals("Pandora",bf.get(0));
    assertEquals("Arendelle",bf.get(1));
    assertEquals("Metroville",bf.get(2));
    assertEquals("Monstroplolis",bf.get(3));
    assertEquals("Narnia",bf.get(4));
    assertEquals("Naboo",bf.get(5));
  }

  @Test
  public void testBusinessTrip(){
    App app = new App();
    Graph citiesGraph = new Graph();
    citiesGraph.addVertex("Pandora");
    citiesGraph.addVertex("Arendelle");
    citiesGraph.addVertex("Metroville");
    citiesGraph.addVertex("Monstroplolis");
    citiesGraph.addVertex("Narnia");
    citiesGraph.addVertex("Naboo");

    citiesGraph.addEdge("Pandora","Arendelle",150);
    citiesGraph.addEdge("Arendelle","Metroville",99);
    citiesGraph.addEdge("Arendelle","Monstroplolis",42);
    citiesGraph.addEdge("Metroville","Narnia", 37);
    citiesGraph.addEdge("Metroville","Pandora", 82);
    citiesGraph.addEdge("Metroville","Naboo", 26);
    citiesGraph.addEdge("Monstroplolis","Metroville", 105);
    citiesGraph.addEdge("Monstroplolis","Naboo", 73);
    citiesGraph.addEdge("Naboo","Narnia", 250);

    List<String> citiesArr = new ArrayList<>();
    citiesArr.add("Metroville");
    citiesArr.add("Pandora");

    List<String> citiesArr2 = new ArrayList<>();
    citiesArr2.add("Arendelle");
    citiesArr2.add("Monstroplolis");
    citiesArr2.add("Naboo");


    List<String> citiesArr3 = new ArrayList<>();
    citiesArr3.add("Naboo");
    citiesArr3.add("Pandora");

    List<String> citiesArr4 = new ArrayList<>();

    assertEquals(82, app.businessTrip(citiesGraph, citiesArr));
    assertEquals(115, app.businessTrip(citiesGraph, citiesArr2));
    assertEquals(0, app.businessTrip(citiesGraph, citiesArr3));
    assertEquals(0, app.businessTrip(citiesGraph, citiesArr4));
  }
}
