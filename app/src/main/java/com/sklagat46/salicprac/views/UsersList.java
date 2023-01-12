package com.sklagat46.salicprac.views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sklagat46.salicprac.R;
import com.sklagat46.salicprac.viewmodels.UserViewModel;


public class UsersList extends Fragment {

    private  View view;


    public UsersList() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_users_list, container, false);
        return view;

    }
}