/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.livroandroid.anim_activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * See WindowAnimations.java for comments on the overall application.
 * <p/>
 * This is a sub-activity which does not provide any custom animation. Exiting this
 * sub-activity therefore gets the default system behavior for window animations.
 */
public class SubActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
