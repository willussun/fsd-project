package com.capfsd.mod.user.service;

import com.capfsd.mod.user.dto.AuthUserDto;

import java.util.Optional;

public interface IAuthUserService {

    Optional<AuthUserDto> loadUserByUsername(String username);

}
