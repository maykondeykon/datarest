package com.mkdk.datarest.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "onlyName", types = {User.class})
public interface UserOnlyNameProjection {
	String getName();
}
