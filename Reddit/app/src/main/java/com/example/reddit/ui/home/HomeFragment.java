package com.example.reddit.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.reddit.R;
import com.example.reddit.ViewPagerAdapter;
import com.example.reddit.ui.feedHome.FeedHomeFragment;
import com.example.reddit.ui.feedPopular.FeedPopularFragment;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ViewPager viewPager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = root.findViewById(R.id.viewPager);

        addTabs(viewPager);
        ((TabLayout) root.findViewById(R.id.tabLayout)).setupWithViewPager( viewPager );

        return root;
    }

    private void addTabs(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFrag(new FeedHomeFragment(), "Home");
        adapter.addFrag(new FeedPopularFragment(), "Popular");
        viewPager.setAdapter(adapter);
    }
}