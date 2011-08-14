package mjg.tos

class Tribble {
    
    String react(Klingon klingon) {
        println klingon.annoy()
        "wheep! wheep!" 
    }
	
    String react(Vulcan vulcan) {
        vulcan.soothe()
        "purr, purr" 
    }
    
    def feed() {
        def tribbles = [this]
        10.times { tribbles << new Tribble() }
        return tribbles
    }
}
