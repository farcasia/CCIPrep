import java.util.*;

public class FindRoute<T> {
  public boolean existsRoute(Graph<T> graph, Node<T> node1, Node<T> node2) {
    if (node1 == node2) {
      return true;
    }

    for (Node<T> node : graph.nodes) {
      node.state = State.NotVisited;
    }

    return searchFromFor(graph, node1, node2) || searchFromFor(graph, node2, node1);
  }

  public boolean searchFromFor(Graph<T> graph, Node<T> node1, Node<T> node2) {
    Queue<Node<T>> q = new LinkedList<Node<T>>();
    node1.state = State.Visited;
    q.add(node1);

    while (!q.isEmpty()) {
      Node<T> node = q.poll();
      for (Node<T> adj : node.adjacent) {
        if (adj == node2) {
          return true;
        }

        if (adj.state == State.NotVisited) {
          adj.state = State.Visited;
          q.add(adj);
        }
      }
    }

    return false;
  }
}
