package cn.pj.cy.config.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@MapperScan注解为接口创建实现类
@MapperScan("com.cy.pj.goods.dao")
public class SpringdaoConfig {
	//整合数据源
   //整合mybatis 

}
