package com.bawei.lianxi01.view.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.lianxi01.R;
import com.bawei.lianxi01.base.BaseFragment;
import com.bawei.lianxi01.netstate.NetState;

/**
 * date:2019/12/2
 * author:张博一(zhangboyi)
 * function:
 */
public class HomeFragment extends BaseFragment {

    private TextView textView;
    private ImageView imageView;

    @Override
    protected void initView(View inflate) {
        imageView = inflate.findViewById(R.id.home_image);
        textView = inflate.findViewById(R.id.home_name);
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initData() {
        if (NetState.getInstance().hasNet(getActivity())){
            imageView.setVisibility(View.GONE);
            textView.setVisibility(View.VISIBLE);
        }else {
            imageView.setVisibility(View.VISIBLE);
            textView.setVisibility(View.GONE);
        }
    }
}
