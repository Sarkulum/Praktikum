import java.util.*

fun main() {
    // Initialize Scanner
    val scanner = Scanner(System.`in`)

    // shape type
    println("Enter the shape (CIRCLE, SQUARE, TRIANGLE):")
    val shapeInput =
        scanner.nextLine().uppercase(Locale.getDefault()) // shape input to string and uppercase so there is no error when you input lowercase
    val geometricShape = try {
        GeometricShape.valueOf(shapeInput)  // Convert string to enum value
    } catch (e: IllegalArgumentException) {
        println("Invalid shape type! Using default shape TRIANGLE.")
        GeometricShape.TRIANGLE // Default to TRIANGLE if input is invalid
    }

    // Create shape based on input
    val shape = getShape(geometricShape)

    // Ask for dimension inputs
    when (geometricShape) {
        GeometricShape.CIRCLE -> {
            println("Enter the radius of the circle in cm (z.B. 20):")
            shape.a = scanner.nextDouble()
        }
        GeometricShape.SQUARE -> {
            println("Enter the side length of the square in cm (z.B. 20):")
            shape.a = scanner.nextDouble()
        }
        GeometricShape.TRIANGLE -> {
            println("Enter the base of the triangle in cm (z.B. 20):")
            shape.a = scanner.nextDouble()
            println("Enter the height of the triangle in cm (z.B. 20):")
            shape.b = scanner.nextDouble()
            println("Enter the other two sides of the triangle in cm (z.B. 20):")
            shape.c = scanner.nextDouble()
            shape.d = scanner.nextDouble()
        }
    }

    // Perform calculations
    when (shape) {
        is Circle -> {
            shape.area()
            shape.circumference()
            shape.printResults()
            shape.printHelloWorld()
        }
        is Square -> {
            shape.area()
            shape.printResults()
        }
        is Triangle -> {
            shape.area()
            shape.circumference()
            shape.printResults()
        }
    }

    // Close the scanner
    scanner.close()
}

open class Calculation(var a: Double, var b: Double, var c: Double = 0.0, var d: Double = 0.0, val geometricShape: GeometricShape) {
    open fun printResults() {
        println("Results for the shape are not defined.")
    }
    fun printHelloWorld(){
        println("Hello World!")
    }
}

open class Triangle(a: Double, b: Double, c: Double, d: Double) : Calculation(a, b, c, d, GeometricShape.TRIANGLE) {
    var out1 = 0.0  // Area
    var out2 = 0.0  // Perimeter

    // calculate area of triangle
    fun area(): Double {
        out1 = 0.5 * a * b  // Area = (1/2) * base * height
        return out1
    }

    // calculate perimeter of  triangle
    fun circumference(): Double {
        out2 = a + b + c  // Perimeter = a + b + c
        return out2
    }

    // Override printResults to round the results
    override fun printResults() {
        val roundedArea = String.format("%.2f", out1)
        val roundedCircumference = String.format("%.2f", out2)

        println("The area of the triangle is $roundedArea cm^2 and the Circumference is $roundedCircumference cm.")
    }

}

open class Circle(a: Double) : Calculation(a, 0.0, 0.0, 0.0, GeometricShape.CIRCLE) {
    var out1 = 0.0  // Area
    var out2 = 0.0  // Circumference

    // calculate  area of circle
    fun area(): Double {
        out1 = Math.PI * a * a  // Area = pi * r^2
        return out1
    }

    // calculate the circumference of the circle
    fun circumference(): Double {
        out2 = 2 * Math.PI * a // Circumference = 2 * pi * r
        return out2
    }

    // Override printResults to round the results
    override fun printResults() {
        val roundedArea = String.format("%.2f", out1)
        val roundedCircumference = String.format("%.2f", out2)

        println("The area of the circle is $roundedArea cm^2 and the Circumference is $roundedCircumference cm.")
    }
}

open class Square(a: Double, b: Double = 0.0, c: Double = 0.0, d: Double = 0.0) : Calculation(a, b, c, d, GeometricShape.SQUARE) {
    var out1 = 0.0  // Area

    // calculate the area of the square
    fun area(): Double {
        out1 = a * a  // Area = side^2
        return out1
    }

    // Override printResults to round the results
    override fun printResults() {
        val roundedArea = String.format("%.2f", out1)

        println("The area of the square is $roundedArea cm.")
    }
}

// Function to return the correct shape based on the enum
fun getShape(geometricShape: GeometricShape): Calculation {
    return when (geometricShape) {
        GeometricShape.CIRCLE -> Circle(5.0)  // Use only the radius (a) for Circle
        GeometricShape.SQUARE -> Square(5.0)
        GeometricShape.TRIANGLE -> Triangle(5.0, 8.0, 5.0, 5.0)
    }
}

// Enum for geometric shapes
enum class GeometricShape {
    TRIANGLE, CIRCLE, SQUARE
}
