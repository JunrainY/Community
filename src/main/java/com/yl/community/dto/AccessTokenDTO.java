package com.yl.community.dto;

/**
 * @quthor yl
 * @create 2019-11-03 14:19
 * alt+inset   getting and setting
 */
public class AccessTokenDTO {
    private String clent_id;
    private String clent_secret;
    private String code;
    private String redirect_uri;
    private String state;

    public String getClent_id(String s) {
        return clent_id;
    }

    public void setClent_id(String clent_id) {
        this.clent_id = clent_id;
    }

    public String getClent_secret(String s) {
        return clent_secret;
    }

    public void setClent_secret(String clent_secret) {
        this.clent_secret = clent_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
