package lol.chess.lolto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/lolto")
    @ResponseBody
    public String index() {
        return "HIHIHIHIHI";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
