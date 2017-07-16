package com.yellocode.player.resource;

import com.yellocode.player.domain.User;
import com.yellocode.player.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;

@Transactional
@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Page<User> getAll(@RequestParam(value = "page", defaultValue = "0") int page,
                             @RequestParam(value = "size", defaultValue = "10") int size) {
        return repository.findAll(new PageRequest(page, size));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getById(@PathVariable("id") Long id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public User create(@RequestBody User request) {
        return repository.save(request);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public User update(@PathVariable("id") Long id,
                       @RequestBody User request) {
        User user = repository.findOne(id);
        user.setEmail(request.getEmail());
        user.setLogin(request.getLogin());
        return repository.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        repository.delete(id);
    }
}
