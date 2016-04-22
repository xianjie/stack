package stack;

import java.util.Arrays;

/**
 * @Title: ArrayStack
 * @Description:
 * @author: xian jie
 * @date: 2016/2/19 11:43
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class ArrayStack {

    /**
     * 基于数组的栈
     */

    // 栈最大容量
    private static final int CAPACITY = 1024;

    // 栈容量
    private static int capacity;

    // 栈 初始化索引 top = -1 意味着栈为空
    private static int top = -1;

    // 栈元素存储的数组
    Object[] array;

    // 初始化栈的容量
    public ArrayStack() {
        this.capacity = CAPACITY;
        array = new Object[capacity];
    }

    // 获取栈大小
    public int getSize() {
        if (isEmpty()) {
            return 0;
        } else {
            return top + 1;
        }
    }

    // 获取栈是否为空
    public boolean isEmpty() {
        return (top < 0);
    }

    // 获取栈的顶部元素
    // 跟下面出栈一样 只不过出栈删除了当前元素
    public Object top() throws Exception {

        if (isEmpty()) {
            throw new Exception("栈为空");
        }
        return array[top];

    }

    // 进栈
    public void push(Object element) throws Exception {
        if (getSize() == CAPACITY) {
            throw new Exception("栈已满");
        }
        array[++top] = element;
    }

    // 出栈
    public Object pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("栈为空");
        }
        return array[top--];
    }

    // 获取栈全部元素
    public Object getAllElements() throws Exception {
        Object[] arr = new Object[top + 1];
        if (!isEmpty()) {
            for (int i = 0; i < getSize(); i++) {
                arr[i] = array[i];
            }
        }
        return Arrays.toString(arr);
    }
}
