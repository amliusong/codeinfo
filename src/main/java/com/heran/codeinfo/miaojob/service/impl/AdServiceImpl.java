package com.heran.codeinfo.miaojob.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heran.codeinfo.miaojob.entity.Ad;
import com.heran.codeinfo.miaojob.mapper.AdMapper;
import com.heran.codeinfo.miaojob.service.IAdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 广告信息表 服务实现类
 * </p>
 *
 * @author liusong
 * @since 2018-10-09
 */
@Service
public class AdServiceImpl extends ServiceImpl<AdMapper, Ad> implements IAdService {

    @Resource
    private AdMapper adDao;

    @Override
    public List<Ad> selectByMap(Map<String, Object> map) {
        return adDao.selectByMap(map);
    }
}
