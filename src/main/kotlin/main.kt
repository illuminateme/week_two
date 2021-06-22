fun main() {
    val a = 8
    val b = 20
    val text = "Test"

// If statements

//1
    if (a > b) {
        println("a is greater than b")
    } else {
        println("This isn't a valid statement")
    }

//2
    if (a > b) {
        println("$a is greater than $b")
    } else {
        println("$b is greater than $a")
    }

//3

    if (a > b) {
        println("$a is greater than $b - This is another way to concatenate ")
    } else if (a < b) {
        println("$b is greater than $a - This is another way to concatenate ")
    } else {
        println("$b is equal to $a - This is another way to concatenate ")
    }

//4

    if (a * b > 7)
        println("multiplication of $a and $b is greater than 7 - No 4 If Statement" )

//5

    if (a * b > a / b)
        println("a * b is greater than a / b - No 5")
    else println("a * b is not greater than a / b - No 5")

//6

    if ((a*b) > b)
        println("Your interest rate is compounding by 2%")

//7

    if ( (a % b) == 2/8 && (a - b) == 0)
        println("Does this code make sense to you? - No 7")
    else println("I love kotlin - No 7")

// 8
    if (text.length < 5)
        println("Text length is less than 5")
        else println("Text length is greater than 5")

//9
    if (text.length <= a * b)
        println("I will be an excellent programmer")
        else println("Programming is the best skill anyone can have")

//10
    if (text.length < 5 && a in 2..6)
        println("This is just a test")
    else println("I know this is just a test")

//Conditional expressions using when

//1
    when (text.length){
        12 -> println("Have a nice day")
        else -> print("today is a good day")
    }
//2
    when (a * b) {
        13,  -> println("I am having fun")
         5 -> println("This is great!")
    }

//3
    when (a % b){
        0 -> print("Trying to understand the when keyword")
    }

//4
    when {
        a > b -> {
            println("$a is greater than $b - This is another way to concatenate ")
        }
        a < b -> {
            println("$b is greater than $a - This is another way to concatenate ")
        }
        else -> {
            println("$b is equal to $a - This is another way to concatenate ")
        }
    }


//5

    when (a / b) {
        13,  -> println("I am having fun")
        5 -> println("This is great!")
    }

// This is the second task

// 2a

    println("Task 2a starts from here")

    for (numberOneToHundred: Int in 1..100) {
        println(numberOneToHundred)
    }

//2b
    println("Task 2b starts from here")

    for (numbersOneToTen: Int in 1..10) {
        if (numbersOneToTen == 4 || numbersOneToTen == 5) {
            continue
        } else {
            println(numbersOneToTen)
        }
    }

//3
    println("Task 3 starts from here")

    for (i in 11..30) {
        if (i % 2 == 0 && i < 20) {
            println(i)
        } else if (i % 2 != 0 && i > 20) {
            println(i)
        } else {
            continue
        }
    }
    println("Task 4 & 5 starts from here")

    //print class 1
    StaffOfDsih()

    //print class 2
    val students = StudentsOfDsih()
    println("${students.name} | ${students.trackChoice} | ${students.lga} | ${students.gender} | ${students.testScore} ")

    //print class 3
    TrainersOfYep()

    //print class 4
    Nimc()

    //print class 5
    val nigerianStates = StatesInNigeria()
    println(
        "${nigerianStates.capital} is the capital of ${nigerianStates.state} State. " +
                "She has a population of ${nigerianStates.populationSize}band was created " +
                "in ${nigerianStates.dateOfCreation}. The Governor is ${nigerianStates.governorsName}"
    )
}

//4 & 5

//Class 1

class StaffOfDsih(
    _name: String = "Ada", _age: Int = 35, _gender: String = "Female",
    _dateOfEmployment: Int = 2015, _gradeLevel: Int = 11
) {
    var name = _name
    var age = _age
    var gender = _gender
    var dateOfEmployment = _dateOfEmployment
    var gradeLevel = _gradeLevel

    init {
        println("$name | $age | $gender | $dateOfEmployment | $gradeLevel")
    }
}

//Class 2

class StudentsOfDsih(
    _name: String = "Akpor", _lga: String = "Ethiope East", _gender: String = "Male", _trackChoice: String = "Mobile",
    _testScore: Int = 90
) {
    var name = _name
    var lga = _lga
    var gender = _gender
    var trackChoice = _trackChoice
    var testScore = _testScore


}

//Class 3

class TrainersOfYep {
    var name = "John Mote"
    var trainingTrack = "Mobile"
    var classAssignedTo = 'A'
    var attendance = "Punctual"
    var monthlyPay = 250000

/*  constructor (_name: String, _trainingTrack: String, _classAssignedTo: Char, _attendance: String, _monthlyPay: Int) {
        this.name = _name
        this.trainingTrack = _trainingTrack
        this.classAssignedTo = _classAssignedTo
        this.attendance = _attendance
        this.monthlyPay = _monthlyPay

    }

    constructor(_name: String, _trainingTrack: String, _classAssignedTo: Char) {
        this.name = _name
        this.trainingTrack = _trainingTrack
        this.classAssignedTo = _classAssignedTo
    }
**/

    init {
        println("$name, $trainingTrack, $classAssignedTo, $attendance, $monthlyPay")
    }
}

// Class 4

class Nimc(
    _firstName: String = "Kessiena",
    _lastName: String = "Jordan",
    _dOfB: Int = 1987,
    _address: String = "Asaba",
    _phoneNumber: Long = 23480445588854
) {

    var firstName = _firstName
    var lastName = _lastName
    var dOfB = _dOfB
    var address = _address
    var phoneNumber = _phoneNumber

    init {
        println("$firstName | $lastName | $dOfB | $address | $phoneNumber")
    }

}

// Class 5


class StatesInNigeria(
    _states: String = "Delta",
    _capital: String = "Asaba",
    _dateOfCreation: Int = 1990,
    _governorsName: String = "Okowa",
    _populationSize: Int = 1300000
) {

    var state = _states
    var capital = _capital
    var dateOfCreation = _dateOfCreation
    var governorsName = _governorsName
    var populationSize = _populationSize

}







