package cn.caichunlin.springboot_and_vue.service;

import cn.caichunlin.springboot_and_vue.dao.UserDao;
import cn.caichunlin.springboot_and_vue.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public List<User> findAll();

    public User findById(Integer id);

    public void updateById(User user);
}
