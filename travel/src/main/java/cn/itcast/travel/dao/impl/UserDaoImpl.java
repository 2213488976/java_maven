package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 根据用户名查询用户对象
     * @param username
     * @return
     */
    public User findByUserName(String username) {
        //1.定义sql
        String sql = "select * from tab_user where username = ?";
        //2.执行sql语句
        User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username);
        return user;
    }

    /**
     * 保存用户
     * @param user
     */
    @Override
    public void save(User user) {

    }
}
