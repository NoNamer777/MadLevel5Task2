package com.nonamer777.madlevel5task2.ui

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.nonamer777.madlevel5task2.R
import com.nonamer777.madlevel5task2.databinding.FragmentBacklogBinding
import com.nonamer777.madlevel5task2.model.Game
import com.nonamer777.madlevel5task2.model.GameBacklogViewModel
import com.nonamer777.madlevel5task2.utils.undoListener.RemoveGameUndoListener
import com.nonamer777.madlevel5task2.utils.viewBinding.IViewBindingHolder
import com.nonamer777.madlevel5task2.utils.viewBinding.ViewBindingHolder

/**
 * A [Fragment] subclass that shows the game backlog.
 */
class BacklogFragment: Fragment(), IViewBindingHolder<FragmentBacklogBinding> by ViewBindingHolder() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = initBinding(
        FragmentBacklogBinding.inflate(layoutInflater),
        this
    ) {

        // Updates the actionbar according to the fragment's needs.
        MainActivity.actionBar?.title = getString(R.string.fragment_title_backlog)
        MainActivity.actionBar?.setHomeButtonEnabled(false)
        MainActivity.actionBar?.setDisplayHomeAsUpEnabled(false)

        btnAddGame.setOnClickListener {
            Navigation.findNavController(root)
                .navigate(R.id.action_backlogFragment_to_addGameFragment)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
