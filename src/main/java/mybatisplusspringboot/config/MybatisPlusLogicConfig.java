package mybatisplusspringboot.config;

import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Package: mybatisplusspringboot.config
 * @User: Administrator
 * @DataTime: 2019/6/17 9:27
 * @Author: aiyls
 * @Description:
 */
@Configuration
public class MybatisPlusLogicConfig {

    //逻辑删除
    @Bean
    public LogicSqlInjector logicSqlInjector(){
        return new LogicSqlInjector();
    }

}
