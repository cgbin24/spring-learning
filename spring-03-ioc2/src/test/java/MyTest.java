import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.cgbin.pojo.User;

public class MyTest {
    public static void main(String[] args) {
//        new User();
        // 配置文件加载时，容器中管理的对象就已经初始化了
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user = (User) context.getBean("user");
//        User userT = (User) context.getBean("user");
//        System.out.println(user == userT);
        User user = (User) context.getBean("u4");
        user.show();

    }
}
