// Generated by view binder compiler. Do not edit!
package com.example.chatapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.chatapplication.R;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemContainerUserBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RoundedImageView ImageProfile;

  @NonNull
  public final TextView TextName;

  @NonNull
  public final TextView TextName1;

  @NonNull
  public final View ViewSupport;

  private ItemContainerUserBinding(@NonNull ConstraintLayout rootView,
      @NonNull RoundedImageView ImageProfile, @NonNull TextView TextName,
      @NonNull TextView TextName1, @NonNull View ViewSupport) {
    this.rootView = rootView;
    this.ImageProfile = ImageProfile;
    this.TextName = TextName;
    this.TextName1 = TextName1;
    this.ViewSupport = ViewSupport;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemContainerUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemContainerUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_container_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemContainerUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ImageProfile;
      RoundedImageView ImageProfile = ViewBindings.findChildViewById(rootView, id);
      if (ImageProfile == null) {
        break missingId;
      }

      id = R.id.TextName;
      TextView TextName = ViewBindings.findChildViewById(rootView, id);
      if (TextName == null) {
        break missingId;
      }

      id = R.id.TextName1;
      TextView TextName1 = ViewBindings.findChildViewById(rootView, id);
      if (TextName1 == null) {
        break missingId;
      }

      id = R.id.ViewSupport;
      View ViewSupport = ViewBindings.findChildViewById(rootView, id);
      if (ViewSupport == null) {
        break missingId;
      }

      return new ItemContainerUserBinding((ConstraintLayout) rootView, ImageProfile, TextName,
          TextName1, ViewSupport);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
