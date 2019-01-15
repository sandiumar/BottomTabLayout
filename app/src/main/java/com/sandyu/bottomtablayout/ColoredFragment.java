package com.sandyu.bottomtablayout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ColoredFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_COLOR  = "color";
    private static final String ARG_TITLE  = "title";
    private String title;
    private int color;



    public ColoredFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ColoredFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ColoredFragment newInstance(int param1, String param2) {
        ColoredFragment fragment = new ColoredFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLOR, param1);
        args.putString(ARG_TITLE, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            color   = getArguments().getInt(ARG_COLOR);
            title   = getArguments().getString(ARG_TITLE);
        }
    }

    @Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.setBackgroundColor(getResources().getColor(color));
        ((TextView) view.findViewById(R.id.title)).setText(title);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_colored, container, false);
    }


}
