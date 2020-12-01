package com.example.vaibansh.newsapp.ui.sources;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.vaibansh.newsapp.data.NewsRepository;
import com.example.vaibansh.newsapp.models.Source;
import com.example.vaibansh.newsapp.models.Specification;

import java.util.List;

public class SourceViewModel extends AndroidViewModel {
    private final NewsRepository newsRepository;

    public SourceViewModel(@NonNull Application application) {
        super(application);
        this.newsRepository = NewsRepository.getInstance(application.getApplicationContext());
    }

    LiveData<List<Source>> getSource(Specification specification) {
        return newsRepository.getSources(specification);
    }
}
