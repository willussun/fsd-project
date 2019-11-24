package com.capfsd.mod.user;

import com.capfsd.mod.user.service.IUserService;
import com.capfsd.mod.user.dto.PageDto;
import com.capfsd.mod.user.dto.UserDto;
import com.capfsd.mod.user.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import static org.junit.Assert.assertNotNull;

public class UserTest extends UserServiceTest {

    @Autowired
    private IUserService userService;

    @Autowired
    private UserRepository dao;

//    @Test
//    public void testCreateUser() {
//        assertNotNull(userService);
//        UserVo userVo = new UserVo();
//        userVo.setContactNumber("130741413815");
//        userVo.setFirstName("Jack");
//        userVo.setLastName("Li");
//        userVo.setUsername("lijack");
//        userVo.setRoleIds(new HashSet<>());
//        userVo.setPassword("elehand5");
//
//        userService.addUser(userVo);
//    }

    @Test
    public void testFindAll() {
        assertNotNull(userService);
        PageDto<UserDto> userPage = userService.findAll("", PageRequest.of(0, 10));
        System.out.println(userPage.getList().get(0).getUsername());
    }
}
