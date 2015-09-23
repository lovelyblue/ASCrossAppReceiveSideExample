package com.example.lovelyblue.ascrossappreceivesideexample.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.lovelyblue.ascrossappreceivesideexample.R;

public class ReceiveActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_receive_activity3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle bundle = this.getIntent().getExtras();
        Toast.makeText(this, bundle.getString("name"), Toast.LENGTH_LONG).show();
    }

    public void btnActivity3BackPressed(View view)
    {
        setResult(RESULT_OK);
        finish();
    }

    public void btnActivity3CancelPressed(View view)
    {
        setResult(RESULT_CANCELED);
        finish();
    }

    public void btnActivity3SelfDefaultPressed(View view)
    {
        Intent intent = new Intent();
//        Bundle bundle = new Bundle();
//        bundle.putString("result","true");
        intent.putExtra("result","true");
        setResult(806449,intent);
        finish();
    }
}
