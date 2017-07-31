package com.yellocode.player.resource;

import com.yellocode.player.domain.Artist;
import com.yellocode.player.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/artists")
public class ArtistResource {

    @Autowired
    private ArtistRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Page<Artist> getAll(@RequestParam(value = "page", defaultValue = "0") int page,
                               @RequestParam(value = "size", defaultValue = "10") int size) {
        return repository.findAll(new PageRequest(page, size));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Artist getById(@PathVariable("id") Long id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Artist create(@RequestBody Artist request) {
        return repository.save(request);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Artist update(@PathVariable("id") Long id,
                       @RequestBody Artist request) {
        Artist artist = repository.findOne(id);
        artist.setGroupName(request.getGroupName());
        artist.setGroupName(request.getGroupName());
        return repository.save(artist);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        repository.delete(id);
    }


}
