// Generated by view binder compiler. Do not edit!
package com.willowtreeapps.constraintlayout20test.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.willowtreeapps.constraintlayout20test.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewNumberBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView itemValue;

  private ViewNumberBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView itemValue) {
    this.rootView = rootView;
    this.itemValue = itemValue;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewNumberBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_number, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewNumberBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      AppCompatTextView itemValue = rootView.findViewById(R.id.item_value);
      if (itemValue == null) {
        missingId = "itemValue";
        break missingId;
      }

      return new ViewNumberBinding((ConstraintLayout) rootView, itemValue);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
