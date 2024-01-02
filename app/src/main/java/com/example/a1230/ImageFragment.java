package com.example.a1230;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;

public class ImageFragment extends Fragment {
    private FragmentManager fragmentManager;
    public ImageFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_image, container, false);
        Bundle args = getArguments();
        if (args != null) {
            int imageResource = args.getInt("imageResource", 0);
            ImageView imageView = (ImageView) rootView.findViewById(R.id.imageview);
            imageView.setImageResource(imageResource);
        }

        return rootView;
    }

}