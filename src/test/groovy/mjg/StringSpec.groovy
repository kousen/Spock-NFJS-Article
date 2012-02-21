package mjg

import spock.lang.FailsWith;
import spock.lang.Specification;

class StringSpec extends Specification {
    String llap = "Live Long and Prosper"
    
    def "LLaP has 21 characters"() {
        expect: llap.size() == 21
    }
    
    def "LLaP has 4 words"() {
        expect: llap.split(/\W/).size() == 4
    }
    
    def "LLaP has 6 vowels"() {
        expect:
        llap.findAll(/[aeiou]/).size() == 6
    }
	
    def "Access inside the string doesn't throw an exception"() {
        when:
        llap[0..<llap.size()]  // forward
        llap[-1..-llap.size()] // backward

        then:
        notThrown(IndexOutOfBoundsException)
    }

	@FailsWith(IndexOutOfBoundsException)
    def "Access before the start of the string throws exception"() {
        expect:
        llap[-llap.size() -1]        
    }

	def "Access beyond the end of the string throws exception"() {
		when:
        llap[llap.size()]
        
		then:
		IndexOutOfBoundsException e = thrown()
        assert e.message == 'String index out of range: 22'
	}

}
