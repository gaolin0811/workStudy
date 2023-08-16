package com.zhucai.Java8NewFeature.functionInterface;

import java.util.Objects;

/**
 * @Desc:
 * @Auth: GaoLin
 * @Date: 2023/6/29 15:51
 */
public interface Worship {
    void chant(String name);

    default Worship again(Worship w) {
        return (name) -> {
            Objects.requireNonNull(name);
            chant(name);
            w.chant(name);
        };
    }
}
