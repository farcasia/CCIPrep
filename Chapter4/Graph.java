import java.util.*;

public class Graph<T> {
  public Node<T> root;
  public List<Node<T>> nodes;

  public Graph(Node<T> root) {
    this.root = root;
    this.nodes = new ArrayList<Node<T>>();
  }

  // For the special case, when the graph is a binary tree
  public void inOrder(Node<T> node) {
    if (node == null) {
      return;
    }
    if (node.adjacent.size() > 0) {
      inOrder(node.adjacent.get(0));
    }
    System.out.println(node.data);
    if (node.adjacent.size() > 1) {
      inOrder(node.adjacent.get(1));
    }
  }
}
