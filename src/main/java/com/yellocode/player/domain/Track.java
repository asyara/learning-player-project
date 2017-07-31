package com.yellocode.player.domain;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "track")
public class Track extends AbstractDomain {

    @Column(name = "track_name", nullable = false, insertable = true, updatable = true, length = 255)
    private String trackName;
    @Column(name = "track_author", nullable = false, insertable = true, updatable = true, length = 255)
    private String trackAuthor;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "track_artist", joinColumns = {
            @JoinColumn(name = "track_id", nullable = false, updatable = true)
    }, inverseJoinColumns = {@JoinColumn(name = "artist_id", nullable = false, updatable = true)})
    private List<Artist> artists;

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackAuthor() {
        return trackAuthor;
    }

    public void setTrackAuthor(String trackAuthor) {
        this.trackAuthor = trackAuthor;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackName='" + trackName + '\'' +
                ", trackAuthor='" + trackAuthor + '\'' +
                ", artists=" + artists +
                '}';
    }
}
