package com.szx.bbs.home;

import com.szx.bbs.common.account.AccountService;
import com.szx.bbs.common.model.Friend;
import com.szx.bbs.common.model.Posts;
import com.jfinal.plugin.activerecord.Page;

public class HomeService
{
	public static final HomeService me = new HomeService();
	final Posts postDao = new Posts().dao();
	final Friend friendDao = new Friend().dao();
	final int pageSize = 15;
	
	public Page<Posts> getFavorPosts(int userId, int pageNum)
	{
		String select = "select p.* ";
		String from = "from posts_like pl join posts p on pl.refId=p.id and pl.userId=?";
		
		Page<Posts> postPage = postDao.paginate(pageNum, pageSize, select, from, userId);
		
		AccountService.me.join("userId", postPage.getList(), "nickName", "avatar");
		
		return postPage;
	}
	
	//我的关注
	public Page<Friend> getFollows(int userId, int pageNum)
	{
		String select = "select f.*, count(p.id) as postNum ";
		String from = "from friend f join posts p on f.friendId=p.userId and f.userId=?";
		
		Page<Friend> followPage = friendDao.paginate(pageNum, pageSize, select, from, userId);
		
		AccountService.me.join("friendId", followPage.getList(), "nickName", "avatar");
		
		return followPage;
	}
	
	//我的粉丝
	public Page<Friend> getFans(int userId, int pageNum)
	{
		String select = "select f.*, count(p.id) as postNum ";
		String from = "from friend f join posts p on f.userId=p.userId and f.friendId=?";
		
		Page<Friend> fansPage = friendDao.paginate(pageNum, pageSize, select, from, userId);
		
		AccountService.me.join("userId", fansPage.getList(), "nickName", "avatar");
		
		return fansPage;
	}
	
}
