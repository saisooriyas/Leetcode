import java.util.Scanner

class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val pascalval : MutableList<Int> = mutableListOf()
        val pascal : MutableList<MutableList<Int>> = mutableListOf()

        for (times in 0..<numRows) {
            val tempPascalval = pascalval.toMutableList()
            for (index in 0..times) {
                tempPascalval.add(check(times, index))
            }
            pascal.add(tempPascalval)
        }
        return pascal
    }

    private fun check(n : Int, k : Int): Int {
        var res = 1
        var c = k
        if (k> n-k)
            c = n-k

        for (i in 0..<c){
            res *= (n - i)
            res /= (i + 1)
        }
        return res
    }

}



fun main() {
    val sc = Scanner(System.`in`)
    val sol = Solution()
    val value = sc.nextInt()
    print(sol.generate(value))
}