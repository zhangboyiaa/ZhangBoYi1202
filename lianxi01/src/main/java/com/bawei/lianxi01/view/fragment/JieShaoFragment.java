package com.bawei.lianxi01.view.fragment;

import android.view.View;
import android.widget.Button;

import com.bawei.lianxi01.R;
import com.bawei.lianxi01.base.BaseFragment;
import com.bawei.lianxi01.view.activity.MainActivity;

/**
 * date:2019/12/2
 * author:张博一(zhangboyi)
 * function:
 */
public class JieShaoFragment extends BaseFragment {

    private Button button;

    @Override
    protected void initView(View inflate) {
        button = inflate.findViewById(R.id.buu);
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_jieshao;
    }

    @Override
    protected void initData() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.tiao();
            }
        });
    }
}
