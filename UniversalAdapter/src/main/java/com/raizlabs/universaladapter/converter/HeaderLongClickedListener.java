package com.raizlabs.universaladapter.converter;

import com.raizlabs.universaladapter.ViewHolder;

/**
 * Interface for a listener which is called when a {@link ViewGroupAdapterConverter} or {@link PagerAdapterConverter} header
 * view is long clicked.
 */
public interface HeaderLongClickedListener {

    /**
     * Called when a header within an adapter is long clicked.
     *
     * @param adapter      The adapter who's header was long clicked.
     * @param footerHolder The holder that contains the header
     * @param position     The position of the header within the header group
     * @return true if the callback consumed the click, false otherwise.
     */
    boolean onHeaderLongClicked(UniversalAdapter adapter, ViewHolder footerHolder, int position);
}
