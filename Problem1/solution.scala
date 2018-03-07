object Solution extends App{
  val sum = (1 to 1000).filter(x=> (x%3==0 || x%5==0)).sum
  assert(sum == 234168)
}
