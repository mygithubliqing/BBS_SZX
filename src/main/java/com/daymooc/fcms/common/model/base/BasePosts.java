package com.daymooc.fcms.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePosts<M extends BasePosts<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setUserId(java.lang.Integer userId) {
		set("userId", userId);
	}

	public java.lang.Integer getUserId() {
		return get("userId");
	}

	public void setComments(java.lang.Integer comments) {
		set("comments", comments);
	}

	public java.lang.Integer getComments() {
		return get("comments");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}

	public java.lang.String getContent() {
		return get("content");
	}

	public void setCreateAt(java.util.Date createAt) {
		set("createAt", createAt);
	}

	public java.util.Date getCreateAt() {
		return get("createAt");
	}

	public void setImages(java.lang.String images) {
		set("images", images);
	}

	public java.lang.String getImages() {
		return get("images");
	}

	public void setTags(java.lang.String tags) {
		set("tags", tags);
	}

	public java.lang.String getTags() {
		return get("tags");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public void setViews(java.lang.Integer views) {
		set("views", views);
	}

	public java.lang.Integer getViews() {
		return get("views");
	}

	public void setLikeCount(java.lang.Integer likeCount) {
		set("likeCount", likeCount);
	}

	public java.lang.Integer getLikeCount() {
		return get("likeCount");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

	public void setSummary(java.lang.String summary) {
		set("summary", summary);
	}

	public java.lang.String getSummary() {
		return get("summary");
	}

	public void setPostType(java.lang.Integer postType) {
		set("post_type", postType);
	}

	public java.lang.Integer getPostType() {
		return get("post_type");
	}

	public void setLastImages(java.lang.String lastImages) {
		set("last_images", lastImages);
	}

	public java.lang.String getLastImages() {
		return get("last_images");
	}

	public void setVideo(java.lang.String video) {
		set("video", video);
	}

	public java.lang.String getVideo() {
		return get("video");
	}

	public void setArticleType(java.lang.Integer articleType) {
		set("article_type", articleType);
	}

	public java.lang.Integer getArticleType() {
		return get("article_type");
	}

	public void setPrivacy(java.lang.Integer privacy) {
		set("privacy", privacy);
	}

	public java.lang.Integer getPrivacy() {
		return get("privacy");
	}

}
