package xyz.cgbin.service;

import xyz.cgbin.dao.UserDao;
import xyz.cgbin.dao.UserDaoImpl;
import xyz.cgbin.dao.UserDaoMySQLImpl;

public class UserServiceImpl implements UserService {
//    业务层调dao层
//    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new UserDaoMySQLImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
