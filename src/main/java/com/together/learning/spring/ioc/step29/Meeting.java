package com.together.learning.spring.ioc.step29;

import org.springframework.beans.factory.annotation.Autowired;

public class Meeting {
    @Autowired
    @Chinese
    private People[] chineseAttendee;

    @Autowired
    @Japanese
    private People[] japaneseAttendee;

    public Meeting() {
    }

    public People[] getChineseAttendee() {
        return chineseAttendee;
    }

    public void setChineseAttendee(People[] chineseAttendee) {
        this.chineseAttendee = chineseAttendee;
    }

    public People[] getJapaneseAttendee() {
        return japaneseAttendee;
    }

    public void setJapaneseAttendee(People[] japaneseAttendee) {
        this.japaneseAttendee = japaneseAttendee;
    }
}
