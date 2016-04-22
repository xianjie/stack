package stack;

import org.junit.Test;

/**
 * @Title: ListStackTest
 * @Description:
 * @author: xian jie
 * @date: 2016/2/19 13:56
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class ListStackTest {

    @Test
    public void test() {
        //Test Class StackList
        ListStack sl = new ListStack();
        System.out.println("Size of stack list: " + sl.getSize());
        System.out.println("Is empty ? : " + sl.isEmpty());

        try {
            sl.push(12);
            sl.push(13);
            sl.push(15);
            sl.push(17);
            sl.push(2);
            sl.push(6);
            sl.getAllElements();
            System.out.println("stack top elements: " + sl.top());
            System.out.println("Size of stack list: " + sl.getSize());
            System.out.println("Is empty ? : " + sl.isEmpty());
            System.out.println(sl.pop());
            System.out.println(sl.pop());
            System.out.println(sl.pop());
            System.out.println(sl.pop());
            System.out.println(sl.pop());
            System.out.println(sl.pop());
            System.out.println("Size of stack list: " + sl.getSize());
            System.out.println("Is empty ? : " + sl.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
