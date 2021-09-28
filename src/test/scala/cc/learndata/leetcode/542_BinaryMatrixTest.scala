package cc.learndata.leetcode


import org.scalatest.FunSuite

class  BinaryMatrixTest extends FunSuite {

  //Test 1
  test("test 1"){
      val m = Array(Array(0,0,0), Array(0,1,0), Array(0,0,0))
    val testResult =
      BinaryMatrix.updateMatrix(m)
    val expectResult = Array(Array(0,0,0), Array(0,1,0), Array(0,0,0))
    assert(testResult === expectResult)

  }

    //Test 2
  test("test 2"){
      val m = Array(Array(0,0,0), Array(0,1,0), Array(1,1,1))
    val testResult =
      BinaryMatrix.updateMatrix(m)
    val expectResult = Array(Array(0,0,0), Array(0,1,0), Array(1,2,1))
    assert(testResult === expectResult)

  }


      //Test 2
  test("test 3"){
      val m = Array(Array(1,1,0,0,1,0,0,1,1,0),
               Array(1,0,0,1,0,1,1,1,1,1),
               Array(1,1,1,0,0,1,1,1,1,0),
               Array(0,1,1,1,0,1,1,1,1,1),
               Array(0,0,1,1,1,1,1,1,1,0),
               Array(1,1,1,1,1,1,0,1,1,1),
               Array(0,1,1,1,1,1,1,0,0,1),
               Array(1,1,1,1,1,0,0,1,1,1),
               Array(0,1,0,1,1,0,1,1,1,1),
               Array(1,1,1,0,1,0,1,1,1,1))
    val testResult =
      BinaryMatrix.updateMatrix(m)

      testResult.foreach(x => println(x.mkString(",")))
      println("===================")
      println("===================")  
    val expectResult = Array(Array(2,1,0,0,1,0,0,1,1,0),
                        Array(1,0,0,1,0,1,1,2,2,1),
                        Array(1,1,1,0,0,1,2,2,1,0),
                        Array(0,1,2,1,0,1,2,3,2,1),
                        Array(0,0,1,2,1,2,1,2,1,0),
                        Array(1,1,2,3,2,1,0,1,1,1),
                        Array(0,1,2,3,2,1,1,0,0,1),
                        Array(1,2,1,2,1,0,0,1,1,2),
                        Array(0,1,0,1,1,0,1,2,2,3),
                        Array(1,2,1,0,1,0,1,2,3,4))
      expectResult.foreach(x => println(x.mkString(",")))
    assert(testResult === expectResult)

  }


}
