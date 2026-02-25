package com.example.jetpackcomposemissionandroid.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyColumnExample() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        items(20) { index ->

            Text(
                text = "Item $index",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .background(
                        color = Color.DarkGray,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(16.dp)
            )

        }

    }
}

@Composable
fun LazyRowExample() {

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        items(20) { index ->

            Text(
                text = "Item $index",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .background(
                        color = Color.DarkGray,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(16.dp)
            )

        }

    }
}

@Composable
fun NestedLazyLists() {

    LazyColumn(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {

        items(10) { rowIndex ->

            Text(
                text = "Row $rowIndex",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                items(15) { index ->

                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .background(
                                color = Color.LightGray,
                                shape = RoundedCornerShape(16.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Item $index")
                    }

                }

            }

        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TypesOfItem() {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        // 01 - item
        LazyColumn() {
            item { Text(text = "Header") }
        }

        // 02 - items(count)
        LazyColumn() {

            items(10) { index ->
                Text("Item $index")
            }

        }

        // 03 - items(list)
        val names = listOf("Alice", "Bob", "Charlie", "David", "Eve")

        LazyColumn() {

            items(names) { name ->
                Text(name)
            }

        }

        // 04 - itemsIndexed(list)
        LazyColumn() {

            itemsIndexed(names) { index, name ->
                Text(text = "Name: $name, Index: $index")
            }

        }

    }

}
