package stack;

import java.util.Arrays;

/**
 * @Title: ListStack
 * @Description:
 * @author: xian jie
 * @date: 2016/2/19 13:50
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class ListStack {
    /**
     * 基于链表的栈
     */

    // 栈初始化大小
    private static int size;
    // 栈元素
    private static Node top;

    public ListStack() {
        this.size = 0;
        this.top = null;
    }

    // 获取栈元素数量
    public int getSize() {
        if (isEmpty())
            return 0;
        else
            return size;
    }

    // 栈是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 获取栈顶部元素
    // 跟下面出栈一样 只不过出栈删除了当前元素
    public Object top() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty!");
        return top.getElement();
    }

    // 进栈
    public void push(Object element) {
        Node newNode = new Node(element, top);
        top = newNode;
        size++;
    }

    // 出栈
    public Object pop() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty!");
        Object container = top.getElement();
        top = top.getNext();
        size--;
        return container;
    }

    // 获取栈全部元素
    public void getAllElements() throws Exception {
        Node travelTop;
        travelTop = top;
        Object[] array = new Object[getSize()];

        for (int i = 0; i < array.length; i++) {
            array[i] = travelTop.getElement();
            travelTop = travelTop.getNext();
        }
        System.out.println("Get all element: " + Arrays.toString(array));
    }
}
