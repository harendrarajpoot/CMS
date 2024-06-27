package com.cms.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name="categories")
public class Category extends CreateAndUpdateDateAndTimeAudit {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int catId;
	@Column(length=100)
	private String catName;
	private String metaTag;
	private String url;
	private String discription;
	private String status;
	@OneToMany(mappedBy="categoryId" ,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Post> postId =new ArrayList<Post>();
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getMetaTag() {
		return metaTag;
	}
	public void setMetaTag(String metaTag) {
		this.metaTag = metaTag;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Post> getPostId() {
		return postId;
	}
	public void setPostId(List<Post> postId) {
		this.postId = postId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
