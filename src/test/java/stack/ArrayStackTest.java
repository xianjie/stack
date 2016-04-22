package stack;

import org.junit.Test;

/**
 * @Title: ArrayStackTest
 * @Description:
 * @author: xian jie
 * @date: 2016/2/19 11:54
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class ArrayStackTest {


    @Test
    public void test() {
        ArrayStack stack = new ArrayStack();
        System.out.println(stack.getSize());
        System.out.println(stack.isEmpty());
        try {
            stack.push(8);
            stack.push(3);
            stack.push(4);
            stack.push(7);
            stack.push(1);
            stack.push(8);
            stack.push(3);
            stack.push(4);
            stack.push(7);
            stack.push(1);
            System.out.println(stack.getSize());
            System.out.println(stack.top());
            System.out.println(stack.getAllElements());

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.getAllElements());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
