package com.heran.codeinfo.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heran.codeinfo.system.entity.Dept;
import com.heran.codeinfo.system.mapper.DeptMapper;
import com.heran.codeinfo.system.service.IDeptService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 部门管理 服务实现类
 * </p>
 *
 * @author liusong
 * @since 2018-10-09
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<Dept> selectByMap(@Param(Constants.COLUMN_MAP) Map<String, Object> columnMap){
        return deptMapper.selectByMap(columnMap);
    }

    @Override
    public boolean deleteAll() {
        return retBool(deptMapper.deleteAll());
    }

    @Override
    public List<Dept> selectListBySQL() {
        return deptMapper.selectListBySQL();
    }

    @Override
    public List<Dept> selectListByWrapper(Wrapper wrapper) {
        return baseMapper.selectListByWrapper(wrapper);
    }
}
