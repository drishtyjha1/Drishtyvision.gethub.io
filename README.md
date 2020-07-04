# Drishtyvision.gethub.io😊
This tutorial guide you to develop a basic Calculator Android application in Android Studio.
NOTE: There is a new article written on How to develop an Android calculator application using Kotlin: Android: Simple Calculator in Kotlin. The new article is the Kotlin version of this article. If you like to start with Kotlin, the recent article is recommended for you.

Step 1: Create a new Android application project with an application name: “Calculator” and package name: “com.javahelps.calculator”.

Step 2: By default, Android uses a green Android robot icon. In this project, we are going to use a custom application icon. Therefore, delete the default ic_launcher icon set from the “mipmap” folder.

[<img src ="https://2.bp.blogspot.com/-nS7KHRsBthE/VPRwZvflriI/AAAAAAAACJA/afGOXBVJis0/s1600/Simple%2BCalculator%2Bin%2BAndroid%2B1.png">]

Step 3: Get any PNG image file for the application icon. (It is recommended to have a minimum size 256x256 pixels). This icon is used to display in the Google Play as well as in the applications menu of Android devices.

Step 4: Right click on the “mipmap” folder and select New → Image Asset <img src ="https://1.bp.blogspot.com/-CqNd6EjqXXg/VPRw44eMUII/AAAAAAAACJI/ekLeapdokuY/s1600/Simple%2BCalculator%2Bin%2BAndroid%2B2.png">

Step 5: Browse and select your icon as the image file and click on Next → Finish buttons. (Make sure that the resource name is: ic_launcher)

<img src="https://4.bp.blogspot.com/-IgNcK4y04PQ/VPRxKbkSX4I/AAAAAAAACJQ/U3APAPGrBh8/s1600/Simple%2BCalculator%2Bin%2BAndroid%2B3.png">

Step 6: Replace the content of the activity_main.xml file by the following code. This code creates a TextView as the calculator number screen and some necessary buttons. TextView is used instead of EditText, in order to prevent manual user input using the default keypad of Android. In this code, some common properties of Buttons are not provided to reduce the length of this tutorial. In your code make sure that you have included these four attributes for all the Buttons. android:layout_width="0dp" android:layout_height="match_parent" android:layout_weight="1" android:textSize="30sp" Copy

<TextView
    android:id="@+id/txtScreen"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_alignParentTop="true"
    android:layout_centerHorizontal="true"
    android:gravity="right|center_vertical"
    android:maxLength="16"
    android:padding="10dp"
    android:textAppearance="?android:attr/textAppearanceLarge"
    android:textSize="30sp"
    android:typeface="serif" />

<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_below="@+id/txtScreen"
    android:orientation="vertical">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1">
        <Button
            android:id="@+id/btnSeven"
            android:text="7" />
        <Button
            android:id="@+id/btnEight"
            android:text="8" />
        <Button
            android:id="@+id/btnNine"
            android:text="9"/>
        <Button
            android:id="@+id/btnDivide"
            android:text="/"/>
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1">
        <Button
            android:id="@+id/btnFour"
            android:text="4"/>
        <Button
            android:id="@+id/btnFive"
            android:text="5" />
        <Button
            android:id="@+id/btnSix"
            android:text="6" />
        <Button
            android:id="@+id/btnMultiply"
            android:text="*" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1">
        <Button
            android:id="@+id/btnOne"
            android:text="1" />
        <Button
            android:id="@+id/btnTwo"
            android:text="2" />
        <Button
            android:id="@+id/btnThree"
            android:text="3" />
        <Button
            android:id="@+id/btnSubtract"
            android:text="-" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1">
        <Button
            android:id="@+id/btnDot"
            android:text="." />
        <Button
            android:id="@+id/btnZero"
            android:text="0" />
        <Button
            android:id="@+id/btnClear"
            android:text="C" />
        <Button
            android:id="@+id/btnAdd"
            android:text="+" />
    </LinearLayout>

    <Button
        android:id="@+id/btnEqual"
        android:text="=" />
</LinearLayout>
Copy Step 7: Right click on the “drawable” folder and select New → Drawable resource file. ![](https://3.bp.blogspot.com/-jVJppOgokwk/VPRxS3tnTnI/AAAAAAAACJY/wVd5L0Lis44/s1600/Simple%2BCalculator%2Bin%2BAndroid%2B5.png)
Step 8: Create a drawable file with a name button. [<img src ="https://1.bp.blogspot.com/-1aB3w0b2JtI/VPRxgzx3ZkI/AAAAAAAACJg/jcrX146cREM/s1600/Simple%2BCalculator%2Bin%2BAndroid%2B6.png">]

Step 9: Replace the content of button.xml by the following code. This drawable resource is used to decorate the buttons of the calculator. There are two gradient shapes in this code; one is for button pressed state and another for the normal state.

Copy
Step 10: For all the buttons in the activity_main.xml, add a property “android:background”. android:background="@drawable/button" Copy After the modification, activity_main.xml must be like this.

Step 11: To evaluate the arithmetic expressions, the exp4J library is used in this project. Open the “build.gradle (Module: app)” file from the Gradle scripts. Add a dependency 'net.objecthunter:exp4j:0.4.4' to the project as shown below. dependencies { compile fileTree(dir: 'libs', include: ['*.jar']) compile 'com.android.support:appcompat-v7:21.0.3' compile 'net.objecthunter:exp4j:0.4.4' } Copy Once you save the file, Android Studio will ask to sync the project. Allow it to sync by clicking on the link appeared on the top left corner. (You need an active Internet connection to download the libraries by Gradle)

[<img src ="https://3.bp.blogspot.com/-MelAf8bGuHQ/VPRxrVUidTI/AAAAAAAACJo/uS-zv4rFb-k/s1600/Simple%2BCalculator%2Bin%2BAndroid%2B7.png">]

Step 12: Modify the MainActivity.java as provided below. Complete description of the code is provided in comments. package com.javahelps.calculator;

import android.os.Bundle; import android.support.v7.app.ActionBarActivity; import android.view.View; import android.widget.Button; import android.widget.TextView;

import net.objecthunter.exp4j.Expression; import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends ActionBarActivity { // IDs of all the numeric buttons private int[] numericButtons = {R.id.btnZero, R.id.btnOne, R.id.btnTwo, R.id.btnThree, R.id.btnFour, R.id.btnFive, R.id.btnSix, R.id.btnSeven, R.id.btnEight, R.id.btnNine}; // IDs of all the operator buttons private int[] operatorButtons = {R.id.btnAdd, R.id.btnSubtract, R.id.btnMultiply, R.id.btnDivide}; // TextView used to display the output private TextView txtScreen; // Represent whether the lastly pressed key is numeric or not private boolean lastNumeric; // Represent that current state is in error or not private boolean stateError; // If true, do not allow to add another DOT private boolean lastDot;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    // Find the TextView
    this.txtScreen = (TextView) findViewById(R.id.txtScreen);
    // Find and set OnClickListener to numeric buttons
    setNumericOnClickListener();
    // Find and set OnClickListener to operator buttons, equal button and decimal point button
    setOperatorOnClickListener();
}

/**
 * Find and set OnClickListener to numeric buttons.
 */
private void setNumericOnClickListener() {
    // Create a common OnClickListener
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Just append/set the text of clicked button
            Button button = (Button) v;
            if (stateError) {
                // If current state is Error, replace the error message
                txtScreen.setText(button.getText());
                stateError = false;
            } else {
                // If not, already there is a valid expression so append to it
                txtScreen.append(button.getText());
            }
            // Set the flag
            lastNumeric = true;
        }
    };
    // Assign the listener to all the numeric buttons
    for (int id : numericButtons) {
        findViewById(id).setOnClickListener(listener);
    }
}

/**
 * Find and set OnClickListener to operator buttons, equal button and decimal point button.
 */
private void setOperatorOnClickListener() {
    // Create a common OnClickListener for operators
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // If the current state is Error do not append the operator
            // If the last input is number only, append the operator
            if (lastNumeric && !stateError) {
                Button button = (Button) v;
                txtScreen.append(button.getText());
                lastNumeric = false;
                lastDot = false;    // Reset the DOT flag
            }
        }
    };
    // Assign the listener to all the operator buttons
    for (int id : operatorButtons) {
        findViewById(id).setOnClickListener(listener);
    }
    // Decimal point
    findViewById(R.id.btnDot).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (lastNumeric && !stateError && !lastDot) {
                txtScreen.append(".");
                lastNumeric = false;
                lastDot = true;
            }
        }
    });
    // Clear button
    findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtScreen.setText("");  // Clear the screen
            // Reset all the states and flags
            lastNumeric = false;
            stateError = false;
            lastDot = false;
        }
    });
    // Equal button
    findViewById(R.id.btnEqual).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onEqual();
        }
    });
}

/**
 * Logic to calculate the solution.
 */
private void onEqual() {
    // If the current state is error, nothing to do.
    // If the last input is a number only, solution can be found.
    if (lastNumeric && !stateError) {
        // Read the expression
        String txt = txtScreen.getText().toString();
        // Create an Expression (A class from exp4j library)
        Expression expression = new ExpressionBuilder(txt).build();
        try {
            // Calculate the result and display
            double result = expression.evaluate();
            txtScreen.setText(Double.toString(result));
            lastDot = true; // Result contains a dot
        } catch (ArithmeticException ex) {
            // Display an error message
            txtScreen.setText("Error");
            stateError = true;
            lastNumeric = false;
        }
    }
}
} Copy

Step 13: Save all the changes and run the application.

[<img src ="https://2.bp.blogspot.com/-IdjnUIBFtj8/VPRx2HiceSI/AAAAAAAACJw/YGbdAP6bEbc/s1600/Simple%2BCalculator%2Bin%2BAndroid%2B8.png">]

Note: Purpose of this tutorial and the project is not developing a perfect Calculator but providing a basic knowledge to develop a simple application in Android. The application has not been tested completely, so if there are any bugs, please comment below and I will try my best to fix them as soon as possible.
