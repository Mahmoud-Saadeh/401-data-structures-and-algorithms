import graph.Graph;
import graph.Vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class App {
  private Integer totalCost = 0;

  public static void main(String[] args) {
//    Graph graph = new Graph();
//
//    graph.addVertex("Mahmoud");
//    graph.addVertex("Malek");
//    graph.addVertex("Mohammad");
//    graph.addVertex("Yazan");
//
//    graph.addEdge("Mahmoud", "Yazan", 3);
//    graph.addEdge("Mahmoud", "Mohammad", 4);
//    graph.addEdge("Mohammad", "Malek");
//
//    System.out.println(graph.printGraph());
//    System.out.println();
//
////    graph.removeVertex("Mohammad");
////    graph.removeEdge("Mohammad", "Yazan");
//
//    System.out.println(graph.printGraph());
//    System.out.println(graph.size());
//    System.out.println(graph.getNeighbors("Malek"));
//    System.out.println();
//    System.out.println(graph.depthFirstTraverse("Mahmoud"));
//    System.out.println(graph.breadthTraverse("Mahmoud"));

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

    System.out.println(app.businessTrip(citiesGraph, citiesArr));

    List<String> citiesArr2 = new ArrayList<>();
    citiesArr2.add("Arendelle");
    citiesArr2.add("Monstroplolis");
    citiesArr2.add("Naboo");

    System.out.println(app.businessTrip(citiesGraph, citiesArr2));

    List<String> citiesArr3 = new ArrayList<>();
    citiesArr3.add("Naboo");
    citiesArr3.add("Pandora");

    System.out.println(app.businessTrip(citiesGraph, citiesArr3));

  }

  public Integer businessTrip(Graph graph, List<String> cities){
    totalCost = 0;
    int citiesSize = cities.size();

    for (int i = 0; i < citiesSize; i ++){
      if (i + 1 >= citiesSize){
        break;
      }
      helperTrip(cities.get(i), cities.get(i + 1), graph);
    }

    return totalCost;
  }

  private void helperTrip(String city1, String city2, Graph graph){
    if (graph.getNeighbors(city1) == null){
      return;
    }
    for (Vertex vertex: graph.getNeighbors(city1)) {
      if (Objects.equals(city2, vertex.label)){
        totalCost += vertex.weight;
        break;
      }
    }
  }


}
