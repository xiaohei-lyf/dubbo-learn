package com.learn; /**
 * @Author yufeng.lin@ucarinc.com
 * @Date 2019年11月22日 0022 16:30:04
 * @Version 1.0
 * @Description 描述:
 **/
/**
 * xml方式服务提供者实现类
 */
public class ProviderServiceImpl implements ProviderService{

    public String SayHello(String word) {
        return word;
    }
}