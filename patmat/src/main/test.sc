
def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  (xs foldRight List[U]())( (x, l) => f(x)::l )

mapFun[Int, Int](List(1, 2, 3, 4), x => x + 1)


def lengthFun[T](xs: List[T]): Int =
  (xs foldRight 0)((_, prev) => prev + 1)


lengthFun(List(1, 2, 3, 4))