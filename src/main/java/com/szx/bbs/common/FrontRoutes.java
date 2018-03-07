package com.szx.bbs.common;

import com.szx.bbs.account.AccountController;
import com.szx.bbs.blog.BlogController;
import com.szx.bbs.comment.CommentController;
import com.szx.bbs.common.upload.UeUploadController;
import com.szx.bbs.friend.MyFriendController;
import com.szx.bbs.gallery.GalleryController;
import com.szx.bbs.home.HomeController;
import com.szx.bbs.index.IndexController;
import com.szx.bbs.like.LikeController;
import com.szx.bbs.login.LoginController;
import com.szx.bbs.message.MessageController;
import com.szx.bbs.post.PostController;
import com.szx.bbs.question.QuestionController;
import com.szx.bbs.reg.RegController;
import com.szx.bbs.search.SearchController;
import com.szx.bbs.tags.TagsController;
import com.szx.bbs.user.UserController;
import com.szx.bbs.video.VideoController;
import com.szx.bbs.view.ViewController;
import com.jfinal.config.Routes;

public class FrontRoutes extends Routes
{

	@Override
	public void config()
	{
		setBaseViewPath("/_view");
		
		add("/", IndexController.class, "/index");
		add("/index", IndexController.class);
		add("/upload", UeUploadController.class);//ueditor上传接口
		add("/login", LoginController.class);
		add("/reg", RegController.class);
		add("/video", VideoController.class);
		add("/question", QuestionController.class);
		add("/tags", TagsController.class);
		add("/gallery", GalleryController.class);
		add("/view", ViewController.class);
		add("/blog", BlogController.class);
		add("/post", PostController.class);
		add("/account", AccountController.class);
		add("/user", UserController.class);
		//我的消息
		add("/home/message", MessageController.class, "/home");
		//点赞
		add("/like", LikeController.class);
		//评论
		add("/comment", CommentController.class);
		//主页
		add("/home", HomeController.class);
		add("/friend", MyFriendController.class);
		//搜索
		add("/search", SearchController.class);
	}

}
