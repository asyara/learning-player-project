package com.yellocode.player.domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "artist")
public class Artist extends AbstractDomain {

    @Column(name = "artist_name", nullable = false, insertable = true, updatable = true, length = 255)
    private String groupName;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "artist_track", joinColumns = {
            @JoinColumn(name = "artist_id", nullable = false, updatable = true)
    }, inverseJoinColumns = {@JoinColumn(name = "track_id", nullable = false, updatable = true)})
    private List<Track> tracks;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }


}
