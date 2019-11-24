package com.capfsd.mod.security.service.impl;

import com.capfsd.mod.security.dto.UserDto;
import com.capfsd.mod.security.feign.UserServiceFeignClient;
import com.capfsd.mod.security.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserServiceFeignClient userServiceFeignClient;

    @Override
    public UserDto loadUserByUsername(String username) throws UsernameNotFoundException {
        ResponseResult<UserDto> result = userServiceFeignClient.getAuthByUsername(username);
        return result.getData();
    }
}
