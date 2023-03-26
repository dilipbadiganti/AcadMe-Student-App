package com.finalproject.acadme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.finalproject.acadme.ebook.EbookActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private BottomNavigationView bottomNavigationView;
    private NavController navController;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO

        //PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO

        //PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO
        //PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO
        //PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO
        //PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO
        //PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO
        //PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO
        //PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO PROJECT EXPO

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navController = Navigation.findNavController(this, R.id.frame_layout);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigation_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.start, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);
//        drawerLayout = findViewById(R.id.drawerLayout);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);



    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return true;

    }




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.navigation_eLibrary:
                startActivity(new Intent(this, EbookActivity.class));
                break;
//            case R.id.navigation_video:
//                Toast.makeText(this, "Online lectures", Toast.LENGTH_SHORT).show();
//                break;
            case R.id.navigation_results:
                startActivity(new Intent(this, Results.class));
                break;
            case R.id.navigation_website:
                startActivity(new Intent(this, Website.class));
                break;
            case R.id.navigation_feedback:
                startActivity(new Intent(this, Feedback.class));
                break;
            case R.id.navigation_developer:
                startActivity(new Intent(this, Developers.class));
                break;

        }



        return true;
    }
}