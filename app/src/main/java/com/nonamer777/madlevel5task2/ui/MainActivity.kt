package com.nonamer777.madlevel5task2.ui

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar
import com.nonamer777.madlevel5task2.R
import com.nonamer777.madlevel5task2.databinding.ActivityMainBinding
import com.nonamer777.madlevel5task2.model.Game
import com.nonamer777.madlevel5task2.model.GameBacklogViewModel
import com.nonamer777.madlevel5task2.utils.undoListener.ClearBacklogUndoListener

class MainActivity : AppCompatActivity() {

    companion object {
        var actionBar: ActionBar? = null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))

        MainActivity.actionBar = supportActionBar
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        // Navigates to the backlog whenever the user presses the 'back to home' icon.
        android.R.id.home -> {
            findNavController(R.id.nav_host_fragment)
                .navigate(R.id.action_addGameFragment_to_backlogFragment)

            true
        }
        else -> super.onOptionsItemSelected(item)
    }
}
