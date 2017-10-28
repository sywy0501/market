package com.cs.controller;

import com.cs.entity.Message;
import com.cs.entity.User;
import com.cs.service.UserService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author cs
 * @version V1.0
 * @Title: market
 * @Package com.cs.controller
 * @Description: TODO
 * @date 2017/10/26 上午 11:27
 */
@Controller
@RequestMapping("/user")
public class UserController {

    public static final String INSERT_USERS_FAILED = "注册帐号失败";
    public static final String INSERT_USERS_SUCCESS = "注册帐号成功";
    public static final String INSERT_SECOND_USER_FAILED = "注册帐号失败,帐号重复";
    public static final String SELECT_USER_FAILED = "没有符合该信息的用户";


    public Log LOG = LogFactory.getLog(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "listAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public @ResponseBody
    String listAllUser() {

        Gson gson = new GsonBuilder().serializeNulls().create();
        String json;
        List<User> list = userService.selectUsers();
        json = gson.toJson(list);
        return json;
    }

    @RequestMapping(value = "listByUserInfo",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public @ResponseBody
    String listByUserInfo(@RequestBody User user){
        Gson gson = new GsonBuilder().serializeNulls().create();
        Message mes = new Message();
        String json;

        List<User> listByUserInfo = userService.selectByUserInfo(user);
        if (listByUserInfo.size()==0){
            mes.setState(0);
            mes.setStateInfo(SELECT_USER_FAILED);
            json = gson.toJson(mes);
            return json;
        }
        json = gson.toJson(listByUserInfo);
        return json;
    }

    @RequestMapping(value = "login",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public @ResponseBody
    String insertUser(User user){
        Gson gson = new GsonBuilder().serializeNulls().create();
        String json=null;
        return json;
    }


}

