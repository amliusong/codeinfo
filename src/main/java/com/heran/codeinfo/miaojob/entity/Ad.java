package com.heran.codeinfo.miaojob.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 广告信息表
 * </p>
 *
 * @author liusong
 * @since 2018-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mj_ad")
public class Ad implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String adName;

    private String did;

    private String timeStart;

    private String timeEnd;

    private String adType;

    private String wordInfo;

    private String wordUrl;

    private String picUrl;

    private String picSrc;

    private String picContent;

    private String picWidth;

    private String picHeight;

    private String flashUrl;

    private String flashSrc;

    private String flashWidth;

    private String flashHeight;

    private Integer classId;

    private Integer isCheck;

    private Integer isOpen;

    private Integer target;

    private Integer hits;

    private String remark;

    private Integer sort;

    private String lianmengUrl;


}
