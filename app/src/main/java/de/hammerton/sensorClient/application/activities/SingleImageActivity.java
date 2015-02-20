package de.hammerton.sensorClient.application.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import de.hammerton.sensorClient.R;
import de.hammerton.sensorClient.application.adapters.ImageAdapter;
import de.hammerton.sensorClient.application.models.Image;


public class SingleImageActivity extends BaseActionBarActivity {
    @Inject
    ImageAdapter imageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_image);

        // Get the intent
        Intent intent = getIntent();

        // Select the image id
        int position = intent.getExtras().getInt("position");
        Image image = (Image) imageAdapter.getItem(position);

        // Set ImageView
        ImageView imageView = (ImageView) findViewById(R.id.singleImageView);
        imageView.setImageResource(image.getId());

        // Set TextView
        TextView positionTextView = (TextView) findViewById(R.id.singleImagePositionTextView);
        positionTextView.setText(String.valueOf(position));

        TextView dateTextView = (TextView) findViewById(R.id.singleImageDateTextView);
        // todo remove static date and use date from Image
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateTextView.setText(sdf.format(new Date()));

        TextView nameTextView = (TextView) findViewById(R.id.singleImageNameTextView);
        nameTextView.setText(image.getName());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
