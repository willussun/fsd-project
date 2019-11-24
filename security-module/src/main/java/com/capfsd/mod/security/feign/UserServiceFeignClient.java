package com.capfsd.mod.security.feign;

import com.capfsd.mod.security.dto.UserDto;
import com.capfsd.mod.security.util.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-module")
public interface UserServiceFeignClient {

    @GetMapping("/api/v1/users/auth")
    ResponseResult<UserDto> getAuthByUsername(@RequestParam(value = "username") String username);

}
