package com.phoenix.pizza.ui


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.phoenix.pizza.domain.PizzaSize
import com.phoenix.pizza.domain.PizzaSizeType
import com.phoenix.pizza.domain.entity.PizzaListItem
import com.phoenix.pizza.presentation.PizzaListState
import com.phoenix.pizza.presentation.PizzaListViewModel
import com.phoenix.progress.FullScreenProgressIndicator
import com.phoenix.progress.R


@Composable
internal fun PizzaListScreen(
    PizzaListViewModel : PizzaListViewModel,
    modifier: Modifier = Modifier
) {
    val state by PizzaListViewModel.state.observeAsState(PizzaListState.Loading)

    LaunchedEffect(Unit) {
        PizzaListViewModel.LoadData()
    }

    Column(modifier = modifier.fillMaxSize()) {
        Title()

        when (val currentState = state){
            is PizzaListState.Initial,
            is PizzaListState.Loading -> FullScreenProgressIndicator()
            is PizzaListState.Content -> PizzaContentList(PizzaListItems = currentState.pizza)
            is PizzaListState.Error -> PizzaError()

        }

    }

}

@Composable
fun PizzaError() {
    TODO("Not yet implemented")
}

@Composable
fun PizzaContentList(PizzaListItems : List<PizzaListItem> ) {
    LazyColumn(
        Modifier.fillMaxSize()) {
        items(PizzaListItems){item ->
            PizzaContentListItem(item = item)
        }
    }

}

@Composable
fun PizzaContentListItem(item : PizzaListItem) {

    val baseUrl = "https://shift-intensive.ru"

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = "${baseUrl}${item.img}",
            contentDescription = item.name,
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = item.name,
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = item.description,
                style = MaterialTheme.typography.bodySmall,
                maxLines = 2
            )

            Spacer(modifier = Modifier.height(8.dp))

            val minPrice = item.sizes.minOfOrNull { it.price } ?: 0
            Text(
                text = "от $minPrice ₽",
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }

}

@Composable
fun Title() {

    Text(
        text = "Пиццы",
        style = MaterialTheme.typography.titleLarge
    )
}


@Preview(showBackground = true)
@Composable
fun PizzaContentListPreview() {

    val testPizzas = listOf(
        PizzaListItem(
            id = "1",
            name = "ШИФТ Суприм",
            description = "Шифт пицца с пепперони, колбасой, зеленым перцем, луком, оливками и шампиньонами.",
            img = "/static/images/pizza/1.webp",
            sizes = arrayOf(
                PizzaSize(PizzaSizeType.SMALL,499 ),
                PizzaSize(PizzaSizeType.MEDIUM, 650)
            )
        ),
        PizzaListItem(
            id = "2",
            name = "Маргарита",
            description = "Классическая пицца с томатным соусом, моцареллой и листьями базилика",
            img = "/static/images/pizza/2.webp",
            sizes = arrayOf(
                PizzaSize(PizzaSizeType.SMALL,499 ),
                PizzaSize(PizzaSizeType.MEDIUM, 650)
            )
        )
    )

    PizzaContentList(PizzaListItems = testPizzas)
}