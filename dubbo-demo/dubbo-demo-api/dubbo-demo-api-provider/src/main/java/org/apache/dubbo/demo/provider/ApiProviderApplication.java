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
package org.apache.dubbo.demo.provider;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.demo.DemoService;

/**
 * API DEMO provider
 *
 * @author lampard
 */
public class ApiProviderApplication {
    public static void main(String[] args) throws Exception {

        // 创建 service 配置
        ServiceConfig<DemoServiceImpl> service = new ServiceConfig<>();
        // 设置服务名
        service.setApplication(new ApplicationConfig("dubbo-demo-api-provider"));
        // 设置 注册重心
        service.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        // 设置暴露的服务类
        service.setInterface(DemoService.class);
        // 设置服务类的实现
        service.setRef(new DemoServiceImpl());
        // 暴露服务
        service.export();

        System.in.read();
    }
}
