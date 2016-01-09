package rs.etf.mv153095.komunikator_master.binders;

import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import rs.etf.mv153095.komunikator_master.R;

/**
 * Created by Verica Milanovic on 09.01.2016..
 */
public class TermItemBinder implements SimpleCursorAdapter.ViewBinder {
    @Override
    public boolean setViewValue(View view, Cursor cursor, int columnIndex) {
        if (view.getId() == R.id.ImageView_termImage) {
            // fetch path from DB
            String path = "";

            ImageView iv = (ImageView) view;

            // set image to imageView
            iv.setImageDrawable(Drawable.createFromPath(path));
            // set onClick listener - depends on role
            iv.setOnClickListener(null);
            // TODO: check if it's necessary
            iv.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

            return true;
        } else if (view.getId() == R.id.TextView_termName) {
            // fetch profile name from DB
            String profile_name = "";

            TextView tv = (TextView) view;
            //tv.setText(cursor.getString(cursor.getColumnIndex(DBContract.CommunicatorOption.COLUMN_NAME_TEXT)));

            // set profile name to textView
            tv.setText(profile_name);

            return true;
        }
        return false;

    }
}
