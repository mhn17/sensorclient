package de.hammerton.sensorClient.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import de.hammerton.sensorClient.ForActivity;
import de.hammerton.sensorClient.R;
import de.hammerton.sensorClient.models.Image;
import de.hammerton.sensorClient.models.ImageFactory;


public class ImageAdapter extends BaseAdapter {

    private List<Image> images = new ArrayList<>();
    private LayoutInflater inflater;

    // references to the images
    private Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };

    @Inject
    public ImageAdapter(@ForActivity Context context, ImageFactory imageFactory) {
        inflater = LayoutInflater.from(context);

        // set images
        int counter = 1;
        for (Integer drawableId : mThumbIds) {
            images.add(imageFactory.create(drawableId, "image " + counter));
            counter++;
        }

    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public Object getItem(int position) {
        return images.get(position);
    }

    @Override
    public long getItemId(int position) {
        return images.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ImageView imageView;
        TextView textView;

        if (view == null) {
            view = inflater.inflate(R.layout.gallery_square_image_item, parent, false);
            view.setTag(R.id.gallerySquareImage, view.findViewById(R.id.gallerySquareImage));
            view.setTag(R.id.gallerySquareImageText, view.findViewById(R.id.gallerySquareImageText));
        }

        imageView = (ImageView) view.getTag(R.id.gallerySquareImage);
        textView = (TextView) view.getTag(R.id.gallerySquareImageText);

        Image image = (Image) getItem(position);

        imageView.setImageResource(image.getId());
        textView.setText(image.getName());

        return view;
    }
}
