package com.yellocode.player.resource;


import com.yellocode.player.domain.Track;
import com.yellocode.player.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@Transactional
@RestController
@RequestMapping("/Tracks")
public class TrackResource {

    @Autowired
    private TrackRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Page<Track> getAll(@RequestParam(value = "page", defaultValue = "0") int page,
                              @RequestParam(value = "size", defaultValue = "10") int size) {
        return repository.findAll(new PageRequest(page, size));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Track getById(@PathVariable("id") Long id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Track create(@RequestBody Track request) {
        return repository.save(request);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Track update(@PathVariable("id") Long id,
                        @RequestBody Track request) {
        Track track = repository.findOne(id);
        track.setTrackAuthor(request.getTrackAuthor());
        track.setTrackName(request.getTrackName());
        return repository.save(track);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        repository.delete(id);
    }
}
