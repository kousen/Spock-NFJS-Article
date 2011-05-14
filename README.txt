Source code for article "Spock: I Have Been, and Always Shall Be,
Your Friendly Testing Framework", appearing in the June 2011 issue
of NFJS the Magazine (http://www.nofluffjuststuff.com/home/magazine_subscribe).

A gradle build file is provided. If you don't have gradle installed,
use the provided wrapper (i.e., type "./gradlew build") and the 
script will download and install gradle and run all the tests.

> gradle build -> download dependencies, build, and run all tests
	then load build/reports/tests/index.html in browser
	
> gradlew build -> download and install gradle 1.0-milestone-3 and build

> gradle eclipse -> generate Eclipse project files

Ken Kousen
ken.kousen@kousenit.com
June, 2011