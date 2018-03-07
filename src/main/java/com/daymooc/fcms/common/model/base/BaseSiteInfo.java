package com.daymooc.fcms.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSiteInfo<M extends BaseSiteInfo<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public void setDescription(java.lang.String description) {
		set("description", description);
	}

	public java.lang.String getDescription() {
		return get("description");
	}

	public void setKeywords(java.lang.String keywords) {
		set("keywords", keywords);
	}

	public java.lang.String getKeywords() {
		return get("keywords");
	}

	public void setLogo(java.lang.String logo) {
		set("logo", logo);
	}

	public java.lang.String getLogo() {
		return get("logo");
	}

}
