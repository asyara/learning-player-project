package com.yellocode.player.domain;

public abstract class AbstractDomain {

    protected long id;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
