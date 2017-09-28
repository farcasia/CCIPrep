import java.util.*;

public class MinimalBST<T> {
  // inclusive start, exclusive end;
  public Node<T> computeMinimalBST(T sorted[], int iStart, int iEnd) {
    int middle = (iEnd - iStart) / 2;
    Node<T> node =  new Node<T>(sorted[iStart + middle]);
    if ((iEnd - iStart) <= 1) {
      return node;
    }
    node.adjacent.add(computeMinimalBST(sorted, iStart, iStart + middle));
    if ((iEnd - iStart) > 2) {
      node.adjacent.add(computeMinimalBST(sorted, iStart + middle + 1, iEnd));
    }

    return node;
  }

  public static void main(String args[]) {
    MinimalBST<Integer> minimalBST = new MinimalBST<Integer>();
    Integer[] sorted = new Integer[7];
    sorted[0] = 1;
    sorted[1] = 2;
    sorted[2] = 3;
    sorted[3] = 4;
    sorted[4] = 5;
    sorted[5] = 6;
    sorted[6] = 7;

    Node<Integer> bstRoot = minimalBST.computeMinimalBST(sorted, 0, 7);
    Graph<Integer> bst = new Graph<Integer>(bstRoot);
    bst.inOrder(bst.root);
  }
}
