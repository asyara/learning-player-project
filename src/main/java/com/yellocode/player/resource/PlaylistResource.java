package com.yellocode.player.resource;

import com.yellocode.player.domain.Playlist;
import com.yellocode.player.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;

@Transactional
@RestController
@RequestMapping("/playlists")
public class PlaylistResource {

    @Autowired
    private PlaylistRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Page<Playlist> getAll(@RequestParam(value = "page", defaultValue = "0") int page,
                                 @RequestParam(value = "size", defaultValue = "10") int size) {
        return repository.findAll(new PageRequest(page, size));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Playlist getById(@PathVariable("id") Long id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Playlist create(@RequestBody Playlist request) {
        return repository.save(request);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Playlist update(@PathVariable("id") Long id,
                           @RequestBody Playlist request) {
        Playlist playlist = repository.findOne(id);
        playlist.setPlaylistName(request.getPlaylistName());
        playlist.setTracks(request.getTracks());
        return repository.save(playlist);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        repository.delete(id);
    }
}
