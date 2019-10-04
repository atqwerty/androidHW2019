package com.example.reddit.ui.feedHome;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.reddit.MainActivity;
import com.example.reddit.Post;
import com.example.reddit.R;
import com.example.reddit.RecyclerViewAdapter;
import com.example.reddit.SecondActivity;

import java.util.ArrayList;

public class FeedHomeFragment extends Fragment {

    private FeedHomeViewModel mViewModel;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;

    public static FeedHomeFragment newInstance() {
        return new FeedHomeFragment();
    }

    private RecyclerViewAdapter.ItemClickListener itemClickListener = new RecyclerViewAdapter.ItemClickListener() {
        @Override
        public void onItemClick(String item, int position) {
            Intent intent = new Intent(getActivity(), SecondActivity.class);
            intent.putExtra("person_name", item);
            startActivity(intent);
        }
    };

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.feed_home_fragment, container, false);

        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<Post> data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data.add(new Post("r/AskReddit", "u/ATqwerty", "11.11.11", "random text"));
        }

        adapter= new RecyclerViewAdapter(data, itemClickListener);
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FeedHomeViewModel.class);
        // TODO: Use the ViewModel
    }

}
