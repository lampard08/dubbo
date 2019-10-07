package com.lampard.spi;


import com.lampard.spi.service.LampardSpiService;

import java.util.ServiceLoader;

/**
 * spi demo
 *
 * @author lampard
 */
public class JavaSpiDemoMain {

    public static void main(String[] args) {

        // 使用 ServiceLoader 加载 服务实现
        ServiceLoader<LampardSpiService> serviceServiceLoader = ServiceLoader.load(LampardSpiService.class);

        for (LampardSpiService lampardSpiService : serviceServiceLoader) {
            // 执行方法
            lampardSpiService.printInfo();
        }


    }
}
