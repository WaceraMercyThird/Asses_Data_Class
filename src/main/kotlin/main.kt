fun main() {
    var bank = CurrentAccount("MY7U7974663", "James Andrews", 90.7)
    var savings = SavingsAccount("MY7U7974663", "James Andrews", 90.7, 100)
    var cart = Product("Jane Doe",45.5,400,"groceries")


    //class of CurrentAccount
    bank.deposit(89.7)
    bank.withdrawal(40.0)
    bank.details()

    // class of SavingsAccount
    savings.withdrawal(4.00)

    //data class 0f product
    cart.market("Colgate")

    var cap =nameStringChar("banana")
    print(cap[0])
    print(cap[2])
    print(cap[4])
}

open class CurrentAccount(var accountnumber: String, var accountname: String, var balance: Double) {
    fun deposit(amount: Double) {
        var currentTotal = balance + amount
        println(currentTotal)
    }

    open fun withdrawal(amount: Double) {
        var totalBalance = balance - amount
        println(totalBalance)
    }

    fun details() {
        var x = accountnumber
        var y = balance
        var z = accountname
        println("Account number $x with balance $y is operated by $z")
    }
}
class SavingsAccount(accountnumber: String, accountname: String, balance: Double, var withdrawals: Int) :
    CurrentAccount(accountnumber, accountname, balance) {

    override fun withdrawal(amount: Double) {
        super.withdrawal(amount)
        var counter = amount % 12
        if (counter <= 4) {
            println("True")
        } else println("False")
    }

}
data class Product(var name:String, var weight:Double, var price:Int, var category:String){
    fun market(product:String){
        if ("colgate"== "groceries"){
            println("We use Colgate")
        }    else{
            println("We don't have colgate")
        }
    }
}
//Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
//“bnn”
  fun nameStringChar(person:String): String{
    var letter = person
      return letter
  }