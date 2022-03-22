package com.design_pattern.demo.proxyPattern.abstractProxy;

import com.design_pattern.demo.proxyPattern.UserVo;

/**
 * @Author sandu
 * @Date 2022-03-22 21:17
 */
public class UserControllerAb {

    public UserVo login(String telephone, String password) {
        return new UserVo();
    }


    public UserVo register(String telephone, String password) {
        return new UserVo();
    }
}
