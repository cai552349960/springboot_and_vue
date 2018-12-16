package cn.caichunlin.springboot_and_vue.service.impl;

import cn.caichunlin.springboot_and_vue.dao.UserDao;
import cn.caichunlin.springboot_and_vue.domain.User;
import cn.caichunlin.springboot_and_vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        Optional<User> byId = userDao.findById(id);
        User user = byId.get();
        return user;
    }

    @Override
    public void updateById(User user) {
        User byId = findById(user.getId());
        if (byId != null) {
            userDao.updateById(byId);
        }
    }
}
