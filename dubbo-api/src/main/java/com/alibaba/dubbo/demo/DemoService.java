package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * @author WH1707008
 */
public interface DemoService {
    /**
     *定义一个接口
     * @param id
     * @return
     */
    List<String> getPermissions(Long id);


}
