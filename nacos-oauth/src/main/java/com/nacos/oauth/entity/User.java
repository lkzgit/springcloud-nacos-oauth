package com.nacos.oauth.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lkz
 * @since 2020-07-20
 */
@Data
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Integer id;

    @TableField("PASS_WORD")
    private String passWord;

    @TableField("USER_NAME")
    private String userName;

    @TableField("ROLE")
    private String role;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
