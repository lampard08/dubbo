/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.dubbo.demo.consumer;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.demo.DemoService;

/**
 * API DEMO consumer
 *
 * @author lampard
 */
public class ApiConsumerApplication {
    public static void main(String[] args) {
        // 设置消费方
        ReferenceConfig<DemoService> reference = new ReferenceConfig<>();
        // 设置消费方服务名
        reference.setApplication(new ApplicationConfig("dubbo-demo-api-consumer"));
        // 设置 注册中心
        reference.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        // 指定要消费的服务
        reference.setInterface(DemoService.class);
        // 创建远程连接 并 做动态代理转换
        DemoService service = reference.get();

        // 通过 proxy 进行调用
        String message = service.sayHello("dubbo");

        System.out.println(message);
    }
}
