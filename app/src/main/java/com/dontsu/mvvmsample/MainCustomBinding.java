package com.dontsu.mvvmsample;


import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.dontsu.mvvmsample.model.Person;
import com.dontsu.mvvmsample.view.MainAdapter;

import java.util.List;

public class MainCustomBinding {

    @SuppressWarnings("unchecked")
    @BindingAdapter("items")
    public static void setItems(RecyclerView recyclerView, List<Person> items) {
        MainAdapter adapter = (MainAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.setItems(items);
        }
    }
}
