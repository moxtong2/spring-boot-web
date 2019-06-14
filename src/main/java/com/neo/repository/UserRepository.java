package com.neo.repository;

import com.neo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 自主定义接口实现了spring-data-commons中的JpaRepository接口<实体类，ID>
 *    ID在我理解就是唯一标识吧
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * findBy是关键字，是规则定死的必须要这么写，
     * 后面紧跟的是表名与属性名称使用驼峰命名法
     * @param userName
     * @return
     */
    User findByUserName(String userName);

    /**
     * findBy是关键字，其中属性与属性的中间Or是关键字
     * 也就是说它会按照这个or去拼接要查询的属性关系是或还是且
     * @param username
     * @param email
     * @return
     */
    User findByUserNameOrEmail(String username, String email);
    
}