package punto_5;

public class SinglyLinkedList<E> {
	// ---------------- nested Node class ----------------
	private static class Node<E> {
		private E element; // reference to the element stored at this node
		private Node<E> next; // reference to the subsequent node in the list

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
	}

	// ----------- end of nested Node class -----------
	private Node<E> head = null; // head node of the list (or null if empty)
	private Node<E> tail = null; // last node of the list (or null if empty)
	private int size = 0; // number of nodes in the list

	public SinglyLinkedList() {
	}

	// access methods
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		if (isEmpty())
			return null;
		return head.getElement();
	}

	public E last() {
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// update methods
	public void addFirst(E e) {
		head = new Node<>(e, head);
		if (size == 0)
			tail = head;
		size++;
	}

	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		if (isEmpty())
			head = newest;
		else
			tail.setNext(newest);
		tail = newest;
		size++;
	}

	public E removeFirst() {
		if (isEmpty())
			return null;
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null;
		return answer;
	}

	@Override
	public String toString() {
		StringBuilder out = new StringBuilder();
		Node<E> current = head;
		while (current != null) {
			out.append("->").append(current.getElement());
			current = current.getNext();
		}
		return out.toString();
	}

	public void addPos(E e, int n) throws IndexOutOfBoundsException {
		if (n < 0 || n > size)
			throw new IndexOutOfBoundsException("Posición inválida");
		if (n == 0) {
			addFirst(e);
		} else if (n == size) {
			addLast(e);
		} else {
			Node<E> current = head;
			for (int i = 0; i < n - 1; i++) {
				current = current.getNext();
			}
			Node<E> newNode = new Node<>(e, current.getNext());
			current.setNext(newNode);
			size++;
		}
	}

	public E removeElement(E e) {
		if (isEmpty()) return null;
		if (head.getElement().equals(e)) {
			return removeFirst();
		}

		Node<E> current = head;
		while (current.getNext() != null && !current.getNext().getElement().equals(e)) {
			current = current.getNext();
		}

		if (current.getNext() == null) return null;

		E removed = current.getNext().getElement();
		current.setNext(current.getNext().getNext());
		size--;
		if (current.getNext() == null) tail = current;
		return removed;
	}

	public E removePos(int n) throws IndexOutOfBoundsException {
		if (n < 0 || n >= size)
			throw new IndexOutOfBoundsException("Posición inválida");
		if (n == 0) return removeFirst();

		Node<E> current = head;
		for (int i = 0; i < n - 1; i++) {
			current = current.getNext();
		}

		E removed = current.getNext().getElement();
		current.setNext(current.getNext().getNext());
		size--;
		if (current.getNext() == null) tail = current;
		return removed;
	}

	public void concatenate(SinglyLinkedList<E> l) {
		if (l == null || l.isEmpty()) return;
		Node<E> current = l.head;
		while (current != null) {
			this.addLast(current.getElement());
			current = current.getNext();
		}
	}

	public E search(E e) {
		Node<E> current = head;
		while (current != null) {
			if (current.getElement().equals(e)) {
				return current.getElement();
			}
			current = current.getNext();
		}
		return null;
	}
}
