package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Description   :  作用描述 <br/>
 * @ Author        :  ABug <br/>
 * @ CreateDate    :  2022/10/27 15:32 <br/>
 * @ UpdateUser    :  ABug <br/>
 * @ UpdateDate    :  2022/10/27 15:32 <br/>
 * @ UpdateRemark  :  修改内容 <br/>
 * @ Version       :  1.0 <br/>
 */
@Controller
@RestController
@RequestMapping
public class DemoContllor {
    @GetMapping("/")
    public String demo(){


        return "nihao";
    }
}
