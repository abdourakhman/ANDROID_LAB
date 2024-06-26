package ma.gemadec.articleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ma.gemadec.articleapp.ui.theme.ArticleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun ArticleImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.Top
            ){
        Image(
            painter = image,
            contentDescription = null,
        )
        ArticleTitle(
            title = stringResource(R.string.article_title)
        )
        ArticleResume(
            body = stringResource(R.string.article_resume)
        )
        ArticleDetails(
            body = stringResource(R.string.article_detail)
        )
    }
}

@Composable
fun ArticleTitle( title: String, modifier: Modifier = Modifier){
    Text(
        text = title,
        fontSize = 24.sp,
        modifier = modifier
            .padding(16.dp)
    )
}

@Composable
fun ArticleResume( body: String, modifier: Modifier = Modifier){
    Text(
        text = body,
        textAlign = TextAlign.Justify ,
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp)
    )
}
@Composable
fun ArticleDetails( body: String, modifier: Modifier = Modifier){
    Text(
        text = body,
        textAlign = TextAlign.Justify ,
        modifier = modifier
            .padding(16.dp)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArticlePreview() {
    ArticleAppTheme {
        ArticleImage()
    }
}