package com.musibe.intern.karaoke.api.greet;

import com.musibe.intern.karaoke.api.greet.vos.SaveRequest;
import com.musibe.intern.karaoke.domain.todo.Todo;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class TodoRestController {

    @GetMapping("/{id}")
    public ResponseEntity<Todo> details() {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Todo>> list() {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Todo> create(@RequestBody SaveRequest request) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete() {
        return ResponseEntity.ok().build();
    }
}
