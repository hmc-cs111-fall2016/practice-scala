package exercises

import org.scalatest._

class PalindromeTest extends FunSuite with Matchers {
  
  test("") {
    Palindrome.isPalindrome("") should be (true)
  }
  
  test("123") {
    Palindrome.isPalindrome("123") should be (true) // because we'll ignore non-alphabetic characters
  }
  
  test("arbitrary"){
    Palindrome.isPalindrome("asdfasdfadshior29=t2p9hhighio") should be (false)
  }
  
  test("civic") {
    Palindrome.isPalindrome("civic") should be (true)
  }

  test("banana") {
    Palindrome.isPalindrome("banana") should be (false)
  }
  
  test("sit on a potato pan, otis") {
    Palindrome.isPalindrome("sit on a potato pan, otis") should be (true)
  }
  
  test("Was it a car or a cat I saw?") {
    Palindrome.isPalindrome("Was it a car or a cat I saw?") should be (true)
  }
  
  test("drab as a fool as aloof as a bard") {
    Palindrome.isPalindrome("drab as a fool as aloof as a bard") should be (true)
  }
  
  test("Yawn a more Roman way.") {
    Palindrome.isPalindrome("Yawn a more Roman way.") should be (true)
  }
  
  test("Dennis … sinned") {
    Palindrome.isPalindrome("Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel and Ellen sinned. Ban campus motto: \"Bottoms up, MacNab\". Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel and Ellen sinned.") should be (true)
  }
  
  test("Long panama") {
    Palindrome.isPalindrome("A man, a plan, a canoe, pasta, heros, rajahs, a coloratura, maps, snipe, percale, macaroni, a gag, a banana bag, a tan, a tag, a banana bag again (or a camel), a crepe, pins, Spam, a rut, a Rolo, cash, a jar, sore hats, a peon, a canal; Panama!") should be (true)
  }
  
}