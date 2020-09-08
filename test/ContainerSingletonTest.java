import com.zc.singleton.register.ContainerSingleton;

/**
 * @ClassName ContainerSingletonTest
 * @Author 周聪
 * @Date 2020/9/8 20:46
 * @Version 1.0
 * @Description
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {
        Object bean = ContainerSingleton.getBean("Pojo");
        System.out.println(bean);
    }
}
