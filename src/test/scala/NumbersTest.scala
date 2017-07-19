/**
  * Created by Administrator on 18/07/2017.
  */
import org.scalatest.FunSuite


class NumbersTest extends FunSuite{
  val number:Numbers = new Numbers

  test("test the english map exists"){
    val result = number.english.size
    assert(result>0)
  }

  test("test the long map exists"){
    val result = number.long.size
    assert(result>0)
  }

  test("check for nothing long"){
    val result = number.toLongWord2("789")
    assert(result == "789")
  }
  test("check for nothing short"){
    val result = number.toShortWord2("789")
    assert(result == "789")
  }

  test("check for thousands long"){
    val result = number.toLongWord2("123789")
    assert(result =="123thousand and 789")
  }

  test("check for thousands short"){
    val result = number.toShortWord2("123789")
    assert(result =="123thousand and 789")
  }

  test("check for millions and zeros long"){
    val result = number.toLongWord2("67003890")
    println(result)
    assert(result == "67million 3thousand and 890")
  }
  test("check for millions and zeros short"){
    val result = number.toShortWord2("67003890")
    println(result)
    assert(result == "67million 3thousand and 890")
  }

  test("Check for billions long"){
    val result = number.toLongWord2("1123786002")
    assert(result == "1milliard 123million 786thousand and 2")
  }

  test("Check for billions short"){
    val result2 = number.toShortWord2("1123786002")
    assert(result2 == "1billion 123million 786thousand and 2")
  }


  test("Check for trillion long"){
    val result = number.toLongWord2("6456123789678")
    assert(result == "6billion 456milliard 123million 789thousand and 678")
  }

  test("Check for trillion short"){
    val result2 = number.toShortWord2("6456123789678")
    assert(result2 == "6trillion 456billion 123million 789thousand and 678")
  }

  test("Check for quadrillion long"){
    val result = number.toLongWord2("9786456123789678")
    assert(result == "9billiard 786billion 456milliard 123million 789thousand and 678")
  }

  test("Check for quadrillion short"){
    val result2 = number.toShortWord2("9786456123789678")
    assert(result2 == "9quadrillion 786trillion 456billion 123million 789thousand and 678")
  }

  test("Check for quintillion long"){
    val result = number.toLongWord2("6669786456123789678")
    assert(result == "6trillion 669billiard 786billion 456milliard 123million 789thousand and 678")
  }

  test("Check for quintillion short"){
    val result2 = number.toShortWord2("6669786456123789678")
    assert(result2 == "6quintillion 669quadrillion 786trillion 456billion 123million 789thousand and 678")
  }

}
