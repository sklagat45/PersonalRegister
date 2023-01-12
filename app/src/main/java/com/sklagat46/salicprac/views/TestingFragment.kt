package com.sklagat46.salicprac.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sklagat46.salicprac.R
import com.sklagat46.salicprac.views.adapters.RecyclerAdapter
import kotlinx.android.synthetic.main.fragment_testing.*

/**
 * A simple [Fragment] subclass.
 */
class TestingFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_testing, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        recycler_view.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = RecyclerAdapter()
        }
    }
}