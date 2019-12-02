package com.bawei.lianxi01.model;

import android.graphics.Bitmap;

import com.bawei.lianxi01.contract.IMyContract;
import com.bawei.lianxi01.model.bean.Lawyer;
import com.bawei.lianxi01.netutile.Netutile;
import com.google.gson.Gson;

/**
 * date:2019/12/2
 * author:张博一(zhangboyi)
 * function:
 */
public class MyModel {

    public void getMyData(final IMyContract.IModelCallBack iModelCallBack){
        String url = "http://blog.zhaoliang5156.cn/api/shop/shop1.json";
        Netutile.getInstance().doGet(url, new Netutile.MyCallBack() {
            @Override
            public void ondoGetSuccsess(String json) {
                Lawyer lawyer = new Gson().fromJson(json, Lawyer.class);
                iModelCallBack.onMySuccsess(lawyer);
            }

            @Override
            public void ondoGetPhotoSuccsess(Bitmap bitmap) {

            }

            @Override
            public void onError(Throwable throwable) {
                iModelCallBack.onMyFailure(throwable);
            }
        });
    }
}
