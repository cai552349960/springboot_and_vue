package cn.caichunlin.springboot_and_vue.contoller;

import cn.caichunlin.springboot_and_vue.domain.User;
import cn.caichunlin.springboot_and_vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/findOne")
    public User findOne(Integer id) {
        return userService.findById(id);
    }

    @RequestMapping("/updateById")
    public void UpdateById(User user) {
        User userByfind = findOne(user.getId());
        userService.updateById(user);
    }
}
