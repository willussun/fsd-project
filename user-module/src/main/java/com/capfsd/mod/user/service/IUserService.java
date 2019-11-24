package com.capfsd.mod.user.service;

import com.capfsd.mod.user.dto.PageDto;
import com.capfsd.mod.user.dto.UserDto;
import com.capfsd.mod.user.vo.UserVo;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IUserService {

    void addUser(UserVo userVo);
    void deleteUserById(Long id);
    UserDto updateUser(Long id, UserVo userVo);
    Optional<UserDto> findUserById(Long id);
    PageDto<UserDto> findAll(String keyword, Pageable pageable);
}
