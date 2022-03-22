package com.design_pattern.demo.proxyPattern.interfaceProxy;

import com.design_pattern.demo.proxyPattern.UserVo;

/**
 * @Author sandu
 * @Date 2022-03-22 21:08
 */
public interface IUserController {
    UserVo login(String telephone,String password);
    UserVo register(String telephone,String password);
}
