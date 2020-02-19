/*
 * Copyright 2015 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.discovery.shared.resolver;

/**
 * 服务端点
 */
public interface EurekaEndpoint extends Comparable<Object> {

    /**
     * 服务的URL
     */

    String getServiceUrl();

    /**
     * @deprecated use {@link #getNetworkAddress()}
     */
    @Deprecated
    String getHostName();

    /**
     *  网络地址
     */
    String getNetworkAddress();

    /**
     * 端口号
     */

    int getPort();

    /**
     * 是否安全 https: true  http: false
     */

    boolean isSecure();

    /**
     * 相对路径
     */
    String getRelativeUri();

}
