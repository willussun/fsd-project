package com.capfsd.mod.technology.controller;

import com.capfsd.mod.technology.dto.PageDto;
import com.capfsd.mod.technology.dto.TechnologyDto;
import com.capfsd.mod.technology.util.ResponseResult;
import com.capfsd.mod.technology.vo.TechnologyVo;
import com.capfsd.mod.technology.service.ITechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(value = "/api/v1/technologies")
public class TechnologyController {

    @Autowired
    private ITechnologyService technologyService;

    @PostMapping
    public ResponseResult create(@Valid @RequestBody TechnologyVo technologyVo) {
        technologyService.addTechnology(technologyVo);
        return ResponseResult.success("create technology " + technologyVo.getName() + "successfully", null, null);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseResult deleteById(@PathVariable(value = "id") Long id) {
        technologyService.deleteTechnologyById(id);
        return ResponseResult.success("delete technology successfully", null, null);
    }

    @GetMapping
    public ResponseResult<PageDto<TechnologyDto>> getAll(
            @RequestParam(value = "ids", required = false) Set<Long> ids,
            @RequestParam(value = "q", required = false, defaultValue = "") String keyword,
            @PageableDefault(sort = {"updatedTime"})Pageable pageable) {

        PageDto<TechnologyDto> page = technologyService.findAll(keyword, ids, pageable);

        return ResponseResult.success("get all successfully", page, null);
    }

    @GetMapping(value = "/{id}")
    public ResponseResult<Object> getById(@PathVariable(value = "id") Long id) {
        Optional<TechnologyDto> optional = technologyService.findTechnologyById(id);
        if (!optional.isPresent()) {
            return ResponseResult.fail("failed to get technology " + id, null);
        }

        return ResponseResult.success("get technology successfully", optional.get(), null);
    }

    @PutMapping(value = "/{id}")
    public ResponseResult<TechnologyDto> updateById(@PathVariable(value = "id") Long id,
                                                    @Valid @RequestBody TechnologyVo technologyVo) {
        TechnologyDto technologyDto = technologyService.updateTechnologyById(id, technologyVo);

        return ResponseResult.success("update technology successfully", technologyDto, null);
    }

}
