package com.example.groceriesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), GroceriesClickHandler {
    private val data = createData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = GroceryAdapter(data, this)
        recyclerView.layoutManager = GridLayoutManager(this, 3)

    }

    override fun onItemClick(position: Int) {
        val grocery = data[position]

        Toast.makeText(this, "You picked ${grocery.name}", Toast.LENGTH_SHORT).show()
    }

    /**
     * Uses the repository to collect the raw data and bundles up those values
     * into our Molecule data class, something our adapter knows how to work with
     */
    private fun createData(): List<Grocery> {
        //Get data from the repository
        val names = Repository.groceryName
        val icons = Repository.icons

        val groceryData = ArrayList<Grocery>()
        GroceryId.values().forEach { groceryID ->
            //If the Id is in all lists, add molecule to the ArrayList
            if (containsId(groceryID, names, icons)) {
                groceryData.add(
                    Grocery(
                        name = names[groceryID]!!,
                        icon = icons[groceryID]!!
                    )
                )
            }
        }

        return groceryData
    }

    /**
     * Takes in a molecule id and checks if it is contained within all mappings passed
     */
    private fun containsId(groceryID: GroceryId, vararg maps: Map<GroceryId, Any>): Boolean {
        maps.forEach {
            if (groceryID !in it.keys) { return false }
        }
        return true
    }


}