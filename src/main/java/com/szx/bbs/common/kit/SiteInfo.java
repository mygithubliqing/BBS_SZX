package com.szx.bbs.common.kit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SiteInfo
{

    private static final String keywords = "双子星网上商城，优选全球千万品质商品，囊括食品饮料，进口美食，服饰箱包，手机数码，厨卫清洁，母婴玩具，营养保健，家居家纺等品类";
    private static final String description = "双子星网上商城";
    private static final String title = "双子星论坛【双子星网上商城-优选全球千万品质商品】";
    private static final String logo = "/upload/logo/mb_big.png";

    public static String getDescription() {
        return description;
    }

    public static String getTitle() {
        return title;
    }

    public static String getLogo() {
        return logo;
    }

    public static String getKeywords() {

        return keywords;
    }
}
