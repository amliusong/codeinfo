package com.heran.codeinfo.miaojob.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heran.codeinfo.miaojob.entity.Users;
import com.heran.codeinfo.miaojob.mapper.UsersMapper;
import com.heran.codeinfo.miaojob.service.IUsersService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户成员表（个人用户、企业用户、猎头用户） 服务实现类
 * </p>
 *
 * @author liusong
 * @since 2018-10-09
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
