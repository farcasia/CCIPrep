public class MyQueueWithStacks<T> {
  private MyStack<T> addStack = new MyStack<T>();
  private MyStack<T> remStack = new MyStack<T>();

  public MyQueueWithStacks() {
  }

  public boolean isEmpty() {
    return addStack.isEmpty() && remStack.isEmpty();
  }

  public void add(T item) {
    if (addStack.isEmpty()) {
      moveFromTo(remStack, addStack);
    }

    addStack.push(item);
  }

  public T get() throws MyQueue.EmptyQueueException {
    if (remStack.isEmpty()) {
      moveFromTo(addStack, remStack);
    }

    try{
      return remStack.pop();
    } catch(MyStack.EmptyStackException exp){
      throw new MyQueue.EmptyQueueException();
    }
  }

  public T peek() throws MyQueue.EmptyQueueException {
    if (remStack.isEmpty()) {
      moveFromTo(addStack, remStack);
    }

    try{
      return remStack.peek();
    } catch(MyStack.EmptyStackException exp) {
      throw new MyQueue.EmptyQueueException();
    }
  }

  public void moveFromTo(MyStack<T> from, MyStack<T> to) {
    while (true) {
      try {
        T item = from.pop();
        to.push(item);
      } catch (MyStack.EmptyStackException stackException) {
        break;
      }
    }
  }
}
