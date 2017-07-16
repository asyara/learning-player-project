package com.yellocode.player.domain;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
