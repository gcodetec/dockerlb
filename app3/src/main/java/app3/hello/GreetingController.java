package app3.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

@Controller
public class GreetingController {

    @RequestMapping("/")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model, HttpServletRequest request) {
        model.addAttribute("name", name);
        String url = request.getRequestURL().toString();
        String servername = request.getServerName();
        String tenant = servername.split("\\.")[0];
        model.addAttribute("tenant", tenant);
        model.addAttribute("servername", servername);
        model.addAttribute("url", url);
        return "greeting";
    }

}
