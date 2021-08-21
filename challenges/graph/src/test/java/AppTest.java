import graph.Graph;
import graph.Vertex;
import org.junit.jupiter.api.Test;

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
}
