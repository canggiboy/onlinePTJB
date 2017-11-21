package ikhsan.com.ptjblintasarta;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class NewTransaction extends BottomSheetDialogFragment implements View.OnClickListener {

    private EditText item_name;
    private EditText item_amount;
    private Spinner transaction;
    private int type = 0;

    @Nullable
    @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.new_transaction_bottomset, container, false);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        item_name = (EditText) view.findViewById(R.id.item_name);
        item_amount = (EditText) view.findViewById(R.id.item_amount);

        view.findViewById(R.id.img_close).setOnClickListener(this);
        view.findViewById(R.id.img_done).setOnClickListener(this);
    }

    @Override public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_close:
                dismiss();
                break;
            case R.id.img_done:
                process();
                break;
        }
    }

    private void process() {

    }

    private boolean validate() {
        if (item_name.getText().toString().isEmpty()) {
            showMessage("Please input title.");
        } else if (item_amount.getText().toString().isEmpty()) {
            showMessage("Please input amoun.");
        } else {
            return true;
        }
        return false;
    }

    private void showMessage(String message) {
        Snackbar.make(item_name, message, Snackbar.LENGTH_SHORT).show();
    }
}
