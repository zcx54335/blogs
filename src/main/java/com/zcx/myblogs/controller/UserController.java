package com.zcx.myblogs.controller;

import com.zcx.myblogs.common.AjaxResult;
import com.zcx.myblogs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/registory")
    public Object registory(String username, String password) {

        //TODO 利用springmvc来做验证

        // 1.非空效验
        if (!StringUtils.hasLength(username) || !StringUtils.hasLength(password)) {
            return AjaxResult.fail(-1, "非法的参数请求！");
        }
        // 2.进行添加操作
        int result = userService.addUser(username, password);
        if (result == 1) {
            return AjaxResult.success("注册成功！", 1);
        } else {
            return AjaxResult.fail(-1, "数据库添加出错！");
        }
    }

}
