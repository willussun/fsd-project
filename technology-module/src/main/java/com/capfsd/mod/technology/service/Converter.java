package com.capfsd.mod.technology.service;

@FunctionalInterface
public interface Converter<S, T> {
    T convert(S source);
}
