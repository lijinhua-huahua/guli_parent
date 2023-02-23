package com.atguigu.eduservice.controller;


import com.atguigu.commonutils.R;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eduservice/user")
@CrossOrigin    //解决跨域
public class EduLgoinController {

    //login
    @PostMapping("login")
    public R login(){
        return R.ok().data("token","admin");
    }


    //info
    @GetMapping("info")
    public R info(){
        return R.ok().data("roles","[admin]").data("name","admin").data("avatar","https://pic3.zhimg.com/v2-58d652598269710fa67ec8d1c88d8f03_r.jpg?source=1940ef5c");
    }



}
