package mjg

class PalindromeChecker {
    boolean isPalindrome(String s) {
        String testString = s.replaceAll(/[ ,\'!?]/,'').toLowerCase()
        return testString.reverse() == testString
    }
}
