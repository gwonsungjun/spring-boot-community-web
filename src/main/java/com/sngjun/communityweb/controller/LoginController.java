package com.sngjun.communityweb.controller;

import com.sngjun.communityweb.annotation.SocialUser;
import com.sngjun.communityweb.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/{facebook|google|kakao}/complete")
    public String loginComplete(@SocialUser User user) {

/* FACEBOOK만 가능해짐 & 컨트롤러에 로직이 많아짐. => @SocialUser
        OAuth2Authentication authentication = (OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication();
        Map<String, String> map = (HashMap<String, String>) authentication.getUserAuthentication().getDetails();
        session.setAttribute("user", User.builder()
                .name(map.get("name"))
                .email(map.get("email"))
                .principal(map.get("id"))
                .socialType(SocialType.FACEBOOK)
                .createdDate(LocalDateTime.now())
                .build()
        );
        return "redirect:/board/list";*/

        return "redirect:/board/list";
    }

}
