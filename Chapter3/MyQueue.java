public class MyQueue<T> {
	public static class EmptyQueueException extends Exception {
	}

	private static class QueueNode<T> {
		private T data;
		private QueueNode<T> next;

		public QueueNode(T data) {
			this.data = data;
		}
	}

	private QueueNode<T> first;
	private QueueNode<T> last;

	public T remove() throws EmptyQueueException {
		if (first == null) throw new EmptyQueueException();
		T item = first.data;
		first = first.next;
		if (first == null) {
			last = null;
		}
		return item;
	}

	public void add(T item) {
		QueueNode<T> t = new QueueNode<T>(item);
		if (first == null) {
			first = t;
		}
		if (last != null) {
			t.next = last;
		}
		last = t;
	}

	public T peek() throws EmptyQueueException {
		if (first == null) throw new EmptyQueueException();
		return first.data;
	}

	public boolean isEmpty() {
		return first == null;
	}
}
