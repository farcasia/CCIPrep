public class MainClass {
  public static void main (String args[]) {
    MyQueueWithStacks<Integer> q = new MyQueueWithStacks<Integer>();
    q.add(2);
    q.add(4);
    try {
      System.out.println(q.get());
    } catch(MyQueue.EmptyQueueException exp) {
      exp.printStackTrace();
    }
    q.add(5);
    try {
      System.out.println(q.get());
      System.out.println(q.get());
      System.out.println(q.get());
    } catch(MyQueue.EmptyQueueException exp) {
      exp.printStackTrace();
    }
  }
}
