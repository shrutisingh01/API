package com.articleaggregator;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.articleaggregator.Adapters.NewsAdapter;
import com.articleaggregator.POJO.NewsPOJO;

import java.util.ArrayList;

public class ImportFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_import,null);
    }

    ArrayList<NewsPOJO> arrayList = new ArrayList<>();
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(manager);

        arrayList.add(new NewsPOJO("Twitter Headline","19/02/2018","The news that bots share on Twitter tends not to focus on politics"));
        arrayList.add(new NewsPOJO("Twitter Headline","19/02/2018","The news that bots share on Twitter tends not to focus on politics"));
        arrayList.add(new NewsPOJO("Twitter Headline","19/02/2018","The news that bots share on Twitter tends not to focus on politics"));
        arrayList.add(new NewsPOJO("Twitter Headline","19/02/2018","The news that bots share on Twitter tends not to focus on politics"));
        arrayList.add(new NewsPOJO("Twitter Headline","19/02/2018","The news that bots share on Twitter tends not to focus on politics"));
        arrayList.add(new NewsPOJO("Twitter Headline","19/02/2018","The news that bots share on Twitter tends not to focus on politics"));
        arrayList.add(new NewsPOJO("Twitter Headline","19/02/2018","The news that bots share on Twitter tends not to focus on politics"));
        arrayList.add(new NewsPOJO("Twitter Headline","19/02/2018","The news that bots share on Twitter tends not to focus on politics"));
        arrayList.add(new NewsPOJO("Twitter Headline","19/02/2018","The news that bots share on Twitter tends not to focus on politics"));
        arrayList.add(new NewsPOJO("Twitter Headline","19/02/2018","The news that bots share on Twitter tends not to focus on politics"));
        arrayList.add(new NewsPOJO("Twitter Headline","19/02/2018","The news that bots share on Twitter tends not to focus on politics"));
        arrayList.add(new NewsPOJO("Twitter Headline","19/02/2018","The news that bots share on Twitter tends not to focus on politics"));

        NewsAdapter adapter = new NewsAdapter(getContext(),arrayList);

        recyclerView.setAdapter(adapter);

    }
}
