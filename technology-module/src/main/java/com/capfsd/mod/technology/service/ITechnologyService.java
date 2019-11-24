package com.capfsd.mod.technology.service;

import com.capfsd.mod.technology.dto.PageDto;
import com.capfsd.mod.technology.dto.TechnologyDto;
import com.capfsd.mod.technology.vo.TechnologyVo;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.Set;

public interface ITechnologyService {

    void addTechnology(TechnologyVo technologyVo);
    void deleteTechnologyById(Long id);
    TechnologyDto updateTechnologyById(Long id, TechnologyVo technologyVo);
    Optional<TechnologyDto> findTechnologyById(Long id);
    PageDto<TechnologyDto> findAll(String keyword, Set<Long> ids, Pageable pageable);
}
