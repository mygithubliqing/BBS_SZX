package com.szx.bbs.video;

import com.szx.bbs.common.account.AccountService;
import com.szx.bbs.common.model.Posts;
import com.jfinal.plugin.activerecord.Page;

public class VideoService
{
	public static final VideoService me = new VideoService();
	final Posts postDao = new Posts().dao();
	int pageSize = 9;
	
	public Page<Posts> getVideos(int pageNum)
	{
		String select = "select * ";
		String from = "from posts where post_type=? and status=? order by createAt desc";
		Page<Posts> postPage = postDao.paginate(pageNum, pageSize, select, from,Posts.VIDEO, Posts.STATUS_PUB);
		
		AccountService.me.join("userId", postPage.getList(), "nickName", "avatar");

		return postPage;
	}
}
