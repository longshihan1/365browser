// Copyright 2015 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.widget;

import android.view.View;

import org.chromium.chrome.browser.compositor.layouts.eventfilter.EdgeSwipeHandler;
import org.chromium.ui.resources.dynamics.ViewResourceAdapter;

/**
 * Interface that defines the responsibilities of the layout container for the top controls.
 * <p>
 * Concrete implementations of this class must extend ViewGroup.
 */
public interface ControlContainer {
    /**
     * @return The {@link ViewResourceAdapter} that exposes this {@link View} as a CC resource.
     */
    ViewResourceAdapter getToolbarResourceAdapter();

    /**
     * Get progress bar drawing information.
     * @param drawingInfoOut An instance that the result will be written.
     */
    void getProgressBarDrawingInfo(ClipDrawableProgressBar.DrawingInfo drawingInfoOut);

    /**
     * @param handler The swipe handler to be notified of swipe events on this container.
     */
    void setSwipeHandler(EdgeSwipeHandler handler);
}
