## 常用依赖
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.3.2</version>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```
## 注解说明：
- @Autowired ：自动装配通过类型，名字
如果@Autowired不能唯一装配上属性，则需要搭配@Qulifier(value="xxx")
- @Nullable ：字段标记了这个注解，则表示该字段可以为空null
- @Resource ：自动装配通过名字，类型