package com.yl.community.provider;

import com.alibaba.fastjson.JSON;
import com.yl.community.dto.AccessTokenDTO;
import com.yl.community.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;
import java.io.IOException;

/**
 * @quthor yl
 * @create 2019-11-03 14:13
 * @component 把当前类初始化到spring容器的上下文，不需要写GithubProvider githubProvider = new GithubProvider();
 *如果对象超过两个就封装一下
 * 作用：传递5个参数调用地址获取accesstoken  getAccess..为post请求
 * 显示红色没引入jar和依赖
 * json转换到accesstoken用到
 */
@Component
public class GithubProvider {


   public String getAccessToken(AccessTokenDTO accessTokenDTO){
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            System.out.println(string);
            return string;
        } catch (IOException e) {
        }
        return null;

    }
    public GithubUser getUser(String accessToken){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://github.com/user?access_token"+accessToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            GithubUser githubUser = JSON.parseObject(string, GithubUser.class);   /*把string的json对象转换成java类对象*/
            return githubUser;
        } catch (IOException e) {

        }
        return null;
    }

}
