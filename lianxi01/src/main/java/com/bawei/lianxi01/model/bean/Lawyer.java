package com.bawei.lianxi01.model.bean;

import java.util.List;

/**
 * date:2019/12/2
 * author:张博一(zhangboyi)
 * function:
 */
public class Lawyer {
    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * currency_price : 锟�239
         * goods_name : HANACOMON鑺卞皬绾归纰熺ぜ鐩�5浠跺
         * goods_thumb : http://img.fulishe.com/images/201908/thumb_img/16838_thumb_G_1565071319409.jpeg
         * goods_english_name : ESTEE LAUDER 闆呰瘲鍏伴粵
         */

        private String currency_price;
        private String goods_name;
        private String goods_thumb;
        private String goods_english_name;

        public String getCurrency_price() {
            return currency_price;
        }

        public void setCurrency_price(String currency_price) {
            this.currency_price = currency_price;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public String getGoods_thumb() {
            return goods_thumb;
        }

        public void setGoods_thumb(String goods_thumb) {
            this.goods_thumb = goods_thumb;
        }

        public String getGoods_english_name() {
            return goods_english_name;
        }

        public void setGoods_english_name(String goods_english_name) {
            this.goods_english_name = goods_english_name;
        }
    }
}
