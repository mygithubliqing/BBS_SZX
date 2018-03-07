package com.szx.bbs.index;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import com.szx.bbs.blog.BlogService;
import com.szx.bbs.common.account.AccountService;
import com.szx.bbs.common.controller.BaseController;
import com.szx.bbs.common.model.ArticleType;
import com.szx.bbs.common.model.Posts;
import com.szx.bbs.common.model.Tags;
import com.szx.bbs.common.model.User;
import com.szx.bbs.tags.TagsService;
import com.jfinal.plugin.activerecord.Page;

public class IndexController extends BaseController
{
	private static final BlogService blogSrv = BlogService.me;
	private static final AccountService accountSrv = AccountService.me;
	private static final TagsService tagSrv = TagsService.me;
	private static final IndexService indexSrv = IndexService.me;
	public void index()
	{
		Page<Posts> postPage= blogSrv.getArticles(getParaToInt("p", 1));
		List<User> hotUsers = accountSrv.getHotUsers();
		List<Tags> hotTags = tagSrv.getHotTags(20);
		List<Posts> hotPosts = blogSrv.getHotPost(8);
		List<Posts> newPosts = blogSrv.getNewestPost(8);
		List<ArticleType> articleTypes = indexSrv.getArticleTypes();
		setAttr("postPage", postPage);
		setAttr("hotUsers", hotUsers);
		setAttr("hotTags", hotTags);
		setAttr("articleTypes", articleTypes);
		setAttr("hotPosts", hotPosts);
		setAttr("newPosts", newPosts);
		render("index.html");
	}
	
	public void hot()
	{
		Page<Posts> postPage= blogSrv.getHotArticles(getParaToInt("p", 1));
		List<User> hotUsers = accountSrv.getHotUsers();
		List<Tags> hotTags = tagSrv.getHotTags(20);
		List<Posts> hotPosts = blogSrv.getHotPost(8);
		List<Posts> newPosts = blogSrv.getNewestPost(8);
		List<ArticleType> articleTypes = indexSrv.getArticleTypes();
		setAttr("postPage", postPage);
		setAttr("hotUsers", hotUsers);
		setAttr("articleTypes", articleTypes);
		setAttr("hotTags", hotTags);
		setAttr("hotPosts", hotPosts);
		setAttr("newPosts", newPosts);
		render("hot.html");
	}
	
	public void postType() throws UnsupportedEncodingException
	{
		String postType = URLDecoder.decode(getPara(0),"UTF-8");
		Page<Posts> postPage = indexSrv.getPostPageByType(postType, getParaToInt("p",1));
		List<User> hotUsers = accountSrv.getHotUsers();
		List<Tags> hotTags = tagSrv.getHotTags(20);
		List<Posts> hotPosts = blogSrv.getHotPost(8);
		List<Posts> newPosts = blogSrv.getNewestPost(8);
		List<ArticleType> articleTypes = indexSrv.getArticleTypes();
		setAttr("articleTypes", articleTypes);
		setAttr("hotUsers", hotUsers);
		setAttr("hotTags", hotTags);
		setAttr("hotPosts", hotPosts);
		setAttr("newPosts", newPosts);
		setAttr("postPage", postPage);
		setAttr("postType", postType);
		render("view_type.html");
	}
	
	public void hotType() throws UnsupportedEncodingException
	{
		String postType = URLDecoder.decode(getPara(0),"UTF-8");
		Page<Posts> postPage = indexSrv.getHotPostPageByType(postType, getParaToInt("p",1));
		List<User> hotUsers = accountSrv.getHotUsers();
		List<Tags> hotTags = tagSrv.getHotTags(20);
		List<Posts> hotPosts = blogSrv.getHotPost(8);
		List<Posts> newPosts = blogSrv.getNewestPost(8);
		List<ArticleType> articleTypes = indexSrv.getArticleTypes();
		setAttr("articleTypes", articleTypes);
		setAttr("hotUsers", hotUsers);
		setAttr("hotTags", hotTags);
		setAttr("hotPosts", hotPosts);
		setAttr("newPosts", newPosts);
		setAttr("postPage", postPage);
		setAttr("postType", postType);
		render("hot_type.html");
	}
	
}
