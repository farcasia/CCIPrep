public class MainClass {
  public static void main(String args[]){
    FindRoute<Integer> fRoute = new FindRoute<Integer>();
    Node<Integer> node0 = new Node<Integer>(0);
    Node<Integer> node1 = new Node<Integer>(1);
    Node<Integer> node2 = new Node<Integer>(2);
    Node<Integer> node3 = new Node<Integer>(3);
    Node<Integer> node4 = new Node<Integer>(4);

    node0.adjacent.add(node1);
    node1.adjacent.add(node2);
    node2.adjacent.add(node3);
    node3.adjacent.add(node4);
    
    Graph<Integer> graph = new Graph<Integer>(node0);
    graph.nodes.add(node0);
    graph.nodes.add(node1);
    graph.nodes.add(node2);
    graph.nodes.add(node3);
    graph.nodes.add(node4);

    System.out.println(fRoute.existsRoute(graph, node4, node0));
  }
}
