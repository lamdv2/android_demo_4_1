package com.example.demo_app_4_1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new Favorite();
            case 2:
                return new DetailItemFragment();
            case 0:
            default:
                return new ListItemFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
