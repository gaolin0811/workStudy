package com.zhucai.Java8NewFeature.functionInterface.concrete.inter;

/**
 * @Desc: 数据组合器
 * @Auth: GaoLin
 * @Date: 2023/6/29 16:43
 */
@FunctionalInterface
public interface DataCombiner<T> {
    String combine(T t);
}
