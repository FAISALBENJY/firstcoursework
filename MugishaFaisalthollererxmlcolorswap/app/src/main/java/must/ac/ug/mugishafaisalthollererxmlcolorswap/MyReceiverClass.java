package must.ac.ug.mugishafaisalthollererxmlcolorswap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiverClass extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String receivedMessage = intent.getStringExtra("message");

        if(intent.getAction().equals("com.global.mustacugcsceMugishaFaisalprogcolorswap")){
            Toast.makeText(context,receivedMessage+" "+"is the received color",Toast.LENGTH_LONG).show();
        }
    }
}
