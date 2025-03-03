package com.example.atv06_studioandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atv06_studioandroid.ui.theme.Atv06_StudioAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Atv06_StudioAndroidTheme {
                BookDetailsScreen()
            }
        }
    }
}

@Composable
fun BookDetailsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Gray)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(text = "The Silkworm", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text(text = "Robert Galbraith", fontSize = 14.sp, color = Color.Gray)
                Text(text = "June 19, 2014", fontSize = 12.sp, color = Color.Gray)
            }

            Button(
                onClick = { /* Ação do botão */ },
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "READ")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CategoryItem("4.0", "Stars")
            CategoryItem("Mystery &", "Thrillers")
            CategoryItem("Similar", "")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Descrição do livro
        Text(
            text = "Private investigator Cormoran Strike returns in a new mystery from Robert Galbraith, author of the #1 International bestseller The Cuckoo's Calling.",
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "READ MORE",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )
    }
}


@Composable
fun CategoryItem(title: String, subtitle: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.LightGray, shape = RoundedCornerShape(50))
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = title, fontSize = 14.sp, fontWeight = FontWeight.Bold)
        Text(text = subtitle, fontSize = 12.sp, color = Color.Gray)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBookDetailsScreen() {
    BookDetailsScreen()
}