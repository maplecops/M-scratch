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

## [1.0 - Mybatis](doc/1.0-Mybatis.md)
Mybatis作为目前社区比较成熟的一款Java持久层框架，我们学习并加入使用。
## [2.0 - Validation](doc/2.0-Validation.md)
方法入参的校验是一个很重要的话题，尤其是对于Controller层入参的校验，如果校验逻辑不完善的话，严重的话可能使我们的程序收到重创，如果优雅并且简便
的完成参数的校验，并且统一处理参数校验失败的异常信息，也是我们在开发中需要重点解决的问题。