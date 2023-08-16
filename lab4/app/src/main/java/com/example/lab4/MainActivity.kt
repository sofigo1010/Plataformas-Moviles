package com.example.lab4


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter


/**
 * MainActivity que utiliza Compose UI. Esta actividad inicializa la interfaz de usuario de la aplicación.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeApp()
        }
    }
}

/**
 * Pantalla principal de la aplicación que permite a los usuarios introducir y ver recetas.
 */
@Composable
fun RecipeApp() {
    // Variables de estado para almacenar y actualizar valores de los campos de texto.
    var recipeName by remember { mutableStateOf(TextFieldValue("")) }
    var imageUrl by remember { mutableStateOf(TextFieldValue("")) }

    // Almacena las recetas ingresadas por el usuario.
    val itemList = remember { mutableStateListOf<Pair<String, String>>() }

    // Layout principal en forma de columna
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
    ) {
        // Título de la página
        Text(
            text = "Bienvenidos a Chefsito!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center, // Centra el texto
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        // Campo de texto para el nombre de la receta
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = recipeName,
            onValueChange = { recipeName = it },
            label = { Text("Nombre de la receta") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Campo de texto para la URL de la imagen
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = imageUrl,
            onValueChange = { imageUrl = it },
            label = { Text("URL de la imagen") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Botón "Agregar" que añade la receta a la lista y limpia los campos de texto
        Button( modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
            onClick = {
            // Verifica que ambos campos no estén vacíos.
            if (recipeName.text.isNotBlank() && imageUrl.text.isNotBlank()) {

                // Verifica si el elemento ya está en la lista.
                val isDuplicate = itemList.any { it.first == recipeName.text && it.second == imageUrl.text }

                if (!isDuplicate) {
                    itemList.add(recipeName.text to imageUrl.text)
                    // Limpia los campos de texto.
                    recipeName = TextFieldValue("")
                    imageUrl = TextFieldValue("")
                } else {
                    println("El elemento ya está en la lista.")
                }
            }
        }) {
            Text("Agregar")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Lista de recetas
        LazyColumn {
            items(itemList) { item ->
                RecipeItem(recipeName = item.first, imageUrl = item.second)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}


/**
 * Componente Composable que muestra un ítem individual de receta, incluyendo una imagen y su nombre.
 *
 * @param recipeName Nombre de la receta.
 * @param imageUrl URL de la imagen de la receta.
 */
@Composable
fun RecipeItem(recipeName: String, imageUrl: String) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(8.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {

        // Imagen de la receta, usando la librería Coil para cargar la imagen desde la URL
        Image(
            painter = rememberImagePainter(data = imageUrl),
            contentDescription = null,
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))

        // Nombre de la receta.
        Text(text = recipeName)
    }
}

/**
 * Vista previa del diseño, utilizable en el IDE de Android Studio para previsualizar la interfaz de usuario.
 */
@Preview(showBackground = true)
@Composable
fun PreviewRecipeApp() {
    RecipeApp()
}
