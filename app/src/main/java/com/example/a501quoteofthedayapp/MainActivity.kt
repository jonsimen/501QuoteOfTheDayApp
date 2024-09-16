package com.example.a501quoteofthedayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.a501quoteofthedayapp.ui.theme._501QuoteOfTheDayAppTheme
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _501QuoteOfTheDayAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    QuoteButton()
                }
            }
        }
    }
}


@Composable
fun QuoteButton() {
    val quoteList = arrayOf(
        "Push harder every day—you’ll see the results eventually.",
        "The journey is long, but every step counts for something.",
        "Success comes to those who stay the course, wherever it leads.",
        "Chase your dreams—they know the way.",
        "Believe in yourself, and others might follow.",
        "Work in silence, and let success be the sound... if it makes any.",
        "Persevere, even when it’s hard to tell why.",
        "The harder the climb, the better the view—if you ever reach it.",
        "Every obstacle is just a stepping stone—where it leads is up to you.",
        "Commit fully, and you’ll figure out the rest along the way.",
        "Don’t stop when you’re tired, stop when it feels right.",
        "Success is just a matter of time—how much, no one knows.",
        "Greatness is within reach, but it’s not always clear how close.",
        "Keep your eyes on the prize, even when it’s hard to see.",
        "Go the extra mile—it’s always less crowded there, for better or worse."
    )
    var index by remember {
        mutableIntStateOf((0..14).random())
    }
    Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(100.dp)) // Add some spacing between the button and the quote
        Button (
            onClick = {
                index = (0..14).random()
            },
        ) {
            Text(text = "Next Quote")
        }
        Text(
            text = quoteList[index],
            fontSize = 32.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Italic,
            color = Color.Red,
            textAlign = TextAlign.Center
            )
    }
}
