package com.design_pattern.demo.chainOfResponsibilityPattern.five;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author sandu
 * @Date 2022-04-20 20:58
 */
public class LogFilter implements Filter {

    /**
     * 在创建Filter时自动调用
     * 其中filterConfig包含这个Filter的配置参数，比如name等（从配置文件中读取）
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("拦截客户端发送来的请求");
        chain.doFilter(request, response);
        System.out.println("拦截发送给客户端的响应");
    }

    @Override
    public void destroy() {
        //在销毁时自动调用
    }
}
