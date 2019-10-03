package springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableAutoConfiguration

//@SpringBootApplication
public class SpringBootDemo {
    
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "index";
    }
    
     @RequestMapping("/about")
    @ResponseBody
    String about(){
        return "About page";
    }
    
    public static void main(String[] args){
        SpringApplication.run(SpringBootDemo.class, args);
    }
    
}
