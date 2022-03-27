package com.design_pattern.demo.adapterPattern.log;

/**
 * Slf4j 统一的接口定义
 *
 * @Author sandu
 * @Date 2022-03-27 9:45
 */
public interface Logger {
    boolean isTraceEnabled();

    void trace(String msg);

    void trace(String format, Object arg);

    void trace(String format,Object arg1,Object arg2);

    public boolean isDebugEnabled();

    void debug(String msg);

    void debug(String format,Object arg);

    void debug(String format,Object arg1,Object arg2);
}
