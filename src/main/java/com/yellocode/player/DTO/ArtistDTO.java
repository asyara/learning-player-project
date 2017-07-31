package com.yellocode.player.dto;

import com.yellocode.player.domain.User;

import java.util.List;

/**
 * Created by DmitryL on 23.07.2017.
 */
public class ArtistDTO {

    private String groupName;

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
}
