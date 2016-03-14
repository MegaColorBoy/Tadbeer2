package com.heba.tadbeer;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.heba.tadbeer.Util.ApiCallback;
import com.heba.tadbeer.Util.ApiHelper;
import com.heba.tadbeer.Util.Tbr;
import com.heba.tadbeer.classes.RequestToken;

import org.json.JSONObject;

/**
 * A placeholder fragment containing a simple view.
 */
public class CardsActivityFragment extends Fragment implements View.OnClickListener{

    private ApiHelper helper;
    private ApiCallback callback;
    private RequestToken mRequestToken;
    private Dialog dialog;
    private static final String TAG = CardsActivityFragment.class.getSimpleName();
    private Button btnAddCard;
    public CardsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cards, container, false);
        btnAddCard = (Button) view.findViewById(R.id.btnAddCard);

        btnAddCard.setOnClickListener(this);
        return view;
    }

    private void displayDialog(final ApiHelper helper, final ApiCallback callback)
    {
        Context context = getActivity().getApplicationContext();
        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Add card");
        builder.setMessage("Enter card details");
        final EditText cardNumField = new EditText(getActivity());
        cardNumField.setHint("Card number");

        final EditText retailIDField = new EditText(getActivity());
        retailIDField.setHint("Retail ID");
        final EditText emailIDField = new EditText(getActivity());
        emailIDField.setHint("Email ID");

        layout.addView(cardNumField);
        layout.addView(retailIDField);
        layout.addView(emailIDField);

        builder.setView(layout);

        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String cardNum = cardNumField.getText().toString().trim();
                int retailID = Integer.parseInt(retailIDField.getText().toString().trim());
                String emailID = emailIDField.getText().toString().trim();
                helper.addCard(cardNum, emailID, retailID, callback);
            }
        });
        builder.setNegativeButton("Cancel", null);
        builder.create().show();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnAddCard)
        {
            Toast.makeText(getActivity().getApplicationContext(), "Btn", Toast.LENGTH_LONG).show();
            callback = new ApiCallback() {
                @Override
                public void onSuccess(Boolean success, JSONObject data) {
                    Toast.makeText(getActivity().getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
                    Log.d(TAG, data.toString());
                }

                @Override
                public void onError(Boolean success, String error) {
                    Toast.makeText(getActivity().getApplicationContext(), error, Toast.LENGTH_LONG).show();
                    Log.d(TAG, error);
                }
            };

            helper = new ApiHelper(getActivity().getApplicationContext(), mRequestToken);
            displayDialog(helper, callback);
        }
    }
}
