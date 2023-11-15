@main
def main(): Unit = {
  println("Hello world!")
  println("Zadanie 3:")
  println(sumProd(List(1, 2, 3, 4, 5)))
}

/*
Zadanie 1:
let f1 x = x 2 2;
  f1 to funkcja przyjmująca funkcję x i zwracająca wynik jej wywołania z argumentami 2 i 2
  Funkcja x przyjmuje dwa paremtry o typie int, ale może zwracać dowolny typ, więc f1 może zwracać dowolny typ, jej typ to `a (polimorficzny)
let f2 x y z = x ( y ^ z );
  f2 to funkcja przyjmująca funkcję x i argumenty y i z, zwracająca wynik wywołania x z argumentem (y ^ z)
  (y ^ z) łączy dwa stringi (konkatenacja), czyli x musi przyjmować typ string, a zwracać może dowolny typ, więc f2 może zwracać dowolny typ, jej typ to `a (polimorficzny)
*/

//Zadanie 3:
def sumProd(list: List[Int]): (Int, Int) = {
  list.foldLeft((0, 1)) {
    case ((sum, product), x) => (sum + x, product * x)
  }
}