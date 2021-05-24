/*
 * Complete the 'hourglassSum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun hourglassSum(arr: Array<Array<Int>>): Int {
    // Write your code here
    var maxSum: Int = -99999
    var temp: Int 
    
    for (i in 1 .. 4) {
        for (j in 1 .. 4) {
            temp =  arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] +
                                   arr[i][j] +
                    arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]
            maxSum = if (temp >= maxSum ) temp else maxSum
        }
    }
    
    return maxSum

}
