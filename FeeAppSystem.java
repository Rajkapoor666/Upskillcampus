_____________________________________________________________________________________________________________________________
//activity_main.xml(1st frontent code )
_____________________________________________________________________________________________________________________________
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@android:color/white"
    android:orientation="vertical"
    tools:context=".MainActivity">


    <View
        android:id="@+id/line1"
        android:layout_width="50dp"
        android:layout_height="4dp"
        android:layout_marginStart="20dp"
        android:layout_marginTop="10dp"
        android:background="@color/black"
        tools:ignore="MissingConstraints" />

    <View

        android:id="@+id/line2"
        android:layout_width="50dp"
        android:layout_height="4dp"
        android:layout_below="@+id/line1"
        android:layout_marginStart="20dp"
        android:layout_marginTop="5dp"
        android:background="@color/black"
        tools:ignore="MissingConstraints" />

    <View
        android:id="@+id/line3"
        android:layout_width="50dp"
        android:layout_height="4dp"
        android:layout_below="@+id/line2"
        android:layout_marginStart="20dp"
        android:layout_marginTop="5dp"
        android:background="@color/black"
        tools:ignore="MissingConstraints" />

    <TextView
        android:id="@+id/home"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="30sp"
        android:layout_marginLeft="45dp"
        android:layout_marginTop="6dp"
        android:layout_toRightOf="@+id/line3"
        android:text="Home"
        android:textSize="25dp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <View
        android:id="@+id/line4"
        android:layout_width="match_parent"
        android:layout_height="4dp"
        android:layout_below="@+id/home"
        android:layout_marginTop="5dp"
        android:background="@android:color/holo_green_light"
        tools:ignore="MissingConstraints" />

    <TextView
        android:id="@+id/box"
        android:layout_width="364dp"
        android:layout_height="136dp"
        android:layout_below="@+id/line4"
        android:layout_alignParentStart="true"
        android:layout_alignParentEnd="true"
        android:layout_marginStart="25dp"
        android:layout_marginTop="31dp"
        android:layout_marginEnd="22dp"
        android:background="@android:color/holo_green_light"

        android:text="   \n    SHAMSHAD ALAM\n     SEM 4TH \n\n    Addendence  52%       Fee              100%"
        android:textColor="#FF0000"
        android:textSize="16sp" />

    <View
        android:id="@+id/boxline5"
        android:layout_width="150dp"
        android:layout_height="4dp"
        android:layout_below="@+id/line2"
        android:layout_alignEnd="@+id/box"
        android:layout_marginStart="97dp"
        android:layout_marginTop="180dp"
        android:layout_marginEnd="49dp"
        android:layout_toEndOf="@+id/boxline7"
        android:background="@color/black"
        tools:ignore="MissingConstraints" />

    <View
        android:id="@+id/boxline6"
        android:layout_width="52dp"
        android:layout_height="4dp"
        android:layout_below="@+id/line2"
        android:layout_alignStart="@+id/box"
        android:layout_marginStart="23dp"
        android:layout_marginTop="180dp"
        android:background="@color/black"
        tools:ignore="MissingConstraints" />

    <View
        android:id="@+id/boxline7"
        android:layout_width="43dp"
        android:layout_height="3dp"
        android:layout_below="@+id/line2"
        android:layout_marginStart="100dp"
        android:layout_marginTop="180dp"
        android:background="#D3C9C9"
        tools:ignore="MissingConstraints" />

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="53dp"
        android:layout_height="43dp"
        android:layout_marginStart="35dp"
        android:layout_marginTop="54dp"
        app:srcCompat="@drawable/profile" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignEnd="@+id/box"
        android:layout_alignParentStart="true"
        android:layout_marginStart="30dp"
        android:layout_marginTop="214dp"
        android:layout_marginEnd="3dp"
        android:background="#03A9F4"
        android:text="School Updates"
        android:textSize="20dp" />

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="49dp"
        android:layout_height="46dp"
        android:layout_marginStart="35dp"
        android:layout_marginTop="243dp"
        app:srcCompat="@drawable/img" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="45dp"
        android:layout_marginTop="293dp"
        android:layout_marginEnd="1dp"
        android:text="News"
        android:textStyle="bold" />

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="49dp"
        android:layout_height="46dp"
        android:layout_marginStart="74dp"
        android:layout_marginTop="243dp"
        android:layout_toEndOf="@+id/imageView3"
        app:srcCompat="@drawable/events" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="49dp"
        android:layout_height="wrap_content"
        android:layout_below="@+id/imageView"
        android:layout_marginStart="75dp"
        android:layout_marginTop="5dp"
        android:layout_toEndOf="@+id/textView"
        android:text="Events"
        android:textStyle="bold" />

    <ImageView
        android:id="@+id/imageView4"
        android:layout_width="49dp"
        android:layout_height="46dp"
        android:layout_alignParentEnd="true"
        android:layout_marginStart="24dp"
        android:layout_marginTop="243dp"
        android:layout_toEndOf="@+id/imageView"
        app:srcCompat="@drawable/bulletin" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="57dp"
        android:layout_height="16dp"
        android:layout_marginStart="64dp"
        android:layout_marginTop="293dp"
        android:layout_toEndOf="@+id/textView3"
        android:text="Bulletin"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/textView5"
        android:layout_width="360dp"
        android:layout_height="wrap_content"
        android:layout_alignEnd="@+id/box"
        android:layout_alignParentStart="true"
        android:layout_marginStart="30dp"
        android:layout_marginTop="310dp"
        android:layout_marginEnd="-1dp"
        android:background="#03A9F4"
        android:text="Academics"
        android:textSize="19dp" />

    <ImageView
        android:id="@+id/imageView5"
        android:layout_width="49dp"
        android:layout_height="46dp"
        android:layout_alignParentStart="true"
        android:layout_marginStart="35dp"
        android:layout_marginTop="345dp"
        app:srcCompat="@drawable/assignment" />

    <TextView
        android:id="@+id/textView6"
        android:layout_width="92dp"
        android:layout_height="25dp"
        android:layout_marginStart="35dp"
        android:layout_marginTop="389dp"
        android:text="Assignment"
        android:textStyle="bold" />

    <ImageView
        android:id="@+id/imageView6"
        android:layout_width="49dp"
        android:layout_height="46dp"
        android:layout_marginStart="74dp"
        android:layout_marginTop="345dp"
        android:layout_toEndOf="@+id/imageView5"
        app:srcCompat="@drawable/homework" />

    <ImageView
        android:id="@+id/imageView7"
        android:layout_width="49dp"
        android:layout_height="46dp"
        android:layout_alignParentEnd="true"
        android:layout_marginStart="24dp"
        android:layout_marginTop="345dp"
        android:layout_toEndOf="@+id/imageView6"
        app:srcCompat="@drawable/reportcard" />

    <TextView
        android:id="@+id/textView7"
        android:layout_width="80dp"
        android:layout_height="18dp"

        android:layout_marginStart="24dp"
        android:layout_marginTop="389dp"
        android:layout_toEndOf="@+id/textView6"
        android:text="Homework"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/textView8"
        android:layout_width="83dp"
        android:layout_height="20dp"
        android:layout_marginStart="29dp"
        android:layout_marginTop="389dp"
        android:layout_toEndOf="@+id/textView7"
        android:text="Report Card"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/textView9"
        android:layout_width="172dp"
        android:layout_height="wrap_content"
        android:layout_alignStart="@+id/textView5"
        android:layout_alignEnd="@+id/box"
        android:layout_marginTop="418dp"
        android:background="#03A9F4"
        android:text="My Updates"
        android:textSize="20dp" />

    <ImageView
        android:id="@+id/imageView8"
        android:layout_width="49dp"
        android:layout_height="46dp"
        android:layout_alignParentStart="true"
        android:layout_marginStart="35dp"
        android:layout_marginTop="458dp"
        android:layout_marginBottom="125dp"
        android:onClick="onFeesIconClicked"
        app:srcCompat="@drawable/fees" />

    <ImageView
        android:id="@+id/imageView9"
        android:layout_width="49dp"
        android:layout_height="46dp"
        android:layout_marginStart="32dp"
        android:layout_marginTop="458dp"
        android:layout_toEndOf="@+id/imageView8"
        app:srcCompat="@drawable/attendance" />

    <TextView
        android:id="@+id/textView10"
        android:layout_width="49dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="35dp"
        android:layout_marginTop="510dp"
        android:text="Fee"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/textView11"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginTop="510dp"
        android:layout_toEndOf="@+id/textView10"
        android:text="Attedence"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/textView12"
        android:layout_width="360dp"
        android:layout_height="wrap_content"
        android:layout_alignEnd="@+id/box"
        android:layout_alignParentStart="true"
        android:layout_marginStart="30dp"
        android:layout_marginLeft="30dp"
        android:layout_marginTop="530dp"
        android:layout_marginEnd="-1dp"
        android:background="#03A9F4"
        android:text="Communication"
        android:textSize="20dp" />

    <ImageView
        android:id="@+id/imageView10"
        android:layout_width="49dp"
        android:layout_height="46dp"
        android:layout_alignParentStart="true"
        android:layout_marginStart="33dp"
        android:layout_marginTop="580dp"
        app:srcCompat="@drawable/chat" />

    <TextView
        android:id="@+id/textView14"
        android:layout_width="49dp"
        android:layout_height="27dp"
        android:layout_marginStart="37dp"
        android:layout_marginTop="630dp"
        android:text="chat"
        android:textStyle="bold" />

    <ImageView
        android:id="@+id/imageView11"
        android:layout_width="49dp"
        android:layout_height="46dp"
        android:layout_alignEnd="@+id/imageView9"
        android:layout_marginStart="32dp"
        android:layout_marginTop="580dp"
        android:layout_marginEnd="2dp"
        android:layout_toEndOf="@+id/imageView10"
        app:srcCompat="@drawable/sms" />

    <TextView
        android:id="@+id/textView14"
        android:layout_width="49dp"
        android:layout_height="27dp"
        android:layout_below="@+id/imageView11"
        android:layout_alignEnd="@+id/imageView11"
        android:layout_marginTop="7dp"
        android:layout_marginEnd="0dp"
        android:text="SMS"
        android:textStyle="bold" />

    <ImageView
        android:id="@+id/imageView12"
        android:layout_width="49dp"
        android:layout_height="46dp"
        android:layout_marginStart="348dp"
        android:layout_marginTop="50dp"
        app:srcCompat="@drawable/size" />

    <RelativeLayout
        android:id="@+id/relativeLayout"
        android:layout_width="match_parent"
        android:layout_height="80dp"
        android:layout_marginTop="670dp"
        android:background="@android:color/holo_green_light">

        <ImageView
            android:id="@+id/ima"
            android:layout_width="30dp"
            android:layout_height="20dp"
            android:layout_marginStart="38dp"
            android:layout_marginTop="10dp"
            android:layout_marginBottom="5dp"
            app:srcCompat="@drawable/img_1" />

        <TextView
            android:id="@+id/text"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginStart="38dp"
            android:layout_marginTop="40dp"
            android:layout_marginBottom="2dp"
            android:text="Home"
            android:textStyle="bold" />


    </RelativeLayout>
</RelativeLayout>


_____________________________________________________________________________________________________________________________
// mainactivity.java (backend code 1st)
_____________________________________________________________________________________________________________________________

package com.example.feepaid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    ImageView im;
    TextView te;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imageView8);
        im = findViewById(R.id.ima);
        te=findViewById(R.id.text);


        te.setTextColor(Color.GREEN);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }
}


_____________________________________________________________________________________________________________________________
// activity_main2.xml(2nd frontent code )
_____________________________________________________________________________________________________________________________
	
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity2">

    <TextView
        android:id="@+id/textView15"
        android:layout_width="116dp"
        android:layout_height="27dp"
        android:text="Paid Fees"
        android:textSize="20dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.057"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.063" />

    <TextView
        android:id="@+id/textView16"
        android:layout_width="88dp"
        android:layout_height="27dp"
        android:text="Unpaid Fees"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.881"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.063" />

    <!-- TextView to display bill details -->

    <TextView
        android:id="@+id/bill_details_text_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="16dp"
        android:textColor="@android:color/black"
        android:textSize="16sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.559"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/textView15"
        app:layout_constraintVertical_bias="0.306" />

    <TextView
        android:id="@+id/section_message_text_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/bill_details_text_view"
        android:layout_centerHorizontal="true"
        android:layout_marginBottom="48dp"

        android:maxLines="1"
        android:textColor="@android:color/black"
        android:textSize="18sp"
        app:layout_constraintBottom_toTopOf="@+id/bill_details_text_view"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.54"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.925"
        tools:ignore="MissingConstraints" />


</androidx.constraintlayout.widget.ConstraintLayout>



_____________________________________________________________________________________________________________________________
//mainactivity2.java(2nd backend code )
_____________________________________________________________________________________________________________________________

package com.example.feepaid;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private TextView paidTextView;
    private TextView unpaidTextView;
    private TextView billDetailsTextView;
    private TextView sectionMessageTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        paidTextView = findViewById(R.id.textView15);
        unpaidTextView = findViewById(R.id.textView16);
        billDetailsTextView = findViewById(R.id.bill_details_text_view);
        sectionMessageTextView = findViewById(R.id.section_message_text_view);

        paidTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayBillInformation(true);

                sectionMessageTextView.setText("You are in the Paid section.");
                sectionMessageTextView.setTextColor(Color.RED);

                paidTextView.setTextColor(Color.RED);

                unpaidTextView.setTextColor(Color.BLACK);
            }
        });

        unpaidTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayBillInformation(false);
                sectionMessageTextView.setText("You are in the Unpaid section.");
                sectionMessageTextView.setTextColor(Color.GREEN);
                unpaidTextView.setTextColor(Color.RED);
                paidTextView.setTextColor(Color.BLACK);
            }
        });
    }

    private void displayBillInformation(boolean isPaid) {
        String[] billNumbers;
        String[] names;
        String[] dates;
        String[] amounts;

        if (isPaid) {
            billNumbers = new String[]{"01", "02", "03", "04", "05"};
            names = new String[]{"RAJ", "SAMDU", "WAHAB", "SUNIL", "SUMANT"};
            dates = new String[]{"2024-04-19", "2024-04-20", "2024-04-21", "2024-04-22", "2024-04-23"};
            amounts = new String[]{"100", "200", "300", "400", "500"};
        } else {
            billNumbers = new String[]{"11", "12", "13", "14", "15"};
            names = new String[]{"ROCKY", "FATIMA", "GOLU", "HRITIK", "DHONI"};
            dates = new String[]{"2024-04-24", "2024-04-25", "2024-04-26", "2024-04-27", "2024-04-28"};
            amounts = new String[]{"600", "700", "800", "900", "1000"};
        }

        StringBuilder message = new StringBuilder();

        message.append("+--------------+--------------+--------------+-------------------+\n");
        message.append(String.format("| %-12s | %-12s | %-12s | %-17s |\n", "Bill No.", "Name", "Date", "Amount"));

        for (int i = 0; i < billNumbers.length; i++) {
            message.append(String.format("| %-12s | %-12s | %-12s | $%-11s |\n", billNumbers[i], names[i], dates[i], amounts[i]));
        }
        message.append("+--------------+--------------+--------------+-------------------+\n");


        billDetailsTextView.setText(message.toString());
    }
}

