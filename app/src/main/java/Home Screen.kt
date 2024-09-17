package com.example.musicapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(){
   AppTitle()
}

@Composable
fun AppTitle(){
    Box(modifier = Modifier.fillMaxSize()){
    Column (modifier = Modifier.padding(15.dp).fillMaxSize(), horizontalAlignment = Alignment.Start) {
        Row(modifier = Modifier.padding(10.dp).fillMaxWidth()) {
            Image(
                painter = painterResource(R.drawable.images__3_),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(50.dp))
            Text(
                text = "Sound\nWave",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                modifier = Modifier.padding(10.dp),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.width(50.dp))

            IconButton(onClick = {}){
                Icon(painter = painterResource(R.drawable.menu),"Settings")
            }



        }
        Row{
            ListOfSongs()
        }
        Row{
                Text(
                    text = "Made for you",
                    fontSize = 25.sp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(10.dp).fillMaxWidth(),
                    fontWeight = FontWeight.Bold
                )
        }
        Row{
            TodayHit()
        }
        Row{
            Column(modifier = Modifier.fillMaxWidth()){
                Text(text = "Discover Weekly",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    text = "Today's Hits",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }

        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.Start)){
            DiscoverWeekly()
        }
        Row(modifier = Modifier.padding(10.dp).fillMaxSize(),
            verticalAlignment = Alignment.Bottom)
        {
            ButtonIcon()
        }

    }

    }
}
@Composable
fun TodayHit(){
    var todayList = getAllTodayHit()
    LazyRow(content = {
        itemsIndexed(todayList, itemContent = { index, item ->
            ListOfTodayList(item)
        })
    })
}
@Composable
fun DiscoverWeekly(){
    var todayList = getAllTodayHit()
    LazyRow(content = {
        itemsIndexed(todayList, itemContent = { index, item ->
            ListOfWeek(item)
        })
    })
}
@Composable
fun ListOfTodayList(item: TodayHit){
    Row(modifier = Modifier.fillMaxWidth().padding(10.dp)){

        Column(modifier = Modifier.padding(10.dp)){
            Image(
                painter = painterResource(item.songArtwork),
                contentDescription = "music artwork",
                modifier = Modifier.size(150.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = item.artistName,
                textAlign = TextAlign.Center
            )
        }
    }
}
@Composable
fun ListOfWeek(item: TodayHit){
    Row(modifier = Modifier.fillMaxWidth().padding(10.dp)){

        Column(modifier = Modifier.padding(10.dp)){
            Image(
                painter = painterResource(item.songArtwork),
                contentDescription = "music artwork",
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = item.artistName,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun ListOfSongs(){
    var musiclist = getAllMusicList()
    LazyRow(content = {
        itemsIndexed(musiclist, itemContent = { index, item ->
            ListOfmusicItem(item)
        })
    })

}
@Composable
fun ListOfmusicItem(item: MusicList){
    Row(modifier = Modifier.fillMaxWidth().padding(10.dp)){

        Column(modifier = Modifier.padding(10.dp)){
            Image(
                painter = painterResource(item.songArtwork),
                contentDescription = "music artwork",
                modifier = Modifier.clip(CircleShape).size(70.dp)
            )
            Text(
                text = item.artistName,
                textAlign = TextAlign.Center
            )
            Text(
                text = item.songTitle,
                modifier = Modifier.padding(5.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun ButtonIcon(){
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
        IconButton(onClick = {}){
            Icon(painter = painterResource(R.drawable.favorite),
                "favorites",
                modifier = Modifier.size(150.dp)
            )
        }
        Spacer(modifier = Modifier.width(30.dp))
      IconButton(onClick = {}){
          Icon(painter = painterResource(R.drawable.playlist),
              "PlayList",
              modifier = Modifier.size(150.dp)
          )
      }

    }
}


@Preview (showBackground = true)
@Composable
fun HomeScreenPrevie(){
    AppTitle()
}
