package com.raywenderlich.android.lab1.screens

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.raywenderlich.android.lab1.R
import androidx.compose.ui.graphics.vector.ImageVector
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

private val items=listOf(
    BookCategory(
        R.string.android,
        listOf(
            R.drawable.android_aprentice,
            R.drawable.saving_data_android,
            R.drawable.advanced_architecture_android
        )
    ),
    BookCategory(
        R.string.kotlin,
        listOf(
            R.drawable.kotlin_corountines,
            R.drawable.kotlin_aprentice
        )
    ),
    BookCategory(
        R.string.swift,
        listOf(
            R.drawable.combine,
            R.drawable.rx_swift,
            R.drawable.swift_apprentice,
        )
    ),


    BookCategory(
        R.string.ios,
        listOf(
            R.drawable.core_data,
            R.drawable.ios_apprentice,
        )
    )
)



private val items = listOf(
    Icons.Filled.Check,
    Icons.Filled.Close,
    Icons.Filled.ThumbUp,
    Icons.Filled.Build,
    Icons.Filled.Delete,
    Icons.Filled.Home,
    Icons.Filled.ThumbUp,
    Icons.Filled.Build,
    Icons.Filled.ThumbUp,
)
@Composable
fun ListScreen(){
    MyList()

    fun GridScreen(){
        GridView(columnCount=3)
        BackButtonHandler {
            FundamentalsRouter.navigateTo(Screen.Navigation)
        }
    }

    @Composable
    fun MyList() {
        TODO("Not yet implemented")
        fun GridView(columnCount: Int) {

        }

        @Composable
        fun ListItem(bookCategory: BookCategory, modifier: Modifier=Modifier){
            fun RowItem(rowItems:List<IconResource>){

            }

            data class BookCategory(
                @StringRes
                val categoryResourceId: Int,
                val bookImageResource: List<Int>
            )
            data class IconResource(val imageVector: ImageVector, val isVisible: Boolean) {

            }