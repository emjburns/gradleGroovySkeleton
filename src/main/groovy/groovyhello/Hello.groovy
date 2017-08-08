package groovyhello


import org.joda.time.LocalTime

class Hello {
	public static void main(String[] args){
		def curTime = new LocalTime()
		println "Time is " + curTime

		def greeter = new GroovyGreeter()
		println greeter.greet()

	}
} 