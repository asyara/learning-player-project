package com.yellocode.player.domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "artist")
public class Artist extends AbstractDomain {

    @Column(name = "artist_name", nullable = false, insertable = true, updatable = true, length = 255)
    private String groupName;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_artist", joinColumns = {
            @JoinColumn(name = "artist_id", nullable = false, updatable = true)
    }, inverseJoinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = true)})
    private List<User> users;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "groupName='" + groupName + '\'' +
                ", users=" + users +
                '}';
    }
}
