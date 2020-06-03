package ge.btu.db;

import ge.btu.db.model.*;
import ge.btu.db.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    PostRepository postRepository;


    @Autowired
    CommentRepository commentRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    AttachmentRepository attachmentRepository;

//    @Autowired
//    StudentRepository studentRepository;

    @GetMapping("test")
    public void test(){
        Post post =new Post();
        post.setTitle("სატესტო პოსტი!");
        post.setDescription("სატესტო აღწერა");
        post.setRate(5);
        post.setCreateDate(new Date());
        postRepository.save(post);

//        Student student =new Student();
//        student.setUserName("gg");
//        student.setFirstName("Gio");
//        student.setLastName("Giorgadze");
//        student.setAge(21);
//        studentRepository.save(student);

        System.out.println("Ok");
    }

    @GetMapping("addComment")
    public void addComment(){
        //        2
        Comment comment=new Comment();
        comment.setText("მაგარი პოსტია");
        comment.setPost(postRepository.getOne(2L));
        commentRepository.save(comment);
    }


    @GetMapping("getPosts")
    public void getPosts() {
        for (Post post : postRepository.findAll()) {
            System.out.println(post);
            //   System.out.println(post.getComments().get(0).getText()); // FetchType.EAGER აქედან მაგრად კიდია ესენი მაინც მოაქვს lazy -ზეც
        }
    }

    @GetMapping("getPost")
    public void getPost() {
        Post post = postRepository.getOne(3L);
        System.out.println(post.getTitle());
        System.out.println(post.getComments().get(0).getText());
    }

    @GetMapping("addCategory")
    public void addCategory() {
        Category category =new Category();
        category.setTitle("კატეგორია 1");
        Category category2 =new Category();
        category2.setTitle("კატეგორია 1");
        categoryRepository.save(category);
        categoryRepository.save(category2);
    }

    @GetMapping("addPost")
    public void addPost() {

        Post post =new Post();
        post.setTitle("დასრულებული პოსტი!");
        post.setDescription("დასრულებული აღწერა");
        post.setCreateDate(new Date());
//        post.setRate(5);

        List<Category> categories=new ArrayList<>();
        categories.add(categoryRepository.getOne(4L));
        categories.add(categoryRepository.getOne(5L));

        post.setCategories(categories);

        Attachment attachment=new Attachment();
        attachment.setImage("cover.jpg");
        post.setAttachment(attachment);

        postRepository.save(post);
        System.out.println("done");

//        4 5
    }

}
