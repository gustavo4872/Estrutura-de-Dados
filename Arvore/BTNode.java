import javax.swing.text.Position;

public class BTNode implements Position{

	private Object element;
	private BTNode left, right, parent;
	
	public BTNode() {
	}
	
	public BTNode(Object o, BTNode u, BTNode v, BTNode w) {
		setElement(o);
		setParent(u);
		setLeft(v);
		setRight(w);
	}
	
	public Object element() {
		return element;
	}
	
	public void setElement(Object o) {
		element = o;
	}
	
	public BTNode getLeft() {
		return left;
	}
	
	void setLeft(BTNode v) {
		left = v;
	}
	
	BTNode getRight() {
		return right;
	}
	
	void setRight(BTNode v) {
		right = v;
	}
	
	BTNode getParent() {
		return parent;
	}
	
	void setParent(BTNode v) {
		parent = v;
	}

	@Override
	public int getOffset() {
		// TODO Auto-generated method stub
		return 0;
	}
}
