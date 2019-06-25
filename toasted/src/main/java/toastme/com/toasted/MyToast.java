package toastme.com.toasted;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Yeshveer on 6/26/2019.
 */

public class MyToast {
    public static void s(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }
}
