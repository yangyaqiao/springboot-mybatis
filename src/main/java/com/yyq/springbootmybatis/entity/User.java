package com.yyq.springbootmybatis.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import static com.baomidou.mybatisplus.annotation.IdType.ASSIGN_UUID;

/**
 * @author yyq
 * @date 2020/11/4
 */
@Data
@TableName(value = "sys_user")
public class User {

    @TableId(value = "ID",type = ASSIGN_UUID)
    private String id;

    @TableField(value = "USERNAME")
    private String userName;

    @TableField(value = "PHONE")
    private String phone;
}
