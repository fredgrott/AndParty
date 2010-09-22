/*******************************************************************************
 * Copyright 2010 fredgrott
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.mobilebytes.andparty;



import android.app.Activity;

import android.os.Bundle;


/**
 * The splash screen is created in a different activity and uses a Handler
 * within the onCreate to trigger an intent launching this activity. I show
 * a company logo as an ImageView in the main layout so that we can see some
 * result.
 * @author fredgrott
 *
 */
public class MainActivity extends Activity {





    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState the saved instance state
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.main);






    }





}
