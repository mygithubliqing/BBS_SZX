package com.szx.bbs.common.model;

import com.szx.bbs.common.model.base.BaseReferMe;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class ReferMe extends BaseReferMe<ReferMe>
{
	public static final ReferMe	dao				= new ReferMe().dao();

	public static final int		TYPE_AT_ME		= 1;					// @我
	public static final int		TYPE_COMMENT_ME	= 2;					// 评论我
}