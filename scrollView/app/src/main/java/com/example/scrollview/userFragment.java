package com.example.scrollview;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.scrollview.modal.Subject;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class userFragment extends Fragment {
    RecyclerView recyclerView;
    ConstraintLayout expandableView;
    Button arrowBtn;
    CardView cardView;
    public userFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);


        expandableView = view.findViewById(R.id.expandableView);
        arrowBtn = view.findViewById(R.id.arrowBtn);
        cardView = view.findViewById(R.id.cardView);
        recyclerView = view.findViewById(R.id.sub_recyclerview);


        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        List<Subject> subjects = new ArrayList<Subject>();
        for(int i= 0 ; i<6;i++)
        {subjects.add(new Subject());}


        subjectAdapter1 subjectAdapter = new subjectAdapter1(getContext(),subjects);
        recyclerView.setAdapter(subjectAdapter);
        if(arrowBtn!=null) {

        }

        return view;
    }
}
