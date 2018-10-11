package com.heran.codeinfo.system.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.heran.codeinfo.system.entity.Dept;
import com.heran.codeinfo.system.service.IDeptService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 部门管理 前端控制器
 * </p>
 *
 * @author liusong
 * @since 2018-10-09
 */
@RestController
@RequestMapping("/system/dept")
public class DeptController {


    @Autowired
    private IDeptService deptService;

    @GetMapping("/test")
    public IPage<Dept> test() {
        return deptService.page(new Page<Dept>(0, 12), null);
    }

    /**
     * 插入 OR 修改
     * http://localhost:8080/user/test3
     */
    @GetMapping("/test3")
    public Dept test3() {
        Dept dept = new Dept();
        dept.setDeptId(1L);
        dept.setParentId(Long.valueOf(1));
        dept.setName("cesss");
        dept.setOrderNum(3);
        dept.setDelFlag(0);
        deptService.saveOrUpdate(dept);
        return deptService.getById(1L);
    }

    @GetMapping("/add")
    public Object addDept() {
        Dept dept = new Dept();
        dept.setDeptId(8L);
        dept.setParentId(Long.valueOf(0));
        dept.setName("cesss");
        dept.setOrderNum(0);
        dept.setDelFlag(-1);
        return deptService.save(dept);
    }
    /**
     * <p>
     * 根据 entity 条件，查询全部记录
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     * @return 实体集合
     */
    @ResponseBody
    @GetMapping("/list")
    public List<Dept> selectList(@Param(Constants.WRAPPER) Wrapper<Dept> queryWrapper){
        Map<String, Object> query = new HashMap<>(16);
        List<Dept> sysDeptList = deptService.selectByMap(query);
        return sysDeptList;
    }

    /**
     * http://localhost:8080/user/select_sql
     */
    @GetMapping("/select_sql")
    public Object getDeptBySql() {
        return deptService.selectListBySQL();
    }

    @ResponseBody
    public String findByName(){
        System.out.println("ni hao !!!");
        return "sss";
    }


}
