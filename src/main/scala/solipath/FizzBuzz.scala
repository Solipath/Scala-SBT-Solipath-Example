package solipath

class FizzBuzz {

    def execute(input: Int): String = {
        var returnString = "";
        if (isDivibleBy3(input)) {
            returnString += "Fizz";
        }
        if (isDivisibleBy5(input)) {
            returnString += "Buzz";
        }
        if (returnString.isBlank()) {
            returnString = Integer.toString(input);
        }
        return returnString;
    }

    private def isDivisibleBy5(input: Int): Boolean = {
        return input % 5 == 0;
    }

    private def isDivibleBy3(input: Int): Boolean = {
        return input % 3 == 0;
    }

}
