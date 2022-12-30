package nodepkg;

public class NodeD<T> {

	private T data;
	private NodeD prev , next;
	
	public NodeD(T data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public NodeD getPrev() {
		return prev;
	}

	public void setPrev(NodeD prev) {
		this.prev = prev;
	}

	public NodeD getNext() {
		return next;
	}

	public void setNext(NodeD next) {
		this.next = next;
	}
	
	
}
