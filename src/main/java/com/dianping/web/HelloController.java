package com.dianping.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenchen on 14-10-25.
 */
@Controller
@RequestMapping("/welcome")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView printWelcome(ModelAndView mav) {

        System.out.println("你的上传空间");
        String str="这是返回给freemarker页面的值";
        mav.addObject("haha", str);

        ///这里顺便回顾下HashMap的使用方法
/*      创建：Map<String,String> map = new HashMap<String,String>();
        插入元素：map.put("1","a");
        移除元素: map.remove("1");
        清空: map.clear();*/
        Map<String,String> map=new HashMap<String, String>();
        map.put("name", "xiaoming");
        map.put("age", "21");
        map.put("address", "硅谷");
        map.put("ad", "广州");
        map.remove("ad");
        mav.addObject("maplist", map);
        mav.setViewName("hello");
        return mav;
    }
}
