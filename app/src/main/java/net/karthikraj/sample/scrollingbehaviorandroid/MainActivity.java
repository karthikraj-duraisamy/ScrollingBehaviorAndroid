package net.karthikraj.sample.scrollingbehaviorandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchStdAppBarScrollsActivity(View button) {
        Intent newIntent = new Intent(MainActivity.this, StdAppBarScrollActivity.class);
        startActivity(newIntent);
    }

    public void launchStdAppBarStaysActivity(View button) {
        Intent newIntent = new Intent(MainActivity.this, StdAppBarStaysActivity.class);
        startActivity(newIntent);
    }

    public void launchAppBarTabsScrollsActivity(View button) {
        Intent newIntent = new Intent(MainActivity.this, AppBarWithTabsScrollsActivity.class);
        startActivity(newIntent);
    }

    public void launchAppBarTabStaysActivity(View button) {
        Intent newIntent = new Intent(MainActivity.this, AppBarWithTabsStaysActivity.class);
        startActivity(newIntent);
    }

    public void launchAppBarTabHidesActivity(View button) {
        Intent newIntent = new Intent(MainActivity.this, AppBarWithToolBarAndTabStaysActivity.class);
        startActivity(newIntent);
    }

    public void launchAppBarFlexiSpaceScrollsActivity(View button) {
        Intent newIntent = new Intent(MainActivity.this, AppBarFlexiSpaceScrollsActivity.class);
        startActivity(newIntent);
    }

    public void launchAppBarFlexiImageScrollsActivity(View button) {
        Intent newIntent = new Intent(MainActivity.this, AppBarFlexiImageScrollsActivity.class);
        startActivity(newIntent);
    }

    public void launchAppBarFlexiOverlappingActivity(View button) {
        Intent newIntent = new Intent(MainActivity.this, AppBarFlexiOverlappingActivity.class);
        startActivity(newIntent);
    }
}
