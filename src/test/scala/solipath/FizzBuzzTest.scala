package solipath

class FizzBuzzTest extends munit.FunSuite {
    test("given 3 then return Fizz") {
        assertEquals("Fizz", FizzBuzz().execute(3))
    }
    test("given 5 then return Buzz") {
        assertEquals("Buzz", FizzBuzz().execute(5))
    }
    test("given 6 then return Fizz") {
        assertEquals("Fizz", FizzBuzz().execute(6))
    }
    test("given 2 then return 2") {
        assertEquals("2", FizzBuzz().execute(2))
    }
    test("given 1 then return 1") {
        assertEquals("1", FizzBuzz().execute(1))
    }
    test("given 10 then return Buzz") {
        assertEquals("Buzz", FizzBuzz().execute(10))
    }
    test("given 15 then return FizzBuzz") {
        assertEquals("FizzBuzz", FizzBuzz().execute(15))
    }
    test("given 30 then return FizzBuzz") {
        assertEquals("FizzBuzz", FizzBuzz().execute(30))
    }
}
