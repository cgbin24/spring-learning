package xyz.cgbin.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

public class People {
    // 如果显示的定义了Autowired的required属性为false，说明这个对象的值可以为空，否则不能为null
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog")
    private Dog dog;

//    @Resource
//    private Dog dog;

    private String name;

    // @Nullable 标记过的值可以为空
//    public People(@Nullable String name) {
//        this.name = name;
//    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
