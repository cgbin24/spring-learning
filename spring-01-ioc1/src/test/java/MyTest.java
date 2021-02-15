import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.cgbin.dao.UserDaoImpl;
import xyz.cgbin.dao.UserDaoMySQLImpl;
import xyz.cgbin.dao.UserDaoOracleImpl;
import xyz.cgbin.dao.UserDaoSQLSeverImpl;
import xyz.cgbin.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        // 1、常规操作
        // 用户实际调用的是业务层，dao层不需要接触
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoSQLSeverImpl());
//        userService.getUser();

        // 2、使用spring代理之后
        // 获取ApplicationContext 拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 需要什么，直接get获取即可
        UserServiceImpl sqlServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        sqlServiceImpl.getUser();
    }
}
