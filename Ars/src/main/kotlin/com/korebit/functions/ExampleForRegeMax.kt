package com.korebit.functions

fun main() {
    val inputStream = object {}.javaClass.classLoader.getResourceAsStream("herramientas.txt")
        ?: error("Archivo herramientas.txt no encontrado en classpath")

    val marcas = listOf(
        "Truper", "Pretul", "Dewalt", "Bosch", "Surtek", "Milwaukee", "Stanley",
        "Makita", "Ryobi", "Black And Decker", "Craftsman", "Chicago Electric", "Bellota", "QEP"
    )

    val lines = inputStream.bufferedReader().readLines()

    val herramientasNormalizadas = lines.map { normalizarHerramienta(it, marcas) }

    herramientasNormalizadas.forEach { println(it) }
}

fun normalizarHerramienta(linea: String, marcas: List<String>): String {
    var texto = linea.trim()

    // 1. Capitalizar cada palabra de forma estándar
    texto = texto.lowercase().split(" ").joinToString(" ") { palabra ->
        palabra.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    }.replace(Regex("\\s+"), " ")

    // 2. Unificar formato de pulgadas
    texto = texto.replace(Regex("(?i)(\\d+/\\d+)(\\s*['\"]|\\s*pulgadas?)"), "$1”")
    texto = texto.replace(Regex("(\\d+)\\s*pulgadas?", RegexOption.IGNORE_CASE), "$1”")

    // 3. Detectar marca y moverla al inicio si es necesario
    val marcaEncontrada = marcas.firstOrNull { marca ->
        Regex("\\b$marca\\b", RegexOption.IGNORE_CASE).containsMatchIn(texto)
    }

    if (marcaEncontrada != null && !texto.startsWith(marcaEncontrada, ignoreCase = true)) {
        // Remover la marca de donde esté
        texto = texto.replace(Regex("\\b$marcaEncontrada\\b", RegexOption.IGNORE_CASE), "").trim()
        // Insertar al inicio
        texto = "$marcaEncontrada $texto"
    }

    // 4. Detectar modelo (como códigos alfanuméricos tipo DCD996B, 17202, M9400B)
    val modeloMatch = Regex("\\b([A-Z]{2,}[\\w-]+|\\d{4,})\\b").find(texto)
    val modelo = modeloMatch?.value ?: ""

    if (modelo.isNotEmpty()) {
        texto = texto.replace(modelo, "").trim()
        texto = "$texto - $modelo"
    }

    return texto
}
