// Generated by view binder compiler. Do not edit!
package com.willowtreeapps.constraintlayout20test.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.willowtreeapps.constraintlayout20test.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDiffUtilBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView recycler;

  @NonNull
  public final MaterialButton reverseButton;

  private FragmentDiffUtilBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView recycler, @NonNull MaterialButton reverseButton) {
    this.rootView = rootView;
    this.recycler = recycler;
    this.reverseButton = reverseButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDiffUtilBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDiffUtilBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_diff_util, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDiffUtilBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      RecyclerView recycler = rootView.findViewById(R.id.recycler);
      if (recycler == null) {
        missingId = "recycler";
        break missingId;
      }

      MaterialButton reverseButton = rootView.findViewById(R.id.reverse_button);
      if (reverseButton == null) {
        missingId = "reverseButton";
        break missingId;
      }

      return new FragmentDiffUtilBinding((ConstraintLayout) rootView, recycler, reverseButton);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}