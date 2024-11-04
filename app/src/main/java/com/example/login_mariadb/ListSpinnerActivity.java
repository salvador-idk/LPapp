package com.example.login_mariadb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class ListSpinnerActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listspinner);

    Spinner mySpinner = findViewById(R.id.my_spinner);
        //Create an array of items for the spinner
        String [] items = new String[]{"1. ASSY C1UC", "2. ASSY C223", "3. ASSY C234", "4. ", "5. ", "6. ", "7. ", "8. ",
        "9. ", "10. Headliner", "11. ", "12. ", "13. ", "14. ", "15. ", "16. ", "17. ", "18. ", "19. ", "20. "};

        //Crete an array of corresponding activities
        Class<?>[] activities = new Class<?>[]{FormsActivity.class};

        //Create an ArrayAdapter to populate the spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mySpinner.setAdapter(adapter);

        //set an OnItemSelectedListener to handle selection events
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedITem = items[position];

                //Redirect to another activity based on the selected item
                Intent intent = new Intent(ListSpinnerActivity.this, FormsActivity.class);
                intent.putExtra("selected_item", selectedITem);
                startActivity(intent);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
