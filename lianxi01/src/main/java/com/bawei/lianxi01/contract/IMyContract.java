package com.bawei.lianxi01.contract;

import com.bawei.lianxi01.model.bean.Lawyer;

/**
 * date:2019/12/2
 * author:张博一(zhangboyi)
 * function:
 */
public interface IMyContract {

    //m通知p
    interface IModelCallBack{
        void onMySuccsess(Lawyer lawyer);

        void onMyFailure(Throwable throwable);
    }

    //p通知v
    interface IView{
        void onMySuccsess(Lawyer lawyer);

        void onMyFailure(Throwable throwable);
    }

}
