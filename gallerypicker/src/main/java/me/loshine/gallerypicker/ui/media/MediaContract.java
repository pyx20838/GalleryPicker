package me.loshine.gallerypicker.ui.media;

import java.util.List;

import me.loshine.gallerypicker.entity.MediaBucket;
import me.loshine.gallerypicker.entity.MediaFile;

/**
 * 描    述：相册契约类
 * 作    者：loshine1992@gmail.com
 * 时    间：2016/12/22
 */
public interface MediaContract {

    interface View {

        void onLoadComplete(int size);

        void onReloadComplete();

        void onLoadBucketsComplete();
    }

    interface Presenter {

        List<MediaFile> getItems();

        List<MediaBucket> getBucketList();

        void load(boolean isFirst);

        void reloadMediaList(MediaBucket mediaBucket);
    }
}
