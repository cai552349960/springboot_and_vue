package cn.caichunlin.springboot_and_vue.dao;

import cn.caichunlin.springboot_and_vue.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
    @Query(value = "update user set username=#{username},password=#{password},email=#{email},age=#{age},sex=#{sex} where id = #{id}",nativeQuery = true)
    public void updateById(User user);
}
