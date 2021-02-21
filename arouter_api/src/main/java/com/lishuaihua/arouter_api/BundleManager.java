package com.lishuaihua.arouter_api;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityOptionsCompat;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 跳转时 ，用于参数的传递
 */
public class BundleManager {

    // Intent传输  携带的值，保存到这里
    private Bundle bundle = new Bundle();
    // Animation
    private Bundle optionsCompat;    // The transition animation of activity
    private int enterAnim;
    private int exitAnim;

    public Bundle getBundle() {
        return this.bundle;
    }


   
    /**
     * Inserts a boolean value into the mapping of this Bundle, replacing
     * any existing value for the given key.
     * @param key   a String, or null
     * @param value a boolean
     * @return current
     */
    public BundleManager withBoolean(@NonNull String key, @Nullable boolean value) {
        bundle.putBoolean(key, value);
        return this;
    }
    
    /**
     * Inserts a byte value into the mapping of this Bundle, replacing
     * any existing value for the given key.
     *
     * @param key   a String, or null
     * @param value a byte
     * @return current
     */
    public BundleManager withByte(@Nullable String key, byte value) {
        bundle.putByte(key, value);
        return this;
    }

    /**
     * Inserts a char value into the mapping of this Bundle, replacing
     * any existing value for the given key.
     *
     * @param key   a String, or null
     * @param value a char
     * @return current
     */
    public BundleManager withChar(@Nullable String key, char value) {
        bundle.putChar(key, value);
        return this;
    }

    /**
     * Inserts a String value into the mapping of this Bundle, replacing
     * any existing value for the given key.
     * @param key   a String, or null
     * @param value a String
     * @return current
     */
    public BundleManager withString(@NonNull String key, @Nullable String value) {
        bundle.putString(key, value);
        return this; // 链式调用效果 模仿开源框架
    }
    
    /**
     * Inserts a CharSequence value into the mapping of this Bundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key   a String, or null
     * @param value a CharSequence, or null
     * @return current
     */
    public BundleManager withCharSequence(@Nullable String key, @Nullable CharSequence value) {
        bundle.putCharSequence(key, value);
        return this;
    }
    
    /**
     * Inserts a short value into the mapping of this Bundle, replacing
     * any existing value for the given key.
     * @param key   a String, or null
     * @param value a short
     * @return current
     */
    public BundleManager withShort(@Nullable String key, short value) {
        bundle.putShort(key, value);
        return this;
    }

    /**
     * Inserts a int value into the mapping of this Bundle, replacing
     * any existing value for the given key.
     * @param key   a String, or int
     * @param value a int
     * @return current
     */
    public BundleManager withInt(@NonNull String key, @Nullable int value) {
        bundle.putInt(key, value);
        return this;
    }


    /**
     * Inserts a Long value into the mapping of this Bundle, replacing
     * any existing value for the given key.
     *
     * @param key   a String, or null
     * @param value a Long
     * @return current
     */
    public BundleManager withLong(@NonNull String key, @Nullable Long value) {
        bundle.putLong(key, value);
        return this;
    }

    /**
     * Inserts a float value into the mapping of this Bundle, replacing
     * any existing value for the given key.
     *
     * @param key   a String, or null
     * @param value a float
     * @return current
     */
    public BundleManager withFloat(@Nullable String key, float value) {
        bundle.putFloat(key, value);
        return this;
    }
    
    /**
     * Inserts a double value into the mapping of this Bundle, replacing
     * any existing value for the given key.
     *
     * @param key   a String, or null
     * @param value a double
     * @return current
     */
    public BundleManager withDouble(@Nullable String key, double value) {
        bundle.putDouble(key, value);
        return this;
    }


    /**
     * Inserts a Parcelable value into the mapping of this Bundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key   a String, or null
     * @param value a Parcelable object, or null
     * @return current
     */
    public BundleManager withParcelable(@Nullable String key, @Nullable Parcelable value) {
        bundle.putParcelable(key, value);
        return this;
    }

    

    /**
     * @param bundle
     * @return
     */
    public BundleManager withBundle(Bundle bundle) {
        this.bundle = bundle;
        return this;
    }



    // 直接完成跳转
    public Object navigation(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            return RouterManager.getInstance().navigation(context, this);
        }
        return null;
    }
 

   

   

  


 

  

  



  

    /**
     * Inserts an array of Parcelable values into the mapping of this Bundle,
     * replacing any existing value for the given key.  Either key or value may
     * be null.
     *
     * @param key   a String, or null
     * @param value an array of Parcelable objects, or null
     * @return current
     */
    public BundleManager withParcelableArray(@Nullable String key, @Nullable Parcelable[] value) {
        bundle.putParcelableArray(key, value);
        return this;
    }

    /**
     * Inserts a List of Parcelable values into the mapping of this Bundle,
     * replacing any existing value for the given key.  Either key or value may
     * be null.
     *
     * @param key   a String, or null
     * @param value an ArrayList of Parcelable objects, or null
     * @return current
     */
    public BundleManager withParcelableArrayList(@Nullable String key, @Nullable ArrayList<? extends Parcelable> value) {
        bundle.putParcelableArrayList(key, value);
        return this;
    }

    /**
     * Inserts a SparceArray of Parcelable values into the mapping of this
     * Bundle, replacing any existing value for the given key.  Either key
     * or value may be null.
     *
     * @param key   a String, or null
     * @param value a SparseArray of Parcelable objects, or null
     * @return current
     */
    public BundleManager withSparseParcelableArray(@Nullable String key, @Nullable SparseArray<? extends Parcelable> value) {
        bundle.putSparseParcelableArray(key, value);
        return this;
    }

    /**
     * Inserts an ArrayList value into the mapping of this Bundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key   a String, or null
     * @param value an ArrayList object, or null
     * @return current
     */
    public BundleManager withIntegerArrayList(@Nullable String key, @Nullable ArrayList<Integer> value) {
        bundle.putIntegerArrayList(key, value);
        return this;
    }

    /**
     * Inserts an ArrayList value into the mapping of this Bundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key   a String, or null
     * @param value an ArrayList object, or null
     * @return current
     */
    public BundleManager withStringArrayList(@Nullable String key, @Nullable ArrayList<String> value) {
        bundle.putStringArrayList(key, value);
        return this;
    }

    /**
     * Inserts an ArrayList value into the mapping of this Bundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key   a String, or null
     * @param value an ArrayList object, or null
     * @return current
     */
    public BundleManager withCharSequenceArrayList(@Nullable String key, @Nullable ArrayList<CharSequence> value) {
        bundle.putCharSequenceArrayList(key, value);
        return this;
    }

    /**
     * Inserts a Serializable value into the mapping of this Bundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key   a String, or null
     * @param value a Serializable object, or null
     * @return current
     */
    public BundleManager withSerializable(@Nullable String key, @Nullable Serializable value) {
        bundle.putSerializable(key, value);
        return this;
    }

    /**
     * Inserts a byte array value into the mapping of this Bundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key   a String, or null
     * @param value a byte array object, or null
     * @return current
     */
    public BundleManager withByteArray(@Nullable String key, @Nullable byte[] value) {
        bundle.putByteArray(key, value);
        return this;
    }

    /**
     * Inserts a short array value into the mapping of this Bundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key   a String, or null
     * @param value a short array object, or null
     * @return current
     */
    public BundleManager withShortArray(@Nullable String key, @Nullable short[] value) {
        bundle.putShortArray(key, value);
        return this;
    }

    /**
     * Inserts a char array value into the mapping of this Bundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key   a String, or null
     * @param value a char array object, or null
     * @return current
     */
    public BundleManager withCharArray(@Nullable String key, @Nullable char[] value) {
        bundle.putCharArray(key, value);
        return this;
    }

    /**
     * Inserts a float array value into the mapping of this Bundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key   a String, or null
     * @param value a float array object, or null
     * @return current
     */
    public BundleManager withFloatArray(@Nullable String key, @Nullable float[] value) {
        bundle.putFloatArray(key, value);
        return this;
    }

    /**
     * Inserts a CharSequence array value into the mapping of this Bundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key   a String, or null
     * @param value a CharSequence array object, or null
     * @return current
     */
    public BundleManager withCharSequenceArray(@Nullable String key, @Nullable CharSequence[] value) {
        bundle.putCharSequenceArray(key, value);
        return this;
    }

    /**
     * Inserts a Bundle value into the mapping of this Bundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key   a String, or null
     * @param value a Bundle object, or null
     * @return current
     */
    public BundleManager withBundle(@Nullable String key, @Nullable Bundle value) {
        bundle.putBundle(key, value);
        return this;
    }



    /**
     * Set options compat
     * @param compat compat
     * @return this
     */
    @RequiresApi(21)
    public BundleManager withOptionsCompat(ActivityOptionsCompat compat) {
        if (null != compat) {
            this.optionsCompat = compat.toBundle();
        }
        return this;
    }

    public int getEnterAnim() {
        return enterAnim;
    }

    public int getExitAnim() {
        return exitAnim;
    }

    /**
     * Set normal transition anim
     * @param enterAnim enter
     * @param exitAnim  exit
     * @return current
     */
    public BundleManager withTransition(int enterAnim, int exitAnim) {
        this.enterAnim = enterAnim;
        this.exitAnim = exitAnim;
        return this;
    }

}
