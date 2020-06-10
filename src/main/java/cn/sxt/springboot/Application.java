package cn.sxt.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * 程序入门启动类
 *
 * SpringAppliction->SpringBoot框架的核心启动类型
 *
 * @SpringBootApplication->SpringBoot总配置注解
 * 包含三个注解
 *  @SpringBootConfiguration 声明当前是一个配置类/注解
 *  类似于SpringFramework的全注解配置 @Configuration
 *
 *  @EnableAutoConfiguration
 *  读取SpringBoot框架集成各种组件全注解配置文件
 *  SpringBoot和其他集成配置核心包
 *   org.springframework.boot:spring-boot-autoconfigure:2.3.0.RELEASE
 *   下面所有的集成配置文件全部读取进来
 *   各种其他框架的配置文件规则
 *      XxxAutoConfiguration
 *     如：SpringMVC的配置文件
 *      WebMVCAutoConfiguration
 *      数据源配置：
 *          DataSourceAutoConfiguration
 *   框架集成需要读取各种配置参数，所有参数的配置文件规则
 *     XXXProperties
 *     如：SpringMVC的配置参数类
 *          WebMVCProperties
 *       数据源配置参数属性类
 *          DataSourceProperties
 *   @ComponentScan
 *    包扫描注解
 *    SpringBoot默认扫描当前入口文件包以及子包作为spring注解配置包位置
 *
 *
 *
* */




@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}



