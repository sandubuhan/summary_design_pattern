package com.design_pattern.demo.chainOfResponsibilityPattern.five;

import org.apache.catalina.Server;
import org.apache.catalina.core.ApplicationFilterConfig;

import javax.naming.NamingException;
import javax.servlet.*;
import java.io.IOException;

import static org.apache.catalina.core.ApplicationFilterChain.INCREMENT;


public class ApplicationFilterChain implements FilterChain {

    /**
     * 当前执行到那个Filter
     */
    private int pos = 0;


    private int n;

    private ApplicationFilterConfig[] filters;

    private Servlet servlet;


    @Override
    public void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException {

        if (pos < n) {
            ApplicationFilterConfig filterConfig = filters[pos++];
//                Filter                  filter       = filterConfig.getFilter();
            // 使用递归的天然栈来存放调用链
            //  使用递归调用，拦截完用户请求后，将请求交给下一个filter，直到
            //  最后由service处理，在递归返回时，还能够对响应作处理
//                filter.doFilter(request,response,this);
        } else {
            // filter都处理完毕后，执行servlet
            servlet.service(request, response);
        }

    }

    public void addFilter(ApplicationFilterConfig filterConfig) {
        for (ApplicationFilterConfig filter : filters) {
            if (filter == filterConfig) {
                return;
            }
        }


        if (n == filters.length) {
            ApplicationFilterConfig[] newFilters = new ApplicationFilterConfig[n + INCREMENT];
            System.arraycopy(filters, 0, newFilters, 0, n);
            filters = newFilters;
        }

    }

}
