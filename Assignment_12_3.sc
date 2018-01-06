
//Create a list of tuples, where the 1st element of
// the tuple is an int and the second element is a string.
var listOfTuples :List[(Int,String)] = List()
var strelement :String =""
var totalnum :Int=0

 listOfTuples = listOfTuples :+ ((1,"alpha"))
 listOfTuples = listOfTuples :+ ((2,"beta"))
 listOfTuples = listOfTuples :+ ((3,"gamma"))
 listOfTuples = listOfTuples :+ ((4,"omega"))
 listOfTuples = listOfTuples :+ ((5,"zeta"))

 println("list of tuples :"+ listOfTuples)


// problem 1
//print the numbers where the corresponding string length is 4
for ( element <-  listOfTuples){
  strelement = element._2
  if(strelement.length==4){
    println("numbers where the corresponding string :"+element._1)
  }
}


//problem 2
//find the average of all numbers, where the corresponding string contains
// alphabet ‘m’ or alphabet ‘z’

for (element <- listOfTuples){
     strelement = element._2
     if(strelement.contains('m') || strelement.contains('z')){
       totalnum= totalnum + element._1
     }
}

println("Total addition of num :"+ totalnum)
println("Avg of total  num :"+ totalnum/2)







