package com.yl.community.controller;

import com.yl.community.dto.AccessTokenDTO;
import com.yl.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @quthor yl
 * @create 2019-11-03 13:48
 */
@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public  String callback(@RequestParam(name = "code") String code,
                            @RequestParam(name = "state") String state){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.getClent_id("6f11169d34fcfbd2b699");
        accessTokenDTO.getClent_secret("6daa15ba2f13e788b2dbcbf70f73dafb93cd3034");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri("http://localhost:8887/callback");
        accessTokenDTO.setState(state);
        githubProvider.getAccessToken(accessTokenDTO);
        return  "index";
    }
}
