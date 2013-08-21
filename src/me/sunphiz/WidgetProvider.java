package me.sunphiz;

import me.sunphiz.adapterviewflipperwidget.R;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.RemoteViews;

public class WidgetProvider extends AppWidgetProvider {

	private static final String TAG = WidgetProvider.class.getSimpleName();

	public static final String REFRESH_ACTION = "me.sunphiz.apdapterviewflipperwidget.REFRESH";
	public static final String NEXT_ACTION = "me.sunphiz.apdapterviewflipperwidget.NEXT";

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		Log.i(TAG, "onUpdate()");

		for (int id : appWidgetIds) {

			RemoteViews rv = new RemoteViews(context.getPackageName(),
					R.layout.adapterviewflipper);

			// Specify the service to provide data for the collection widget.
			// Note that we need to
			// embed the appWidgetId via the data otherwise it will be ignored.
			final Intent intent = new Intent(context, WidgetService.class);
			intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, id);
			intent.setData(Uri.parse(intent.toUri(Intent.URI_INTENT_SCHEME)));
			rv.setRemoteAdapter(R.id.page_flipper, intent);

			// Bind the click intent for the next button on the widget
			final Intent nextIntent = new Intent(context,
					WidgetProvider.class);
			nextIntent.setAction(WidgetProvider.NEXT_ACTION);
			nextIntent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, id);
			final PendingIntent nextPendingIntent = PendingIntent
					.getBroadcast(context, 0, nextIntent,
							PendingIntent.FLAG_UPDATE_CURRENT);
			rv.setOnClickPendingIntent(R.id.next, nextPendingIntent);

			// Bind the click intent for the refresh button on the widget
			final Intent refreshIntent = new Intent(context,
					WidgetProvider.class);
			refreshIntent.setAction(WidgetProvider.REFRESH_ACTION);
			final PendingIntent refreshPendingIntent = PendingIntent
					.getBroadcast(context, 0, refreshIntent,
							PendingIntent.FLAG_UPDATE_CURRENT);
			rv.setOnClickPendingIntent(R.id.refresh, refreshPendingIntent);

			appWidgetManager.updateAppWidget(id, rv);
		}

		super.onUpdate(context, appWidgetManager, appWidgetIds);
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i(TAG, "onUpdate()");

		final String action = intent.getAction();

		if (action.equals(REFRESH_ACTION)) {
			final AppWidgetManager mgr = AppWidgetManager.getInstance(context);
			final ComponentName cn = new ComponentName(context,
					WidgetProvider.class);
			mgr.notifyAppWidgetViewDataChanged(mgr.getAppWidgetIds(cn),
					R.id.page_flipper);
		}
		if (action.equals(NEXT_ACTION)) {
			RemoteViews rv = new RemoteViews(context.getPackageName(),
					R.layout.adapterviewflipper);

			rv.showNext(R.id.page_flipper);

			AppWidgetManager.getInstance(context).partiallyUpdateAppWidget(
					intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID,
							AppWidgetManager.INVALID_APPWIDGET_ID), rv);
		}

		super.onReceive(context, intent);
	}
}
