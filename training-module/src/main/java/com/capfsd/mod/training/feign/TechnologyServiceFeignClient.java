package com.capfsd.mod.training.feign;

import com.capfsd.mod.training.dto.TechnologyDto;
import com.capfsd.mod.training.util.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "technology-module")
public interface TechnologyServiceFeignClient {

    @GetMapping(value = "/api/v1/technologies/{id}")
    ResponseResult<TechnologyDto> getTechnologyById(@PathVariable(value = "id") Long id);
}
