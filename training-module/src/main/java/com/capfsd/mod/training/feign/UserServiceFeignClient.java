package com.capfsd.mod.training.feign;

import com.capfsd.mod.training.dto.UserDto;
import com.capfsd.mod.training.util.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-module")
public interface UserServiceFeignClient {

    @GetMapping(value = "/api/v1/users/{id}")
    ResponseResult<UserDto> getUserById(@PathVariable(value = "id") Long id);
}
