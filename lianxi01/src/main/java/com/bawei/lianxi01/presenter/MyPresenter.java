package com.bawei.lianxi01.presenter;

import com.bawei.lianxi01.contract.IMyContract;
import com.bawei.lianxi01.model.MyModel;
import com.bawei.lianxi01.model.bean.Lawyer;

/**
 * date:2019/12/2
 * author:张博一(zhangboyi)
 * function:
 */
public class MyPresenter {

    public void getMyData(final IMyContract.IView iView){
        MyModel myModel = new MyModel();
        myModel.getMyData(new IMyContract.IModelCallBack() {
            @Override
            public void onMySuccsess(Lawyer lawyer) {
                iView.onMySuccsess(lawyer);
            }

            @Override
            public void onMyFailure(Throwable throwable) {
                iView.onMyFailure(throwable);
            }
        });
    }
}
