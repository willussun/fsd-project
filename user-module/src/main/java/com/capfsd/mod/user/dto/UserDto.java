package com.capfsd.mod.user.dto;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String email;
    private String linkedinUrl;
    private Set<RoleDto> roles;
    private List<TechnologyDto> skills;
}
