package com.ladwa.aditya.offlinefirstapp.data;

import com.ladwa.aditya.offlinefirstapp.data.local.AppLocalDataStore;
import com.ladwa.aditya.offlinefirstapp.data.local.models.Post;
import com.ladwa.aditya.offlinefirstapp.data.remote.AppRemoteDataStore;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Aditya on 23-Oct-16.
 */

public class AppRepository implements AppDataStore {

    private AppLocalDataStore mAppLocalDataStore;
    private AppRemoteDataStore mAppRemoteDataStore;


    @Inject
    public AppRepository(AppLocalDataStore mAppLocalDataStore, AppRemoteDataStore mAppRemoteDataStore) {
        this.mAppLocalDataStore = mAppLocalDataStore;
        this.mAppRemoteDataStore = mAppRemoteDataStore;
    }

    @Override
    public Observable<List<Post>> getPost() {
        return null;
    }
}
