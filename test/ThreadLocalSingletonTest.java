import com.zc.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @ClassName ThreadLocalSingletonTest
 * @Author 周聪
 * @Date 2020/9/8 21:10
 * @Version 1.0
 * @Description
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExectorTread());
        t1.start();
        Thread t2 = new Thread(new ExectorTread());
        t2.start();
    }
}
