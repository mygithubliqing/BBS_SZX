package com.szx.bbs.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseReferMe<M extends BaseReferMe<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setReferAccountId(java.lang.Integer referAccountId) {
		set("referAccountId", referAccountId);
	}

	public java.lang.Integer getReferAccountId() {
		return get("referAccountId");
	}

	public void setNewsFeedId(java.lang.Integer newsFeedId) {
		set("newsFeedId", newsFeedId);
	}

	public java.lang.Integer getNewsFeedId() {
		return get("newsFeedId");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}

	public java.lang.Integer getType() {
		return get("type");
	}

	public void setCreateAt(java.util.Date createAt) {
		set("createAt", createAt);
	}

	public java.util.Date getCreateAt() {
		return get("createAt");
	}

}
