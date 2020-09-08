import com.zc.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author: ZhouCong
 * @date: Create in 2020/7/16 22:07
 * @description:
 */
public class ExectorTread implements Runnable {


    @Override
    public void run() {
//        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + ":" + instance);

        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
    }
}
