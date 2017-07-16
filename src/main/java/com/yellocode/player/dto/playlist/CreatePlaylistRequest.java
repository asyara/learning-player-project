package com.yellocode.player.dto.playlist;

import lombok.Data;

/**
 * Created by DmitryL on 16.07.2017.
 */
@Data
public class CreatePlaylistRequest {

    private String name;
    private PlaylistType type;
}
