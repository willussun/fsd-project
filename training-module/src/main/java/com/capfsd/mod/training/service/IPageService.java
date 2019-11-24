package com.capfsd.mod.training.service;

import com.capfsd.mod.training.dto.PageDto;
import org.springframework.data.domain.Page;

public interface IPageService {
    <S, T> PageDto<T> convertToPageDto(Page<S> page, Converter<S, T> converter);
}
