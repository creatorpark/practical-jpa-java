package sample.jpa.app.entity.associations.m_n.insert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sample.jpa.app.entity.associations.m_n.Post;
import sample.jpa.app.entity.associations.m_n.PostRepository;
import sample.jpa.app.entity.associations.m_n.Tag;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyInsertTests {


	@Autowired
	PostRepository repository;
	
	@Test
	public void insert() {
		log.info("INSERT - M:N post");
		
		Post post = Post.createPost("HAHAHA");
		post.addTag(Tag.createTag("N!"));
		post.addTag(Tag.createTag("N2!"));
		post.addTag(Tag.createTag("N3!"));
		
		repository.save(post);
		
	}
}

