package com.yyq.springbootmybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyq.springbootmybatis.entity.User;

import java.util.List;

/**
 * @author yyq
 * @date 2020/11/4
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> list();
}
