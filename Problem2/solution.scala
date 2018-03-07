object Solution extends App {
  def fibSum(low_num:Int, high_num:Int, sum:Int) : Int = {
    var new_num:Int = low_num + high_num
    if(new_num > 4000000){
      return sum
    } else {
      if(new_num%2==0) {
        return fibSum(high_num, new_num, sum+new_num)
      } else {
        return fibSum(high_num, new_num, sum)
      }
    }
  }

  printf("%d", fibSum(0,1,0))

}
