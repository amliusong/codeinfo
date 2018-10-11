package com.heran.codeinfo.system.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.service.IService;
import com.heran.codeinfo.system.entity.Dept;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 部门管理 服务类
 * </p>
 *
 * @author liusong
 * @since 2018-10-09
 */
public interface IDeptService extends IService<Dept> {

    /**
     * <p>
     * 查询（根据 columnMap 条件）
     * </p>
     *
     * @param columnMap 表字段 map 对象
     * @return 实体集合
     */
    List<Dept> selectByMap(Map<String, Object> columnMap);


    boolean deleteAll();

    public List<Dept> selectListBySQL();

    public List<Dept> selectListByWrapper(Wrapper wrapper);
}
