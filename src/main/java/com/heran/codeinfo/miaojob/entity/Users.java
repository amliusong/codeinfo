package com.heran.codeinfo.miaojob.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 用户成员表（个人用户、企业用户、猎头用户）
 * </p>
 *
 * @author liusong
 * @since 2018-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mj_users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    /**
     * 名称
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String moblie;

    /**
     * 注册IP
     */
    private String regIp;

    /**
     * 注册时间
     */
    private Integer regDate;

    /**
     * 登录IP
     */
    private String loginIp;

    /**
     * 登录时间
     */
    private Integer loginDate;

    /**
     * 用户类型：个人/公司/其他
     */
    private Integer usertype;

    /**
     * 详细地址
     */
    private String address;

    /**
     * qqid
     */
    private String qqid;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 邮箱状态
     */
    private Integer emailStatus;

    /**
     * 微信id
     */
    private String wxid;

    /**
     * 微信openid
     */
    private String wxopenid;

    /**
     * 微信昵称
     */
    private String wxname;

    /**
     * 微信绑定时间
     */
    private Integer wxbindtime;

    /**
     * 微信头像
     */
    @TableField("avatarUrl")
    private String avatarUrl;

    /**
     * 城市
     */
    private String city;

    /**
     * 省
     */
    private String province;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 生日
     */
    private Integer birthday;

    /**
     * 最高学历
     */
    private String hightRecord;

    /**
     * 工作年限
     */
    private Integer workSeniority;

    /**
     * 用户来源
     */
    private String source;

    /**
     * 简历信息
     */
    private Integer resId;


}
