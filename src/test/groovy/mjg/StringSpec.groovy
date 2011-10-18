package mjg

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
        s[0..<s.size()]  // forward
        s[-1..-s.size()] // backward

        then:
        notThrown(IndexOutOfBoundsException)
    }

    def "Access before the start of the string throws exception"() {
        when:
        s[-s.size() -1]
        
        then:
        def e = thrown(IndexOutOfBoundsException)
    }

	def "Access beyond the end of the string throws exception"() {
		when:
        s[s.size()]
        
		then:
		IndexOutOfBoundsException e = thrown()
        assert e.message == 'String index out of range: 22'
	}

}
