/**
 * @author: ZhouCong
 * @date: Create in 2020/7/16 22:06
 * @description:
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExectorTread());
        Thread t2 = new Thread(new ExectorTread());

        t1.start();
        t2.start();

        System.out.println("Exector End");
    }
}
