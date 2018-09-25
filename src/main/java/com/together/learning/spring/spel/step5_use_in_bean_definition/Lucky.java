package com.together.learning.spring.spel.step5_use_in_bean_definition;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author jiangjian
 */
@Component
public class Lucky {
    @Value("#{T(java.lang.Math).random() * 100000}")
    private Integer lotteryCount;

    public Integer getLotteryCount() {
        return lotteryCount;
    }

    public void setLotteryCount(Integer lotteryCount) {
        this.lotteryCount = lotteryCount;
    }
}
