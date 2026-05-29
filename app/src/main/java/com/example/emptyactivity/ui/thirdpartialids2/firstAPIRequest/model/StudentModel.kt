package com.example.emptyactivity.ui.thirdpartialids2.firstAPIRequest.model

/**
 * Representa un estudiante individual con sus atributos principales.
 *
 * Ejemplo JSON:
 * ```json
 * {
 *   "name": "Juan Pérez",
 *   "studentId": "STU001",
 *   "hobby": "Programación",
 *   "photoUrl": "https://example.com/photos/juan.jpg"
 * }
 * ```
 *
 * @property name Nombre completo del estudiante
 * @property studentId Identificador único del estudiante en el sistema
 * @property hobby Hobby o actividad favorita del estudiante
 * @property photoUrl URL de la foto de perfil del estudiante
 */
data class Student(
    val name: String,
    val studentId: String,
    val hobby: String,
    val photoUrl: String
)


/**
 * Wrapper para la respuesta de la API que contiene una lista de estudiantes.
 * Se utiliza para deserializar la respuesta JSON del servidor.
 *
 * Ejemplo JSON:
 * ```json
 * {
 *   "students": [
 *     {
 *       "name": "Juan Pérez",
 *       "studentId": "STU001",
 *       "hobby": "Programación",
 *       "photoUrl": "https://example.com/photos/juan.jpg"
 *     },
 *     {
 *       "name": "María García",
 *       "studentId": "STU002",
 *       "hobby": "Diseño",
 *       "photoUrl": "https://example.com/photos/maria.jpg"
 *     }
 *   ]
 * }
 * ```
 *
 * @property students Lista de estudiantes obtenida del servidor
 */
data class StudentsResponse(
    val students: List<Student>
)

val respuesta = StudentsResponse(
    students = listOf(
        Student("Jorge Diego Chaparro Núñez", "14446", "Read, Gym and Videogames", "https://pbs.twimg.com/media/HCEaIijWAAAUrwn?format=jpg&name=large"),
        Student("César Chavira", "12366", "Sports", "https://images.meme-arsenal.com/66c6c9651f0f1fb7ba476cb032cb9e19.jpg"),
        Student("Justin Contreras", "13634", "Tenis", "https://media.spoferan.com/sport-types/11/images/tennis-jpg/1248x702.webp")
    )
)
