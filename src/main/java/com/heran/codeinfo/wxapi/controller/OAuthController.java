package com.heran.codeinfo.wxapi.controller;

import com.google.gson.Gson;
import com.heran.codeinfo.miaojob.service.IUsersService;
import com.heran.codeinfo.wxapi.utils.GetOpenid;
import net.sf.json.JSONObject;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @ClassName OAuthController
 * @Description 小程序授权登录接口
 * @Author: LiuSong
 * @Create: 2018-09-27 14:51
 **/

@RequestMapping("/miaojob/users")
@Controller
public class OAuthController {

    @Autowired
    private IUsersService usersService;

    // 获取信息
    @ResponseBody
    @RequestMapping("/getOpenid")
    public void getOpenid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //需要使用小程序传过来的js_code获取session_key
        String js_code = request.getParameter("js_code");
        //这个就是要解密的东西--用户敏感信息加密数据
        String encryptedData = request.getParameter("encryptedData");
        //加密算法的初始向量
        String iv = request.getParameter("iv");
        //调用工具类中获取session_key的方法
        String sessionkey = new GetOpenid().get(js_code);
        System.out.println(sessionkey);
        //调用工具类中的解密方法，然后返回给小程序就OK了
        JSONObject obj = new GetOpenid().getUserInfo(encryptedData, sessionkey,
                iv);
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        PrintWriter pw = response.getWriter();
        pw.write(json);
        System.out.println(json);
        pw.close();
    }
}


