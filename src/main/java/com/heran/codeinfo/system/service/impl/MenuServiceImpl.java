package com.heran.codeinfo.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heran.codeinfo.system.entity.Menu;
import com.heran.codeinfo.system.mapper.MenuMapper;
import com.heran.codeinfo.system.service.IMenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单管理 服务实现类
 * </p>
 *
 * @author liusong
 * @since 2018-10-09
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
