import com.zc.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * @ClassName EnumSingletonTest
 * @Author 周聪
 * @Date 2020/9/8 18:56
 * @Version 1.0
 * @Description
 */
public class EnumSingletonTest {

    public static void main(String[] args) {

//        序列化
 /*       FileOutputStream fso = null;
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setData(new Object());

        try {
            fso = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fso);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(s1.getData());
            System.out.println(s2.getData());
            System.out.println(s1.getData() == s2.getData());


        } catch (Exception e) {
            e.printStackTrace();
        }*/

//        反射
        try {
            Class<EnumSingleton> clazz = EnumSingleton.class;
            Constructor<EnumSingleton> constructor = clazz.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            EnumSingleton instance = constructor.newInstance("zhou", 666);
            System.out.println(instance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
