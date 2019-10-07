package com.lampard.spi;

import com.lampard.spi.dubbo.DubboSpiService;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author lampard
 */
public class DubboSpiDemoMain {
    public static void main(String[] args) {
        DubboSpiService dubboSpiService = null;
//        // Dubbo SPI
//        dubboSpiService = ExtensionLoader.getExtensionLoader(DubboSpiService.class).getDefaultExtension();
//        dubboSpiService.printInfo();
//
//        // name = true  实际上调用的是 getDefaultExtension getDefaultExtension
//        dubboSpiService = ExtensionLoader.getExtensionLoader(DubboSpiService.class).getExtension("true");
//        dubboSpiService.printInfo();

        dubboSpiService = ExtensionLoader.getExtensionLoader(DubboSpiService.class).getExtension("impl");
        dubboSpiService.printInfo();

//        dubboSpiService = ExtensionLoader.getExtensionLoader(DubboSpiService.class).getExtension("a");
//        dubboSpiService.printInfo();

    }
}
