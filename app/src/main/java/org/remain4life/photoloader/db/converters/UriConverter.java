package org.remain4life.photoloader.db.converters;

import android.arch.persistence.room.TypeConverter;
import android.net.Uri;

import org.remain4life.photoloader.helpers.Application;

public class UriConverter {
    @TypeConverter
    public static Uri toUri(String data) {
        return Application.GSON.fromJson(data, Uri.class);
    }

    @TypeConverter
    public static String fromUri(Uri uri) {
        return Application.GSON.toJson(uri);
    }
}
