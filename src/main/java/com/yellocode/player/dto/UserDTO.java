package com.yellocode.player.DTO;

import com.yellocode.player.domain.Artist;
import com.yellocode.player.domain.Playlist;
import java.util.List;

/**
 * Created by DmitryL on 23.07.2017.
 */
public class UserDTO {

    private String login;

    private String email;

    private String password;

    private List<Artist> artists;

    private List<Playlist> playlists;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Artist> getArtistByUserId() {
         return artists;
    }

    public List<Playlist> getPlaylistByUserId() {
        return playlists;
    }
}
