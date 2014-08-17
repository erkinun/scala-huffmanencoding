package patmat

import Huffman._

object home5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  println("Welcome to the Scala worksheet");$skip(36); 
  val chars = "aabbekiiiiin".toList;System.out.println("""chars  : List[Char] = """ + $show(chars ));$skip(15); val res$0 = 
  times(chars);System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0));$skip(70); 
  
  
  val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4));System.out.println("""leaflist  : List[patmat.Huffman.Leaf] = """ + $show(leaflist ));$skip(23); val res$1 = 
  
  combine(leaflist);System.out.println("""res1: List[patmat.Huffman.CodeTree] = """ + $show(res$1));$skip(89); val res$2 = 
                                                  
 	until(singleton, combine)(leaflist);System.out.println("""res2: List[patmat.Huffman.CodeTree] = """ + $show(res$2));$skip(41); val res$3 = 
 	
 	
 	createCodeTree("ibrahim".toList);System.out.println("""res3: patmat.Huffman.CodeTree = """ + $show(res$3));$skip(35); val res$4 = 
 	
 	
 	decode(frenchCode, secret);System.out.println("""res4: List[Char] = """ + $show(res$4));$skip(63); 
 	
 	val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5);System.out.println("""t1  : patmat.Huffman.Fork = """ + $show(t1 ));$skip(29); val res$5 = 
 	
 	encode(t1)("ab".toList);System.out.println("""res5: List[patmat.Huffman.Bit] = """ + $show(res$5));$skip(31); val res$6 = 
 	quickEncode(t1)("ab".toList);System.out.println("""res6: List[patmat.Huffman.Bit] = """ + $show(res$6));$skip(59); val res$7 = 
                                  
  decode(t1, List(0,1));System.out.println("""res7: List[Char] = """ + $show(res$7))}
 
 	
}
