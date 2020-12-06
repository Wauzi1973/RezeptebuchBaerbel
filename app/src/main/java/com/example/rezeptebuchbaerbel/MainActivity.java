package com.example.rezeptebuchbaerbel;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity  {

    private AppBarConfiguration mAppBarConfiguration;
    NavigationView navigationView;
    DrawerLayout drawer;
    View view;
    Resources resources;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = findViewById(R.id.fragment_übersicht);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hier ist Baustelle sagt der Wauzi", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
         drawer = findViewById(R.id.drawer_layout);
         navigationView = findViewById(R.id.nav_view);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
               R.id.nav_übersicht,R.id.nav_about,R.id.nav_lizenzen)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        item.setChecked(true);
        int id = item.getItemId();

        switch (id) {
            case R.id.action_uebersicht:
                Toast.makeText(this,"Wauzi ist noch nicht soweit",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Nullable
    public void setToolbar(int fragmentId){

        resources = getResources();
        switch (fragmentId){
            case R.id.fragment_übersicht:
                toolbar.setBackgroundColor(resources.getColor(R.color.colorToolbarÜbersicht,null));
                return;
            case R.id.fragment_rezepte:
                toolbar.setBackgroundColor(resources.getColor(R.color.colorToolbarRezepte,null));
                return;
            case R.id.fragment_zutaten:
                toolbar.setBackgroundColor(resources.getColor(R.color.colorToolbarZutaten,null));
                return;
            default:
                return;
        }
    }

    @Nullable
    public void setToolbar(int fragmentId,String schütze){

        resources = getResources();
        switch (fragmentId){

            case R.id.fragment_about:
                toolbar.setBackgroundColor(resources.getColor(R.color.colorToolbarImpressum,null));
                toolbar.setTitle(schütze);
                return;
            case R.id.fragment_lizenzen:
                toolbar.setBackgroundColor(resources.getColor(R.color.colorToolbarLizenzen,null));
                toolbar.setTitle(schütze);
                return;
            default:
        }
    }
}
