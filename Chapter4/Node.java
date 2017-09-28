import java.util.*;

enum State {Visited, NotVisited};

public class Node<T> {
  public T data;
  public State state;
  public List<Node<T>> adjacent;

  public Node(T data) {
    this.data = data;
    this.state = State.NotVisited;
    this.adjacent = new ArrayList<Node<T>>();
  }
}
