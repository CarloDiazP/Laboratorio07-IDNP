package com.example.laboratorio07.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio07.R
import com.example.laboratorio07.adapters.CategoryAdapter
import com.example.laboratorio07.models.Edificio
import com.example.laboratorio07.models.Category

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [EdificiosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EdificiosFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_edificios, container, false)

        // Obtener el RecyclerView
        val recyclerViewCategories: RecyclerView = view.findViewById(R.id.recyclerViewCategories)

        // Crear lista de ejemplo de categorías y edificios
        val edificiosIglesias = listOf(
            Edificio("Iglesia 1", R.drawable.iglesia_prueba),
            Edificio("Iglesia 2", R.drawable.iglesia_prueba),
            Edificio("Iglesia 3", R.drawable.iglesia_prueba)
        )
        val edificiosMuseos = listOf(
            Edificio("Museo 1", R.drawable.iglesia_prueba),
            Edificio("Museo 2", R.drawable.iglesia_prueba),
            Edificio("Museo 3", R.drawable.iglesia_prueba)
        )

        val categories = listOf(
            Category("Iglesias", edificiosIglesias),
            Category("Museos", edificiosMuseos)
        )

        // Configurar RecyclerView
        recyclerViewCategories.layoutManager = LinearLayoutManager(context)
        recyclerViewCategories.adapter = CategoryAdapter(categories)

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment EdificiosFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            EdificiosFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}