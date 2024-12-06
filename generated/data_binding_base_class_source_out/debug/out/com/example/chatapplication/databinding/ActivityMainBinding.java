// Generated by view binder compiler. Do not edit!
package com.example.chatapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.chatapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton fabNewChat;

  @NonNull
  public final RoundedImageView iconButton1;

  @NonNull
  public final AppCompatImageView iconButton2;

  @NonNull
  public final TextView textName;

  @NonNull
  public final TextView textName1;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton fabNewChat, @NonNull RoundedImageView iconButton1,
      @NonNull AppCompatImageView iconButton2, @NonNull TextView textName,
      @NonNull TextView textName1) {
    this.rootView = rootView;
    this.fabNewChat = fabNewChat;
    this.iconButton1 = iconButton1;
    this.iconButton2 = iconButton2;
    this.textName = textName;
    this.textName1 = textName1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fabNewChat;
      FloatingActionButton fabNewChat = ViewBindings.findChildViewById(rootView, id);
      if (fabNewChat == null) {
        break missingId;
      }

      id = R.id.icon_button1;
      RoundedImageView iconButton1 = ViewBindings.findChildViewById(rootView, id);
      if (iconButton1 == null) {
        break missingId;
      }

      id = R.id.icon_button2;
      AppCompatImageView iconButton2 = ViewBindings.findChildViewById(rootView, id);
      if (iconButton2 == null) {
        break missingId;
      }

      id = R.id.textName;
      TextView textName = ViewBindings.findChildViewById(rootView, id);
      if (textName == null) {
        break missingId;
      }

      id = R.id.textName1;
      TextView textName1 = ViewBindings.findChildViewById(rootView, id);
      if (textName1 == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, fabNewChat, iconButton1,
          iconButton2, textName, textName1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
