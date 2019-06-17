package mybatisplusspringboot.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Package: mybatisplusspringboot.config
 * @User: Administrator
 * @DataTime: 2019/6/17 9:24
 * @Author: aiyls
 * @Description:
 */
@Configuration
public class MybatisPlusPage {
    //分页
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
