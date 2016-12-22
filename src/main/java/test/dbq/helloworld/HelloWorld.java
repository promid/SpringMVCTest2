package test.dbq.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DBQ on 2016/11/23.
 */

@Controller
public class HelloWorld {

    @RequestMapping("helloworld")
    public String hello(){
        return "success";
    }
}
