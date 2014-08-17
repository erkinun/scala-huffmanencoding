package patmat

import Huffman._

object home5 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val chars = "aabbekiiiin".toList                //> chars  : List[Char] = List(a, a, b, b, e, k, i, i, i, i, i, n)
  times(chars)                                    //> exiting now
                                                  //| res0: List[(Char, Int)] = List((a,2), (b,2), (e,1), (k,1), (i,5), (n,1))
  
  
  val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
                                                  //> leaflist  : List[patmat.Huffman.Leaf] = List(Leaf(e,1), Leaf(t,2), Leaf(x,4)
                                                  //| )
  
  combine(leaflist)                               //> res1: List[patmat.Huffman.CodeTree] = List(Fork(Leaf(e,1),Leaf(t,2),List(e, 
                                                  //| t),3), Leaf(x,4))
                                                  
 	until(singleton, combine)(leaflist)       //> res2: List[patmat.Huffman.CodeTree] = List(Fork(Fork(Leaf(e,1),Leaf(t,2),Lis
                                                  //| t(e, t),3),Leaf(x,4),List(e, t, x),7))
 	
 	
 	createCodeTree("ibrahim".toList)          //> exiting now
                                                  //| res3: patmat.Huffman.CodeTree = Fork(Fork(Fork(Fork(Fork(Leaf(b,1),Leaf(r,1)
                                                  //| ,List(b, r),2),Leaf(a,1),List(b, r, a),3),Leaf(h,1),List(b, r, a, h),4),Leaf
                                                  //| (m,1),List(b, r, a, h, m),5),Leaf(i,2),List(b, r, a, h, m, i),7)
 	
 	
 	decode(frenchCode, secret)                //> res4: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
 	
 	val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
                                                  //> t1  : patmat.Huffman.Fork = Fork(Leaf(a,2),Leaf(b,3),List(a, b),5)
 	
 	encode(t1)("ab".toList)                   //> res5: List[patmat.Huffman.Bit] = List(0, 1)
 	quickEncode(t1)("ab".toList)              //> res6: List[patmat.Huffman.Bit] = List(0, 1)
                                  
  decode(t1, List(0,1))                           //> res7: List[Char] = List(a, b)
  
  println("noluyr")
 
 	
}