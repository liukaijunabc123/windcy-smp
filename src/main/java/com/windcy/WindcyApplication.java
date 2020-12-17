package com.windcy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liukj
 * @date 2020/12/16 14:01
 * @package com.windcy
 * @description
 */
@SpringBootApplication
/**
 * @MapperScan的作用：扫描项目mapper对应的接口，也就是DAO
 */
@MapperScan(basePackages = {"com.windcy.dao","com.example.mapper"})
public class WindcyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WindcyApplication.class,args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    " + WindcyApplication.class.getSimpleName() + "启动成功      ヾ(◍°∇°◍)ﾉﾞ");
    }
}
