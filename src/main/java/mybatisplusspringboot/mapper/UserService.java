package mybatisplusspringboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import mybatisplusspringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Package: mybatisplusspringboot.mapper
 * @User: Administrator
 * @DataTime: 2019/6/17 9:32
 * @Author: aiyls
 * @Description:
 */
@Mapper
public interface UserService extends BaseMapper<User> {

    @Select("select * from user where status=1 and username=#{userName}")
    public User findByName(String userName);
}
