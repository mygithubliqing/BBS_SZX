package com.szx.bbs.newsfeed;

import com.szx.bbs.common.controller.BaseController;
import com.szx.bbs.common.interceptor.FrontAuthInterceptor;
import com.szx.bbs.common.model.NewsFeed;
import com.szx.bbs.friend.FriendInterceptor;
import com.jfinal.aop.Before;
import com.jfinal.plugin.activerecord.Page;

@Before({FrontAuthInterceptor.class, FriendInterceptor.class})
public class NewsFeedController extends BaseController
{

	static NewsFeedService srv = NewsFeedService.me;
	static NewsFeedReplyService newsFeedReplyService = NewsFeedReplyService.me;
	
	public void referMe() {
		Page<NewsFeed> newsFeedPage = ReferMeService.me.paginate(getLoginAccountId(), getParaToInt("p", 1));
		RemindService.me.resetRemindOfReferMe(getLoginAccountId()); // 重置提醒 remind 的 referMe 字段
		setAttr("newsFeedPage", newsFeedPage);
		setAttr("paginateLink", "/my/referMe?p=");      // 用于指定重用页面分页宏所使用的 link
		render("index.html");
	}
}
