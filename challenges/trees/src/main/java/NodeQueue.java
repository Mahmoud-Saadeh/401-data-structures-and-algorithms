public class NodeQueue {
  public Node value;
  public NodeQueue next;

  public NodeQueue(Node value) {
    this.value = value;
  }

  public NodeQueue getNext() {
    return next;
  }

  public void setNext(NodeQueue node) {
    next = node;
  }
}
