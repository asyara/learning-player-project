package com.yellocode.player.domain;

import javax.persistence.*;


@Entity
@Table(name = "track")
public class Track extends AbstractDomain {

    @Column(name = "track_name", nullable = false, insertable = true, updatable = true, length = 255)
    private String trackName;
    @Column(name = "track_author", nullable = false, insertable = true, updatable = true, length = 255)
    private String trackAuthor;

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
                '}';
    }
}
