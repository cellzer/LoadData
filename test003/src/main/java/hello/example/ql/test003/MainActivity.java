package hello.example.ql.test003;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.loopj.android.http.JsonHttpResponseHandler;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            getData();
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
    public void getData() throws JSONException {
        TestRestClient.post("appservice_8_0/register", null, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                // If the response is JSONObject instead of expected JSONArray
                System.out.println("success");
                System.out.println(response);
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray arr) {

                // Do something with the response
                System.out.println("success");
                System.out.println(arr);
            }
        });
    }
}
