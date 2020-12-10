package com.nonamer777.madlevel5task2.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.nonamer777.madlevel5task2.R
import com.nonamer777.madlevel5task2.databinding.FragmentAddGameBinding
import com.nonamer777.madlevel5task2.model.GameBacklogViewModel
import com.nonamer777.madlevel5task2.utils.viewBinding.IViewBindingHolder
import com.nonamer777.madlevel5task2.utils.viewBinding.ViewBindingHolder

/**
 * A [Fragment] subclass where a User can add a game to the backlog.
 */
class AddGameFragment : Fragment(), IViewBindingHolder<FragmentAddGameBinding> by ViewBindingHolder() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = initBinding(FragmentAddGameBinding.inflate(layoutInflater), this) {

        // Updates the actionbar according to the fragment's needs.
        MainActivity.actionBar?.title = getString(R.string.fragment_title_add_game)
        MainActivity.actionBar?.setHomeButtonEnabled(true)
        MainActivity.actionBar?.setDisplayHomeAsUpEnabled(true)

        btnSaveGame.setOnClickListener { onAddGame() }

    /** Handles adding a game to the backlog. */
    private fun onAddGame() = requireBinding {
    }
    }
}