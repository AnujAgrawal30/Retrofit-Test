package com.example.retrofittask2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listOfEmployees);

        getEmployees();
    }

    private void getEmployees() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<employee>> call = api.getEmployees();

        call.enqueue(new Callback<List<employee>>() {
            @Override
            public void onResponse(Call<List<employee>> call, Response<List<employee>> response) {
                List<employee> employeeList = response.body();

                String[] employees = new String[employeeList.size()];;
                for(int i = 0; i < employeeList.size(); i++){
                    employees[i] = employeeList.get(i).getEmployee_name();
                }

                listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, employees));
            }

            @Override
            public void onFailure(Call<List<employee>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
