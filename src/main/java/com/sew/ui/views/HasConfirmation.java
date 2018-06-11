package com.sew.ui.views;

import com.sew.ui.components.ConfirmDialog;

public interface HasConfirmation {

	void setConfirmDialog(ConfirmDialog confirmDialog);

	ConfirmDialog getConfirmDialog();
}
