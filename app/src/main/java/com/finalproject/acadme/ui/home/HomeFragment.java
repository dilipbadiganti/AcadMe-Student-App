package com.finalproject.acadme.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.finalproject.acadme.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {


    private ImageSlider imageSlider;

    private ImageView map;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_home, container, false);


        imageSlider = view.findViewById(R.id.image_slider);

        ArrayList<SlideModel> images = new ArrayList<>();

        images.add(new SlideModel(R.drawable.ic_scroll_1, ScaleTypes.CENTER_CROP));
        images.add(new SlideModel(R.drawable.ic_scroll_2, ScaleTypes.CENTER_CROP));
        images.add(new SlideModel(R.drawable.ic_scroll_3, ScaleTypes.CENTER_CROP));
        images.add(new SlideModel(R.drawable.ic_scroll_4, ScaleTypes.CENTER_CROP));
        images.add(new SlideModel(R.drawable.ic_scroll_5, ScaleTypes.CENTER_CROP));



        imageSlider.setImageList(images, ScaleTypes.CENTER_CROP);

        map = view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });
        
        


        return view;



    }

    private void openMap() {

        Uri uri = Uri.parse("https://goo.gl/maps/dCNdrKcQJ9HGDY2Q9");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }
}