package site.jmao5.duckdns.org.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/sample")
    public String greeting(){
        return "sample!!";
    }
}
