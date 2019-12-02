package com.bawei.lianxi01.view.fragment;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import com.bawei.lianxi01.R;
import com.bawei.lianxi01.base.BaseFragment;
import com.bawei.lianxi01.contract.IMyContract;
import com.bawei.lianxi01.model.bean.Lawyer;
import com.bawei.lianxi01.netstate.NetState;
import com.bawei.lianxi01.netutile.Netutile;
import com.bawei.lianxi01.presenter.MyPresenter;
import com.bawei.lianxi01.view.adapter.MyAdapter;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * date:2019/12/2
 * author:张博一(zhangboyi)
 * function:
 */
public class MyFragment extends BaseFragment implements IMyContract.IView {

    private GridView gridView;
    private MyPresenter myPresenter;


    @Override
    protected void initView(View inflate) {
        gridView = inflate.findViewById(R.id.grid);
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initData() {
        myPresenter = new MyPresenter();
        myPresenter.getMyData(this);
    }


    @Override
    public void onMySuccsess(Lawyer lawyer) {
        Toast.makeText(getActivity(), "请求成功", Toast.LENGTH_SHORT).show();
        gridView.setAdapter(new MyAdapter(lawyer.getData()));
    }

    @Override
    public void onMyFailure(Throwable throwable) {

        Toast.makeText(getActivity(), "请求失败", Toast.LENGTH_SHORT).show();
    }
}
