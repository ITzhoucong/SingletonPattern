import com.zc.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @author: ZhouCong
 * @date: Create in 2020/7/16 23:15
 * @description:
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {

        try {
//          调用者装B，不走寻常路，显然搞坏了单例
            Class<LazyInnerClassSingleton> clazz = LazyInnerClassSingleton.class;
            Constructor<LazyInnerClassSingleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            LazyInnerClassSingleton instance = constructor.newInstance();
            System.out.println(instance);
//          正常调用
            LazyInnerClassSingleton instance2 = LazyInnerClassSingleton.getInstance();
            System.out.println(instance2);
            System.out.println(instance == instance2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
