package com.xdarker.concurrency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by XDarker
 * 2018/8/27 21:26
 */
@Controller
@Slf4j
public class TestController {

   @GetMapping("/test")
   @ResponseBody
   public String  test(){

       return "test";
   }

}
