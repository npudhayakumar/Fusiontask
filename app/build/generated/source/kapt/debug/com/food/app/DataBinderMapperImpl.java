package com.food.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.food.app.databinding.ActivityHomeBindingImpl;
import com.food.app.databinding.ActivityMainBindingImpl;
import com.food.app.databinding.ActivitySplashBindingImpl;
import com.food.app.databinding.BookingadapterBindingImpl;
import com.food.app.databinding.DateadapterBindingImpl;
import com.food.app.databinding.FilteradapterBindingImpl;
import com.food.app.databinding.FragmentLoginBindingImpl;
import com.food.app.databinding.FragmentSampleBindingImpl;
import com.food.app.databinding.RejectadapterBindingImpl;
import com.food.app.databinding.UpcomingadapterBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYHOME = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYSPLASH = 3;

  private static final int LAYOUT_BOOKINGADAPTER = 4;

  private static final int LAYOUT_DATEADAPTER = 5;

  private static final int LAYOUT_FILTERADAPTER = 6;

  private static final int LAYOUT_FRAGMENTLOGIN = 7;

  private static final int LAYOUT_FRAGMENTSAMPLE = 8;

  private static final int LAYOUT_REJECTADAPTER = 9;

  private static final int LAYOUT_UPCOMINGADAPTER = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.food.app.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.food.app.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.food.app.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.food.app.R.layout.bookingadapter, LAYOUT_BOOKINGADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.food.app.R.layout.dateadapter, LAYOUT_DATEADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.food.app.R.layout.filteradapter, LAYOUT_FILTERADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.food.app.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.food.app.R.layout.fragment_sample, LAYOUT_FRAGMENTSAMPLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.food.app.R.layout.rejectadapter, LAYOUT_REJECTADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.food.app.R.layout.upcomingadapter, LAYOUT_UPCOMINGADAPTER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_BOOKINGADAPTER: {
          if ("layout/bookingadapter_0".equals(tag)) {
            return new BookingadapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bookingadapter is invalid. Received: " + tag);
        }
        case  LAYOUT_DATEADAPTER: {
          if ("layout/dateadapter_0".equals(tag)) {
            return new DateadapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dateadapter is invalid. Received: " + tag);
        }
        case  LAYOUT_FILTERADAPTER: {
          if ("layout/filteradapter_0".equals(tag)) {
            return new FilteradapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for filteradapter is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSAMPLE: {
          if ("layout/fragment_sample_0".equals(tag)) {
            return new FragmentSampleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sample is invalid. Received: " + tag);
        }
        case  LAYOUT_REJECTADAPTER: {
          if ("layout/rejectadapter_0".equals(tag)) {
            return new RejectadapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rejectadapter is invalid. Received: " + tag);
        }
        case  LAYOUT_UPCOMINGADAPTER: {
          if ("layout/upcomingadapter_0".equals(tag)) {
            return new UpcomingadapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for upcomingadapter is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_home_0", com.food.app.R.layout.activity_home);
      sKeys.put("layout/activity_main_0", com.food.app.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", com.food.app.R.layout.activity_splash);
      sKeys.put("layout/bookingadapter_0", com.food.app.R.layout.bookingadapter);
      sKeys.put("layout/dateadapter_0", com.food.app.R.layout.dateadapter);
      sKeys.put("layout/filteradapter_0", com.food.app.R.layout.filteradapter);
      sKeys.put("layout/fragment_login_0", com.food.app.R.layout.fragment_login);
      sKeys.put("layout/fragment_sample_0", com.food.app.R.layout.fragment_sample);
      sKeys.put("layout/rejectadapter_0", com.food.app.R.layout.rejectadapter);
      sKeys.put("layout/upcomingadapter_0", com.food.app.R.layout.upcomingadapter);
    }
  }
}
