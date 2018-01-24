package com.buttercell.todoapp.adapter;

import android.view.View;

/**
 * Created by amush on 24-Jan-18.
 */

public interface ItemClickListener {

    void onClick(View view,int position,boolean isLongClick);
}
