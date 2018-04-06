package fr.west.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import fr.west.model.Comment;
import fr.west.repository.CommentRepository;

@RestController
@CrossOrigin
public class WebController {
	@Autowired
	CommentRepository repository;

	@RequestMapping(value = "/addComment/", method = RequestMethod.POST)
	public ResponseEntity<?> createComment(@RequestBody Comment comment, UriComponentsBuilder ucBuilder) {

		repository.save(comment);

		return new ResponseEntity<String>(HttpStatus.CREATED);

	}

	@RequestMapping(value = "/getAllComments/", method = RequestMethod.GET)
	public ResponseEntity<List<Comment>> listAllComments() {
		List<Comment> comments =  (List<Comment>) repository.findAll();
		return new ResponseEntity<List<Comment>>(comments, HttpStatus.OK);
	}

}
