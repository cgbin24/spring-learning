import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.cgbin.pojo.Student;
import xyz.cgbin.pojo.User;

public class MyTest {
    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
         Student student = (Student) context.getBean("student");
//        System.out.println(student.getName());
        System.out.println(student.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
//        User user = (User) context.getBean("user");
        User user = context.getBean("user1",User.class);
//        System.out.println(user.getName());
        System.out.println(user);
    }

}
