package com.shm.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author JiHC
 * @since  2020-09-01
 */
@Component
public class EchoServiceFallbackFactory implements FallbackFactory<EchoServiceFallback> {

	@Override
	public EchoServiceFallback create(Throwable throwable) {
		return new EchoServiceFallback(throwable);
	}

}
