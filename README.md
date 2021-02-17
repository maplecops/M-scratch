# scratch
> 从SpringBoot原有工程，一步一步的增加组建，丰富整个功能耐用性，生成快速上手脚手架工程

SpringBoot脚手架工程，默认每一个分支名称为当前分支引用的组建名称，每次引入一个组建模型

SpringBoot版本使用如下版本
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.4.2</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>
```

## 1.0 - Mybatis
```xml
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>2.1.4</version>
</dependency>
```
Mybatis作为一款被广泛推荐的实体-数据库映射关系管理的组建，支持动态SQL、SQL语句与业务逻辑分离等多种优点，所以我们的scratch工程也使用这个组建进行
数据库和表关系的映射管理。其中需要主要的是，Mybatis是一款持久层框架，**不是数据库连接工具，更不是工程的连接池，** 对于SpringBoot2.X版本来说，
如果不显示的指定数据库连接池组建的话，默认使用的是`Hikari`作为默认的数据库连接池组建。

SpringBoot使用Mybatis比较容易，可以简单的分成以下几个步骤：

1. 引入`mybatis-spring-boot-starter`依赖
2. 在`application.yml`文件中指定Mybatis的两个属性，分别为java持久层Bean-class的包位置和xml格式的mapper文件的文件位置
```yaml
mybatis:
  type-aliases-package: com.maple.springtest.demo.entity
  mapper-locations: classpath:mapper/*Mapper.xml
```
3. 在`MainApplication`文件中指定Mapper组建(接口文件)需要扫描的包文件
```java
@SpringBootApplication
@MapperScan(value = "com.maple.springtest.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
```
完成以三步的配置后，就可以很方便的通过`mybatis-spring-boot-starter`在SpringBoot工程中使用Mybatis组建。