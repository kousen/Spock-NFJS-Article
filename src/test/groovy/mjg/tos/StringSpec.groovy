package mjg.tos

import spock.lang.Specification;

class StringSpec extends Specification {
    String s
    
    def setup() {
        s = "Live Long and Prosper"
    }
    
    def "LLaP has 21 characters"() {
        expect: s.size() == 21
    }
    
    def "LLaP has 4 words"() {
        expect: s.split(/\W/).size() == 4
    }
    
    def "LLaP has 6 vowels"() {
        expect:
        s.findAll(/[aeiou]/).size() == 6
    }
	
	def "Access inside the string doesn't throw an exception"() {
		when:
		s.charAt(s.size() - 1)
		then:
		notThrown(IndexOutOfBoundsException)
	}

	def "Access beyond the end of the string throws exception"() {
		when:
		s.charAt(s.size() + 1)
		then:
		thrown(IndexOutOfBoundsException)
	}
}
