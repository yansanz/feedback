package fr.west.repository;



import org.springframework.data.repository.CrudRepository;

import fr.west.model.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{
	

}