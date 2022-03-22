package com.design_pattern.demo.proxyPattern.interfaceProxy;

import com.design_pattern.demo.proxyPattern.UserVo;

/**
 * @Author sandu
 * @Date 2022-03-22 21:09
 */
public class UserControllerIP implements IUserController {
    @Override
    public UserVo login(String telephone, String password) {
        return new UserVo();
    }

    @Override
    public UserVo register(String telephone, String password) {
        return new UserVo();
    }
}
