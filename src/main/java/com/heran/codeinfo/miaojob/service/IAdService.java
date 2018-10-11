package com.heran.codeinfo.miaojob.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.service.IService;
import com.heran.codeinfo.miaojob.entity.Ad;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

/**
 * <p>
 * 广告信息表 服务类
 * </p>
 *
 * @author liusong
 * @since 2018-10-09
 */
public interface IAdService extends IService<Ad> {

    /**
     * <p>
     * 查询（根据 columnMap 条件）
     * </p>
     *
     * @param columnMap 表字段 map 对象
     * @return 实体集合
     */
    List<Ad> selectByMap(@Param(Constants.COLUMN_MAP) Map<String, Object> columnMap);

    @Override
    List<Object> listObjs(Wrapper<Ad> queryWrapper);
}
