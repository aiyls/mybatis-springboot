package mybatisplusspringboot.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Package: mybatisplusspringboot.entity
 * @User: Administrator
 * @DataTime: 2019/6/17 9:29
 * @Author: aiyls
 * @Description:
 */
@Data
@TableName(value = "user")
public class User {

    @TableId
    private Integer id;

    private String userName;

    private String password;

    private Integer age;

    private String address;

    @TableLogic
    private boolean status;
}
