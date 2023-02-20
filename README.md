# UncheckableRadioButton
[![](https://jitpack.io/v/rajdeepvaghela/UncheckableRadioButton.svg)](https://jitpack.io/#rajdeepvaghela/UncheckableRadioButton)
[![Release](https://img.shields.io/github/v/release/rajdeepvaghela/UncheckableRadioButton)](https://github.com/rajdeepvaghela/UncheckableRadioButton/releases)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)


A simple modified RadioButton which can also be unchecked on click. 

## Installation
Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
    repositories {
    	...
        maven { url 'https://jitpack.io' }
    }
} 
```
Add the dependency
```gradle
dependencies {
    implementation 'com.github.rajdeepvaghela:UncheckableRadioButton:1.0.0'
}
```
## Usage
```xml
    <RadioGroup
        android:id="@+id/radioGroup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <com.rdapps.uncheckableradiobutton.UncheckableRadioButton
            android:id="@+id/rb1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Option 1"
            app:uncheckable="true" />

        <com.rdapps.uncheckableradiobutton.UncheckableRadioButton
            android:id="@+id/rb2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Option 2"
            app:uncheckable="true" />
    </RadioGroup>
```

## License
```
Copyright 2023 Rajdeep Vaghela

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
