/**
  * Created by Administrator on 19/07/2017.
  */

import org.scalatest.FunSuite



class CipherTest extends FunSuite {
  val cipher:Cipher = new Cipher

  test("test to see map isn't empty"){
    val result = cipher.map
    assert(result.size == 26)
  }

  test("Test it takes in capital letter"){
    val result = cipher.returnString("WIZARD")
    assert(result =="draziw")
  }

  test("Test to see if inputting numbers doesn't come out with error"){
    val result =cipher.returnString("12345678")
    assert(result =="12345678")
  }

  test("Test to see if it takes in symbols and doesn't come out with error"){
    val result = cipher.returnString("!£$%^^^^")
    assert(result == "!£$%^^^^")
  }

}
