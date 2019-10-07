package com.lampard.spi.dubbo;

import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * dubbo spi
 *
 * @author lampard
 */
@SPI("impl")
public interface DubboSpiService {
    /**
     * 打印输出
     */
    // @Adaptive, 传入参数
    void printInfo();
}
