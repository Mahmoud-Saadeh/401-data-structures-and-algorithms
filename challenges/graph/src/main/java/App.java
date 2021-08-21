import graph.Graph;

public class App {
  public static void main(String[] args) {
    Graph graph = new Graph();

    graph.addVertex("Mahmoud");
    graph.addVertex("Malek");
    graph.addVertex("Mohammad");
    graph.addVertex("Yazan");

    graph.addEdge("Mahmoud", "Yazan", 3);
    graph.addEdge("Mahmoud", "Mohammad", 4);
    graph.addEdge("Mohammad", "Malek");

    System.out.println(graph.printGraph());
    System.out.println();

//    graph.removeVertex("Mohammad");
//    graph.removeEdge("Mohammad", "Yazan");

    System.out.println(graph.printGraph());
    System.out.println(graph.size());
    System.out.println(graph.getNeighbors("Malek"));
    System.out.println();
    System.out.println(graph.depthFirstTraverse("Mahmoud"));
    System.out.println(graph.breadthTraverse("Mahmoud"));

  }
}
