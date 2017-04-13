<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    android:background="@drawable/sg2"
    tools:context="com.example.android.stargatequiz.MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/orange"
            android:textSize="20dp"
            android:textStyle="bold"
            android:text="Q1: Who's built the Stargates?" />

        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/radiogoup1"
            android:orientation="vertical">


            <RadioButton
                android:id="@+id/yes_radio_button_1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textColor="@color/mycol"
                android:buttonTint="@color/mycol"
                android:text="The Asgards"
                android:textAppearance="?android:textAppearanceMedium" />

            <RadioButton
                android:id="@+id/no_radio_button_1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textColor="@color/mycol"
                android:buttonTint="@color/mycol"
                android:text="The Ancients"
                android:textAppearance="?android:textAppearanceMedium" />
        </RadioGroup>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/orange"
            android:textSize="20dp"
            android:textStyle="bold"
            android:text="Q2: Which races form 'The Four Races'?" />
        <CheckBox
            android:id="@+id/notify_me_checkbox1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:buttonTint="@color/mycol"
            android:text="Asgard"
            android:textAppearance="?android:textAppearanceMedium"
            />
        <CheckBox
            android:id="@+id/notify_me_checkbox2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:buttonTint="@color/mycol"
            android:text="NOX"
            android:textAppearance="?android:textAppearanceMedium"
            />
        <CheckBox
            android:id="@+id/notify_me_checkbox3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:buttonTint="@color/mycol"
            android:text="Tok'ra"
            android:textAppearance="?android:textAppearanceMedium"
            />
        <CheckBox
            android:id="@+id/notify_me_checkbox4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:buttonTint="@color/mycol"
            android:text="Ancients"
            android:textAppearance="?android:textAppearanceMedium"
            />
        <CheckBox
            android:id="@+id/notify_me_checkbox5"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:buttonTint="@color/mycol"
            android:text="Furlings"
            android:textAppearance="?android:textAppearanceMedium"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/orange"
            android:textSize="20dp"
            android:textStyle="bold"
            android:text="Q3: Who was the first Goa'uld Supreme Systemlord? (multiplie choice)" />
        <EditText
            android:id="@+id/first"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:textColorHint="@color/mycol"
            android:buttonTint="@color/mycol"
            android:hint="Capital letters"
            android:inputType="textMultiLine"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/orange"
            android:textSize="20dp"
            android:textStyle="bold"
            android:text="Q4: Who was the ancient, who helped Daniel Jackson's ascension?" />
        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:buttonTint="@color/mycol"
            android:id="@+id/radiogroup2"
            android:orientation="vertical">
            <RadioButton
                android:id="@+id/yes_radio_button_2"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textColor="@color/mycol"
                android:buttonTint="@color/mycol"
                android:text="Morgan Le Fay"
                android:textAppearance="?android:textAppearanceMedium" />

            <RadioButton
                android:id="@+id/no_radio_button_2"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textColor="@color/mycol"
                android:buttonTint="@color/mycol"
                android:text="Oma Desala"
                android:textAppearance="?android:textAppearanceMedium" />
        </RadioGroup>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/orange"
            android:textSize="20dp"
            android:textStyle="bold"
            android:text="Q5: Who is responsible for the destruction of Abydos?" />
        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/radiogroup3"
            android:orientation="vertical">
            <RadioButton
                android:id="@+id/yes_radio_button_3"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textColor="@color/mycol"
                android:buttonTint="@color/mycol"
                android:text="Ba'al"
                android:textAppearance="?android:textAppearanceMedium" />

            <RadioButton
                android:id="@+id/no_radio_button_3"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textColor="@color/mycol"
                android:buttonTint="@color/mycol"
                android:text="Anubis"
                android:textAppearance="?android:textAppearanceMedium" />
        </RadioGroup>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/orange"
            android:textSize="20dp"
            android:textStyle="bold"
            android:text="Q6: When did Prof. Paul Langford discovered the stargate?" />
        <EditText
            android:id="@+id/second"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:textColorHint="@color/mycol"
            android:buttonTint="@color/mycol"
            android:hint="YYYY"
            android:inputType="textMultiLine"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/orange"
            android:textSize="20dp"
            android:textStyle="bold"
            android:text="Q7: Who is in Col. john Sheppard's team? (multiplie choice)" />
        <CheckBox
            android:id="@+id/notify_me_checkbox6"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:buttonTint="@color/mycol"
            android:text="Dr. Rodney Mckay"
            android:textAppearance="?android:textAppearanceMedium"
            />
        <CheckBox
            android:id="@+id/notify_me_checkbox7"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:buttonTint="@color/mycol"
            android:text="Jhonas Quinn"
            android:textAppearance="?android:textAppearanceMedium"
            />
        <CheckBox
            android:id="@+id/notify_me_checkbox8"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:buttonTint="@color/mycol"
            android:text="Teayla Emmagan"
            android:textAppearance="?android:textAppearanceMedium"
            />
        <CheckBox
            android:id="@+id/notify_me_checkbox9"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:buttonTint="@color/mycol"
            android:text="Dr. Carson Beckett"
            android:textAppearance="?android:textAppearanceMedium"
            />
        <CheckBox
            android:id="@+id/notify_me_checkbox10"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:buttonTint="@color/mycol"
            android:text="Dr. Radek Zelenka"
            android:textAppearance="?android:textAppearanceMedium"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/orange"
            android:textSize="20dp"
            android:textStyle="bold"
            android:text="Q8: How many glyphs are on the stargate?" />
        <EditText
            android:id="@+id/third"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:textColor="@color/mycol"
            android:textColorHint="@color/mycol"
            android:buttonTint="@color/mycol"
            android:hint="number"
            android:inputType="textMultiLine"/>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/orange"
            android:textSize="20dp"
            android:textStyle="bold"
            android:text="Q9: Wich one is 'the Fifth Race'?" />
        <RadioGroup
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/radiogroup4"
            android:orientation="vertical">
            <RadioButton
                android:id="@+id/yes_radio_button_4"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textColor="@color/mycol"
                android:buttonTint="@color/mycol"
                android:text="Jaffa"
                android:textAppearance="?android:textAppearanceMedium" />

            <RadioButton
                android:id="@+id/no_radio_button_4"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textColor="@color/mycol"
                android:buttonTint="@color/mycol"
                android:text="Human"
                android:textAppearance="?android:textAppearanceMedium" />
        </RadioGroup>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:onClick="eval"
            android:text="Evaluate!" />
    </LinearLayout>
</ScrollView>
