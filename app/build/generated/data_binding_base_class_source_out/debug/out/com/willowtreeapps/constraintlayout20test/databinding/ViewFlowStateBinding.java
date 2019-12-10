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
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.willowtreeapps.constraintlayout20test.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewFlowStateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton fiftyHorizontalBiasButton;

  @NonNull
  public final MaterialButton fiftyVerticalBiasButton;

  @NonNull
  public final MaterialButton fullHorizontalBiasButton;

  @NonNull
  public final MaterialButton fullVerticalBiasButton;

  @NonNull
  public final AppCompatTextView horizontalBiasLabel;

  @NonNull
  public final MaterialButtonToggleGroup horizontalBiasToggleGroup;

  @NonNull
  public final AppCompatTextView horizontalGapLabel;

  @NonNull
  public final MaterialButtonToggleGroup horizontalGapToggleGroup;

  @NonNull
  public final AppCompatTextView horizontalStyleLabel;

  @NonNull
  public final MaterialButtonToggleGroup horizontalStyleToggleGroup;

  @NonNull
  public final MaterialButton largeGapButton;

  @NonNull
  public final MaterialButton largeGapVerticalButton;

  @NonNull
  public final MaterialButton largeMaxButton;

  @NonNull
  public final AppCompatTextView maxElementsLabel;

  @NonNull
  public final MaterialButtonToggleGroup maxElementsToggleGroup;

  @NonNull
  public final MaterialButton mediumGapButton;

  @NonNull
  public final MaterialButton mediumGapVerticalButton;

  @NonNull
  public final MaterialButton mediumMaxButton;

  @NonNull
  public final MaterialButton noGapButton;

  @NonNull
  public final MaterialButton noGapVerticalButton;

  @NonNull
  public final MaterialButton noHorizontalBiasButton;

  @NonNull
  public final MaterialButton noVerticalBiasButton;

  @NonNull
  public final MaterialButton packedButton;

  @NonNull
  public final MaterialButton packedVerticalButton;

  @NonNull
  public final MaterialButton smallGapButton;

  @NonNull
  public final MaterialButton smallGapVerticalButton;

  @NonNull
  public final MaterialButton smallMaxButton;

  @NonNull
  public final MaterialButton spreadButton;

  @NonNull
  public final MaterialButton spreadInsideButton;

  @NonNull
  public final MaterialButton spreadInsideVerticalButton;

  @NonNull
  public final MaterialButton spreadVerticalButton;

  @NonNull
  public final AppCompatTextView verticalBiasLabel;

  @NonNull
  public final MaterialButtonToggleGroup verticalBiasToggleGroup;

  @NonNull
  public final AppCompatTextView verticalGapLabel;

  @NonNull
  public final MaterialButtonToggleGroup verticalGapToggleGroup;

  @NonNull
  public final AppCompatTextView verticalStyleLabel;

  @NonNull
  public final MaterialButtonToggleGroup verticalStyleToggleGroup;

  private ViewFlowStateBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton fiftyHorizontalBiasButton,
      @NonNull MaterialButton fiftyVerticalBiasButton,
      @NonNull MaterialButton fullHorizontalBiasButton,
      @NonNull MaterialButton fullVerticalBiasButton,
      @NonNull AppCompatTextView horizontalBiasLabel,
      @NonNull MaterialButtonToggleGroup horizontalBiasToggleGroup,
      @NonNull AppCompatTextView horizontalGapLabel,
      @NonNull MaterialButtonToggleGroup horizontalGapToggleGroup,
      @NonNull AppCompatTextView horizontalStyleLabel,
      @NonNull MaterialButtonToggleGroup horizontalStyleToggleGroup,
      @NonNull MaterialButton largeGapButton, @NonNull MaterialButton largeGapVerticalButton,
      @NonNull MaterialButton largeMaxButton, @NonNull AppCompatTextView maxElementsLabel,
      @NonNull MaterialButtonToggleGroup maxElementsToggleGroup,
      @NonNull MaterialButton mediumGapButton, @NonNull MaterialButton mediumGapVerticalButton,
      @NonNull MaterialButton mediumMaxButton, @NonNull MaterialButton noGapButton,
      @NonNull MaterialButton noGapVerticalButton, @NonNull MaterialButton noHorizontalBiasButton,
      @NonNull MaterialButton noVerticalBiasButton, @NonNull MaterialButton packedButton,
      @NonNull MaterialButton packedVerticalButton, @NonNull MaterialButton smallGapButton,
      @NonNull MaterialButton smallGapVerticalButton, @NonNull MaterialButton smallMaxButton,
      @NonNull MaterialButton spreadButton, @NonNull MaterialButton spreadInsideButton,
      @NonNull MaterialButton spreadInsideVerticalButton,
      @NonNull MaterialButton spreadVerticalButton, @NonNull AppCompatTextView verticalBiasLabel,
      @NonNull MaterialButtonToggleGroup verticalBiasToggleGroup,
      @NonNull AppCompatTextView verticalGapLabel,
      @NonNull MaterialButtonToggleGroup verticalGapToggleGroup,
      @NonNull AppCompatTextView verticalStyleLabel,
      @NonNull MaterialButtonToggleGroup verticalStyleToggleGroup) {
    this.rootView = rootView;
    this.fiftyHorizontalBiasButton = fiftyHorizontalBiasButton;
    this.fiftyVerticalBiasButton = fiftyVerticalBiasButton;
    this.fullHorizontalBiasButton = fullHorizontalBiasButton;
    this.fullVerticalBiasButton = fullVerticalBiasButton;
    this.horizontalBiasLabel = horizontalBiasLabel;
    this.horizontalBiasToggleGroup = horizontalBiasToggleGroup;
    this.horizontalGapLabel = horizontalGapLabel;
    this.horizontalGapToggleGroup = horizontalGapToggleGroup;
    this.horizontalStyleLabel = horizontalStyleLabel;
    this.horizontalStyleToggleGroup = horizontalStyleToggleGroup;
    this.largeGapButton = largeGapButton;
    this.largeGapVerticalButton = largeGapVerticalButton;
    this.largeMaxButton = largeMaxButton;
    this.maxElementsLabel = maxElementsLabel;
    this.maxElementsToggleGroup = maxElementsToggleGroup;
    this.mediumGapButton = mediumGapButton;
    this.mediumGapVerticalButton = mediumGapVerticalButton;
    this.mediumMaxButton = mediumMaxButton;
    this.noGapButton = noGapButton;
    this.noGapVerticalButton = noGapVerticalButton;
    this.noHorizontalBiasButton = noHorizontalBiasButton;
    this.noVerticalBiasButton = noVerticalBiasButton;
    this.packedButton = packedButton;
    this.packedVerticalButton = packedVerticalButton;
    this.smallGapButton = smallGapButton;
    this.smallGapVerticalButton = smallGapVerticalButton;
    this.smallMaxButton = smallMaxButton;
    this.spreadButton = spreadButton;
    this.spreadInsideButton = spreadInsideButton;
    this.spreadInsideVerticalButton = spreadInsideVerticalButton;
    this.spreadVerticalButton = spreadVerticalButton;
    this.verticalBiasLabel = verticalBiasLabel;
    this.verticalBiasToggleGroup = verticalBiasToggleGroup;
    this.verticalGapLabel = verticalGapLabel;
    this.verticalGapToggleGroup = verticalGapToggleGroup;
    this.verticalStyleLabel = verticalStyleLabel;
    this.verticalStyleToggleGroup = verticalStyleToggleGroup;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewFlowStateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewFlowStateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_flow_state, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewFlowStateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      MaterialButton fiftyHorizontalBiasButton = rootView.findViewById(R.id.fifty_horizontal_bias_button);
      if (fiftyHorizontalBiasButton == null) {
        missingId = "fiftyHorizontalBiasButton";
        break missingId;
      }

      MaterialButton fiftyVerticalBiasButton = rootView.findViewById(R.id.fifty_vertical_bias_button);
      if (fiftyVerticalBiasButton == null) {
        missingId = "fiftyVerticalBiasButton";
        break missingId;
      }

      MaterialButton fullHorizontalBiasButton = rootView.findViewById(R.id.full_horizontal_bias_button);
      if (fullHorizontalBiasButton == null) {
        missingId = "fullHorizontalBiasButton";
        break missingId;
      }

      MaterialButton fullVerticalBiasButton = rootView.findViewById(R.id.full_vertical_bias_button);
      if (fullVerticalBiasButton == null) {
        missingId = "fullVerticalBiasButton";
        break missingId;
      }

      AppCompatTextView horizontalBiasLabel = rootView.findViewById(R.id.horizontal_bias_label);
      if (horizontalBiasLabel == null) {
        missingId = "horizontalBiasLabel";
        break missingId;
      }

      MaterialButtonToggleGroup horizontalBiasToggleGroup = rootView.findViewById(R.id.horizontal_bias_toggle_group);
      if (horizontalBiasToggleGroup == null) {
        missingId = "horizontalBiasToggleGroup";
        break missingId;
      }

      AppCompatTextView horizontalGapLabel = rootView.findViewById(R.id.horizontal_gap_label);
      if (horizontalGapLabel == null) {
        missingId = "horizontalGapLabel";
        break missingId;
      }

      MaterialButtonToggleGroup horizontalGapToggleGroup = rootView.findViewById(R.id.horizontal_gap_toggle_group);
      if (horizontalGapToggleGroup == null) {
        missingId = "horizontalGapToggleGroup";
        break missingId;
      }

      AppCompatTextView horizontalStyleLabel = rootView.findViewById(R.id.horizontal_style_label);
      if (horizontalStyleLabel == null) {
        missingId = "horizontalStyleLabel";
        break missingId;
      }

      MaterialButtonToggleGroup horizontalStyleToggleGroup = rootView.findViewById(R.id.horizontal_style_toggle_group);
      if (horizontalStyleToggleGroup == null) {
        missingId = "horizontalStyleToggleGroup";
        break missingId;
      }

      MaterialButton largeGapButton = rootView.findViewById(R.id.large_gap_button);
      if (largeGapButton == null) {
        missingId = "largeGapButton";
        break missingId;
      }

      MaterialButton largeGapVerticalButton = rootView.findViewById(R.id.large_gap_vertical_button);
      if (largeGapVerticalButton == null) {
        missingId = "largeGapVerticalButton";
        break missingId;
      }

      MaterialButton largeMaxButton = rootView.findViewById(R.id.large_max_button);
      if (largeMaxButton == null) {
        missingId = "largeMaxButton";
        break missingId;
      }

      AppCompatTextView maxElementsLabel = rootView.findViewById(R.id.max_elements_label);
      if (maxElementsLabel == null) {
        missingId = "maxElementsLabel";
        break missingId;
      }

      MaterialButtonToggleGroup maxElementsToggleGroup = rootView.findViewById(R.id.max_elements_toggle_group);
      if (maxElementsToggleGroup == null) {
        missingId = "maxElementsToggleGroup";
        break missingId;
      }

      MaterialButton mediumGapButton = rootView.findViewById(R.id.medium_gap_button);
      if (mediumGapButton == null) {
        missingId = "mediumGapButton";
        break missingId;
      }

      MaterialButton mediumGapVerticalButton = rootView.findViewById(R.id.medium_gap_vertical_button);
      if (mediumGapVerticalButton == null) {
        missingId = "mediumGapVerticalButton";
        break missingId;
      }

      MaterialButton mediumMaxButton = rootView.findViewById(R.id.medium_max_button);
      if (mediumMaxButton == null) {
        missingId = "mediumMaxButton";
        break missingId;
      }

      MaterialButton noGapButton = rootView.findViewById(R.id.no_gap_button);
      if (noGapButton == null) {
        missingId = "noGapButton";
        break missingId;
      }

      MaterialButton noGapVerticalButton = rootView.findViewById(R.id.no_gap_vertical_button);
      if (noGapVerticalButton == null) {
        missingId = "noGapVerticalButton";
        break missingId;
      }

      MaterialButton noHorizontalBiasButton = rootView.findViewById(R.id.no_horizontal_bias_button);
      if (noHorizontalBiasButton == null) {
        missingId = "noHorizontalBiasButton";
        break missingId;
      }

      MaterialButton noVerticalBiasButton = rootView.findViewById(R.id.no_vertical_bias_button);
      if (noVerticalBiasButton == null) {
        missingId = "noVerticalBiasButton";
        break missingId;
      }

      MaterialButton packedButton = rootView.findViewById(R.id.packed_button);
      if (packedButton == null) {
        missingId = "packedButton";
        break missingId;
      }

      MaterialButton packedVerticalButton = rootView.findViewById(R.id.packed_vertical_button);
      if (packedVerticalButton == null) {
        missingId = "packedVerticalButton";
        break missingId;
      }

      MaterialButton smallGapButton = rootView.findViewById(R.id.small_gap_button);
      if (smallGapButton == null) {
        missingId = "smallGapButton";
        break missingId;
      }

      MaterialButton smallGapVerticalButton = rootView.findViewById(R.id.small_gap_vertical_button);
      if (smallGapVerticalButton == null) {
        missingId = "smallGapVerticalButton";
        break missingId;
      }

      MaterialButton smallMaxButton = rootView.findViewById(R.id.small_max_button);
      if (smallMaxButton == null) {
        missingId = "smallMaxButton";
        break missingId;
      }

      MaterialButton spreadButton = rootView.findViewById(R.id.spread_button);
      if (spreadButton == null) {
        missingId = "spreadButton";
        break missingId;
      }

      MaterialButton spreadInsideButton = rootView.findViewById(R.id.spread_inside_button);
      if (spreadInsideButton == null) {
        missingId = "spreadInsideButton";
        break missingId;
      }

      MaterialButton spreadInsideVerticalButton = rootView.findViewById(R.id.spread_inside_vertical_button);
      if (spreadInsideVerticalButton == null) {
        missingId = "spreadInsideVerticalButton";
        break missingId;
      }

      MaterialButton spreadVerticalButton = rootView.findViewById(R.id.spread_vertical_button);
      if (spreadVerticalButton == null) {
        missingId = "spreadVerticalButton";
        break missingId;
      }

      AppCompatTextView verticalBiasLabel = rootView.findViewById(R.id.vertical_bias_label);
      if (verticalBiasLabel == null) {
        missingId = "verticalBiasLabel";
        break missingId;
      }

      MaterialButtonToggleGroup verticalBiasToggleGroup = rootView.findViewById(R.id.vertical_bias_toggle_group);
      if (verticalBiasToggleGroup == null) {
        missingId = "verticalBiasToggleGroup";
        break missingId;
      }

      AppCompatTextView verticalGapLabel = rootView.findViewById(R.id.vertical_gap_label);
      if (verticalGapLabel == null) {
        missingId = "verticalGapLabel";
        break missingId;
      }

      MaterialButtonToggleGroup verticalGapToggleGroup = rootView.findViewById(R.id.vertical_gap_toggle_group);
      if (verticalGapToggleGroup == null) {
        missingId = "verticalGapToggleGroup";
        break missingId;
      }

      AppCompatTextView verticalStyleLabel = rootView.findViewById(R.id.vertical_style_label);
      if (verticalStyleLabel == null) {
        missingId = "verticalStyleLabel";
        break missingId;
      }

      MaterialButtonToggleGroup verticalStyleToggleGroup = rootView.findViewById(R.id.vertical_style_toggle_group);
      if (verticalStyleToggleGroup == null) {
        missingId = "verticalStyleToggleGroup";
        break missingId;
      }

      return new ViewFlowStateBinding((ConstraintLayout) rootView, fiftyHorizontalBiasButton,
          fiftyVerticalBiasButton, fullHorizontalBiasButton, fullVerticalBiasButton,
          horizontalBiasLabel, horizontalBiasToggleGroup, horizontalGapLabel,
          horizontalGapToggleGroup, horizontalStyleLabel, horizontalStyleToggleGroup,
          largeGapButton, largeGapVerticalButton, largeMaxButton, maxElementsLabel,
          maxElementsToggleGroup, mediumGapButton, mediumGapVerticalButton, mediumMaxButton,
          noGapButton, noGapVerticalButton, noHorizontalBiasButton, noVerticalBiasButton,
          packedButton, packedVerticalButton, smallGapButton, smallGapVerticalButton,
          smallMaxButton, spreadButton, spreadInsideButton, spreadInsideVerticalButton,
          spreadVerticalButton, verticalBiasLabel, verticalBiasToggleGroup, verticalGapLabel,
          verticalGapToggleGroup, verticalStyleLabel, verticalStyleToggleGroup);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
