package com.capfsd.mod.user.service;

import com.capfsd.mod.user.dto.PageDto;
import com.capfsd.mod.user.dto.ResourceDto;
import com.capfsd.mod.user.entity.Resource;
import com.capfsd.mod.user.vo.ResourceVo;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IResourceService {
    void addResource(ResourceVo resourceVo);
    void deleteResourceById(Long id);
    ResourceDto updateResource(Long id, ResourceVo resourceVo);
    Optional<ResourceDto> findResourceById(Long id);
    PageDto<ResourceDto> findAll(String keyword, Pageable pageable);

    ResourceDto convertToDto(Resource resource);
    Optional<Resource> findById(Long id);
}
