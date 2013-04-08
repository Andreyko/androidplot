/*
 * Copyright 2013 AndroidPlot.com
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.androidplot.pie;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.androidplot.exception.PlotRenderException;
import com.androidplot.ui.SizeMetric;
import com.androidplot.ui.SizeMetrics;
import com.androidplot.ui.widget.Widget;

/**
 * Visualizes data as a pie chart.
 */
public class PieWidget extends Widget {

    private PieChart pieChart;

    public PieWidget(PieChart pieChart, SizeMetrics metrics) {
        super(metrics);
        this.pieChart = pieChart;
    }

    @Override
    protected void doOnDraw(Canvas canvas, RectF widgetRect) throws PlotRenderException {
        // this is all throwaway but it displays a pretty circle for now...
        Paint p = new Paint();
        p.setStrokeWidth(3);
        p.setColor(Color.WHITE);
        float rad = widgetRect.width() < widgetRect.height() ? widgetRect.width()/2 : widgetRect.height()/2;
        canvas.drawCircle(widgetRect.centerX(), widgetRect.centerY(), rad, p);
    }
}
