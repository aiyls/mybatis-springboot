package mybatisplusspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "aiyls.mapper")
@SpringBootApplication
public class AiylsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiylsApplication.class, args);
    }

}
