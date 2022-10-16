package com.example.ssmlearn_web.controller;

import com.example.ssmlearn_web.domain.User;
import com.example.ssmlearn_web.domain.VO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/quick19")
    @ResponseBody
    public void save19(String username, MultipartFile[] uploadFiles) throws IOException {
        for (MultipartFile uploadFile:uploadFiles) {
            String originalFilename = uploadFile.getOriginalFilename();
            uploadFile.transferTo(new File("E:\\upload\\"+originalFilename));
        }
    }

    //单文件上传
    @RequestMapping("/quick18")
    @ResponseBody
    public void save18(String username, MultipartFile uploadFile) throws IOException {
        //获得文件名称
        String originalFilename = uploadFile.getOriginalFilename();
        //保存文件
        uploadFile.transferTo(new File("E:\\upload\\"+originalFilename));
    }

    // require:是否携带此cookie
    @RequestMapping("/quick17")
    @ResponseBody
    public void save17(@CookieValue(value = "JSESSIONID", required = false) String JsessionID){
        System.out.println(JsessionID);
    }

    // 获取请求头 require:是否必须携带请求头
    @RequestMapping("/quick16")
    @ResponseBody
    public void save16(@RequestHeader(value = "User-Agent", required = false) String strAgent){
        System.out.println(strAgent);
    }

    @RequestMapping("/quick15")
    @ResponseBody
    public void save15(Date date){
        System.out.println(date);
    }

    //Restful风格
    @RequestMapping("/quick14/{username}")
    @ResponseBody
    public void save14(@PathVariable("username") String username){
        System.out.println(username);
    }

    @RequestMapping("/quick13")
    @ResponseBody
    public void save13(@RequestParam(value = "name",required = false,defaultValue = "human") String username){
        System.out.println(username);
    }

    //集合类型二
    // url=http://localhost:8080/ajax.jsp
    @RequestMapping("/quick12")
    @ResponseBody
    public void save12(@RequestBody List<User> userList){
        System.out.println(userList);
    }

    //集合类型
    // url=http://localhost:8080/form.jsp
    @RequestMapping("/quick11")
    @ResponseBody
    public void save11(VO vo){
        System.out.println(vo);
    }

    //数组类型
    // url=http://localhost:8080/user/quick10?strings=111&strings=222&strings=333
    @RequestMapping("/quick10")
    @ResponseBody
    public void save10(String[] strings){
        System.out.println(Arrays.asList(strings));
    }

    //POJO类型
    // url=http://localhost:8080/user/quick9?username="demxntia"&password="123123"
    @RequestMapping("/quick9")
    @ResponseBody
    public void save9(User user){
        System.out.println(user);
    }

    // url=http://localhost:8080/user/quick8?username="demxntia"&password="123123"
    @RequestMapping("/quick8")
    @ResponseBody
    public void save8(String username,String password){
        System.out.println(username);
        System.out.println(password);
    }

    @RequestMapping("quick7")
    @ResponseBody
    public User save7(){
        User user = new User();
        user.setPassword("123123");
        user.setUsername("三鹰酱");
        return user;
    }

    @RequestMapping("quick6")
    @ResponseBody
    public String save6() throws JsonProcessingException {
        User user = new User();
        user.setUsername("Venus");
        user.setPassword("123123");
        //用json转换工具将对象转换为json字符串
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping("/quick5")
    @ResponseBody //告知SpringMVC不进行页面跳转直接回传值
    public String save5(){
        return "hello Venus";
    }

    //非常用方法
    @RequestMapping(value = "/quick4")
    public String save4(HttpServletRequest request){
        request.setAttribute("username","PaloSanto");
        return "Controller";
    }

    @RequestMapping(value = "/quick3")
    public String save3(Model model){
        model.addAttribute("username","三鹰酱");
        return "Controller";
    }

    @RequestMapping(value = "/quick2")
    public ModelAndView save2(ModelAndView modelAndView){
        modelAndView.addObject("username","Demxntia");
        modelAndView.setViewName("Controller");
        return modelAndView;
    }

    @RequestMapping(value = "/quick1")
    public ModelAndView save1(){
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username","Venus");
        //设置视图名称
        modelAndView.setViewName("Controller");
        return modelAndView;
    }

    //请求地址http://localhost:8080/user/quick
    @RequestMapping(value = "/quick")
    public String save(){
        System.out.println("Controller done");
        return "Controller";
    }
}
