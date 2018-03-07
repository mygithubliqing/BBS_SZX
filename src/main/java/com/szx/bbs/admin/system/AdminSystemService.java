package com.szx.bbs.admin.system;

import com.szx.bbs.common.model.SiteInfo;

public class AdminSystemService
{
	public static final AdminSystemService me = new AdminSystemService();
	final SiteInfo siteDao = new SiteInfo().dao();
	
	public SiteInfo getSiteInfo()
	{
		SiteInfo siteInfo = siteDao.findFirst("select * from site_info where id=1");
		
		return siteInfo;
	}
	
}
