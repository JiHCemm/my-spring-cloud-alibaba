/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shm.fallback;

import com.shm.service.EchoService;

/**
 * @author JiHC
 * @since  2020-09-01
 * <p>
 * sentinel 降级处理
 */
public class EchoServiceFallback implements EchoService {

    private Throwable throwable;

    EchoServiceFallback(Throwable throwable) {
        this.throwable = throwable;
    }

    /**
     * 调用服务提供方的输出接口.
     *
     * @param str 用户输入
     * @return
     */
    @Override
    public String echo(String str) {
        String msg = "consumer fallback" +
                "\n    parameter : " + str +
                "\n    [error message] " + throwable.getMessage ();
        return msg;
    }

}
