package mybatisplusspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import mybatisplusspringboot.entity.User;
import mybatisplusspringboot.mapper.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Package: mybatisplusspringboot.controller
 * @User: Administrator
 * @DataTime: 2019/6/17 9:35
 * @Author: aiyls
 * @Description:
 */
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PutMapping
    public Boolean addUser(@RequestBody User user){
        return userService.insert(user)== 1?true:false;
    }

    @GetMapping("/userPage")
    public IPage userPage(@RequestParam Long pageIndex,Long pageSize){
        return userService.selectPage(
                new Page().setCurrent(pageIndex).setPages(pageSize),
                new QueryWrapper<User>()
        );
    }

    @GetMapping("/findByNameDefine/{userName}")
    public User findByNameDefine(@PathVariable String userName){
        return userService.selectOne(new QueryWrapper<User>().eq("userName",userName));
    }

    //QueryWrapper 可封装多种查询
    @GetMapping("/findByAddress")
    public User findByAddress(@PathVariable String address){
        return userService.selectOne(new QueryWrapper<User>().eq("address",address));
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteById(@PathVariable Integer id){
        return userService.deleteById(id)==1?true:false;

    }
}
