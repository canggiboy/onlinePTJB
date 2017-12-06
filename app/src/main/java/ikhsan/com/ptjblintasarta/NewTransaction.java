package ikhsan.com.ptjblintasarta;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NewTransaction extends BottomSheetDialogFragment implements View.OnClickListener {

    private EditText item_name, item_amount, item_date;
    private Spinner transaction;
    private int type = 0;

    private DatePickerDialog datePickerDialog;

    private SimpleDateFormat dateFormatter;

    @Nullable
    @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.new_transaction_bottomset, container, false);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        item_name = (EditText) view.findViewById(R.id.item_name);
        item_amount = (EditText) view.findViewById(R.id.item_amount);
        item_date = (EditText) view.findViewById(R.id.etTDate);

        view.findViewById(R.id.img_close).setOnClickListener(this);
        view.findViewById(R.id.img_done).setOnClickListener(this);
        view.findViewById(R.id.etTDate).setOnClickListener(this);
    }

    @Override public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_close:
                dismiss();
                break;
            case R.id.img_done:
                process();
                break;
            case R.id.etTDate:
                showDateDialog();
                break;
        }
    }

    private void showDateDialog(){
        Calendar newCalendar = Calendar.getInstance();
        dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        datePickerDialog = new DatePickerDialog (getActivity(), new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                item_date.setText(""+dateFormatter.format(newDate.getTime()));
            }
        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    private void process() {

    }

    private boolean validate() {
        if (item_name.getText().toString().isEmpty()) {
            showMessage("Please input title.");
        } else if (item_amount.getText().toString().isEmpty()) {
            showMessage("Please input amount.");
        } else {
            return true;
        }
        return false;
    }

    private void showMessage(String message) {
        Snackbar.make(item_name, message, Snackbar.LENGTH_SHORT).show();
    }
}
