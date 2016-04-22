package stack;

/**
 * @Title: Node
 * @Description:
 * @author: xian jie
 * @date: 2016/2/19 13:52
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class Node {

    //Declared element
    private Object element;
    //Declared next node
    private Node next;

    //Constructor of Class Node
    public Node() {
        this(null, null);
    }

    public Node(Object newElement, Node newNext) {
        element = newElement;
        next = newNext;
    }

    //Get element function
    public Object getElement() {
        return element;
    }

    //Set element function
    public void setElement(Object newElement) {
        element = newElement;
    }

    //Get next node function
    public Node getNext() {
        return next;
    }

    //Set next node function
    public void setNext(Node newNext) {
        next = newNext;
    }
}
