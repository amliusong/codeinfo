package com.heran.codeinfo.system.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heran.codeinfo.system.entity.Dept;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 部门管理 Mapper 接口
 * </p>
 *
 * @author liusong
 * @since 2018-10-09
 */
public interface DeptMapper extends BaseMapper<Dept> {
    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select * from sys_dept")
    List<Dept> selectListBySQL();

    List<Dept> selectListByWrapper(@Param("ew") Wrapper wrapper);

}
