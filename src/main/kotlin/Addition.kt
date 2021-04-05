 fun main(){
     println("enter first number")
     val a: Int = readLine()!!.toInt()
     println("enter second number")
     val b: Int = readLine()!!.toInt()
        sum(a,b)
    }

    fun sum(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }
