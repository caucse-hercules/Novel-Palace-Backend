package com.heracules.novelpalace;

import com.heracules.novelpalace.config.auth.LoginUser;
import com.heracules.novelpalace.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser member) {
        if (member != null) {
            model.addAttribute("memberName", member.getName());
            System.out.println(member.getName());
        }
        return "index";
    }
}
