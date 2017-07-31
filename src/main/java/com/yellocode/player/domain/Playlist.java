package com.yellocode.player.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "playlist")
public class Playlist extends AbstractDomain {

    @Column(name = "playlist_name", nullable = false, insertable = true, updatable = true, length = 255)
    private String playlistName;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "track_playlist", joinColumns = {
            @JoinColumn(name = "playlist_id", nullable = false, updatable = true)
    }, inverseJoinColumns = {@JoinColumn(name = "track_id", nullable = false, updatable = true)})
    private List<Track> tracks;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_playlist", joinColumns = {
            @JoinColumn(name = "user_id", nullable = false, updatable = true)
    }, inverseJoinColumns = {@JoinColumn(name = "playlist_id", nullable = false, updatable = true)})
    private List <Playlist> playlists;

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public List <Playlist> getPlaylistsByUserId() {
        return playlists;
    }


    @Override
    public String toString() {
        return "Playlist{" +
                "playlistName='" + playlistName + '\'' +
                ", tracks=" + tracks +
                '}';
    }
}
