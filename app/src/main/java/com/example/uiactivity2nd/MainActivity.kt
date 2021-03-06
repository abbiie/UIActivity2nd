package com.example.uiactivity2nd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.GoAlbum -> {
                startActivity(Intent(this, Album::class.java))
                true
            }
            R.id.GoSongs -> {
                startActivity(Intent(this, Songs::class.java))
                true
            }
            R.id.SongQueue -> {
                startActivity(Intent(this, SongQueue::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}