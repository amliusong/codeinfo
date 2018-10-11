package com.heran.codeinfo.miaojob.controller;

import com.heran.codeinfo.miaojob.entity.Ad;
import com.heran.codeinfo.miaojob.service.IAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 广告信息表 前端控制器
 * </p>
 *
 * @author liusong
 * @since 2018-10-09
 */
@RestController
@RequestMapping("/ad")
public class AdController {

    @Autowired
    private IAdService adService;

    @GetMapping("/test")
    public String Test(){
        System.out.println("sss");
        return "sss";
    }

    @GetMapping ("/banner")
    public Object banner() {
        Map<String, Object> adList = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("class_id", 3);
        List<Ad> banner = adService.selectByMap(param);
        adList.put("banner", banner);
        System.out.println(adList);
        Map<String,Object> res = new HashMap<String,Object>();
        res.put("errno",0);
        res.put("data",adList);
        //还可以继续加其他的参数
        return res;
    }
}
