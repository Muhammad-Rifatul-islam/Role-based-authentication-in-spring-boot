package bd.edu.rifat.group.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POSTS")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int postId;
	private String subject;
	private String description;
	private String userName;
	
	@Enumerated(EnumType.STRING)
	private PostStatus status;
	
	public Post() {
	
	}

	public Post(String subject, String description, String userName, PostStatus status) {
		super();
		this.subject = subject;
		this.description = description;
		this.userName = userName;
		this.status = status;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public PostStatus getStatus() {
		return status;
	}

	public void setStatus(PostStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", subject=" + subject + ", description=" + description + ", userName="
				+ userName + ", status=" + status + "]";
	}

}
