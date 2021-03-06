package com.example.rezeptebuchbaerbel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.example.rezeptebuchbaerbel.database.DatabaseClass;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.room.Room;

import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class MainActivity extends AppCompatActivity  {

    private AppBarConfiguration mAppBarConfiguration;
    NavigationView navigationView;
    DrawerLayout drawer;
    View view;
    Context context;
    Resources resources;
    Toolbar toolbar;

    private static final int WRITE_PERMISSION_CODE = 1;
    private static final int MANAGE_PERMISSION_CODE = 2;
    private static final int Clear_PERMISSION_CODE = 999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = findViewById(R.id.fragment_übersicht);
        context = getApplicationContext();
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
               R.id.nav_übersicht, R.id.nav_share,R.id.nav_about,R.id.nav_lizenzen)
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

    public static DatabaseClass databaseClassMainActivity(Context context){
        return Room.databaseBuilder(context, DatabaseClass.class,"DatabaseRezepte")
                .allowMainThreadQueries()
                .build();
    }

    public static void checkPermission(Activity activity, Context context, String permission, int requestCode){
        if (ContextCompat.checkSelfPermission(context,permission) == PackageManager.PERMISSION_DENIED){
            //Requesting the permission
            ActivityCompat.requestPermissions(activity,new String[]{permission},requestCode);
        }
    }


    public static boolean checkPermission(Context context) {
        int result = ContextCompat.checkSelfPermission(context, WRITE_EXTERNAL_STORAGE);
        return result == PackageManager.PERMISSION_GRANTED;
    }


    private void askAllPermission() {
        //Zugriff auf alle Dateien zulassen
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            if (!Environment.isExternalStorageManager()) {
                Uri uri = Uri.parse("package:" + BuildConfig.APPLICATION_ID);
                Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION, uri);
                startActivity(intent);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == WRITE_PERMISSION_CODE){
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(context, "Write Permission successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Write Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }

        if (requestCode == MANAGE_PERMISSION_CODE){
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(context, "Manage Permission successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Manage Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }

        if (requestCode == Clear_PERMISSION_CODE){
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(context, "Manage Permission successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Manage Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
