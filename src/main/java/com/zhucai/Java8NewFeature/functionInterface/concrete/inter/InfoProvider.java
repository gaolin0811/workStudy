package com.zhucai.Java8NewFeature.functionInterface.concrete.inter;

import java.util.Objects;

/**
 * @Desc: 信息提供者
 * @Auth: GaoLin
 * @Date: 2023/6/29 16:51
 */
@FunctionalInterface
public interface InfoProvider<T,R> {

    R provide(T t);

    default InfoProvider<T,R> addMore(ExtraInfoProvider<R> more) {

        return (T t) -> {
            Objects.requireNonNull(more);
            R r = provide(t);
            return more.providerMore(r);
        };
    }

    default DataCombiner<T> addCombiner(DataCombiner<R> combiner) {
        return (T t) -> {
            Objects.requireNonNull(combiner);
            return combiner.combine(provide(t));
        };
    }
}
