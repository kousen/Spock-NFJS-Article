package mjg.tos

import spock.lang.Shared;
import spock.lang.Specification;

import static spock.util.matcher.HamcrestMatchers.closeTo

class LibraryComputerSpec extends Specification {
	@Shared LibraryComputer computer
	
	def setupSpec() { 
		computer = new LibraryComputer() 
		computer.start()
	}
	
	def "compute to the last decimal the value of PI"() {
		expect: 
		3.14159265 closeTo(computer.computePi(), 0.0001)
	}
	
	def "in the 60's, TV thought computers made typewriter noises"() {
		expect: 
		computer.makeTypewriterNoises() is("clickity-clickity-click")
	}
	
	def cleanupSpec() {
		computer?.stop()
	}
}
