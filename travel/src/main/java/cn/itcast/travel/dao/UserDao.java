package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {
    /**
     * 根据用户名查询用户对象
     * @param username
     * @return
     */
    User findByUserName(String username);

    /**
     * 保存用户
     * @param user
     */
    void save(User user);
}
