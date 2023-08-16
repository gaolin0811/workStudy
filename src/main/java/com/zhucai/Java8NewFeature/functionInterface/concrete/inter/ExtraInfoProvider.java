package com.zhucai.Java8NewFeature.functionInterface.concrete.inter;

/**
 * @Desc: 信息额外提供者
 * @Auth: GaoLin
 * @Date: 2023/6/29 16:48
 */
@FunctionalInterface
public interface ExtraInfoProvider<R> {
    R providerMore(R r);
}
