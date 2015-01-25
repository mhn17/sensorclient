package de.hammerton.noderestclient.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class GallerySquareImageView extends ImageView {

    public GallerySquareImageView(Context context) {
        super(context);
    }

    public GallerySquareImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GallerySquareImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        // set dimensions to width
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }
}
