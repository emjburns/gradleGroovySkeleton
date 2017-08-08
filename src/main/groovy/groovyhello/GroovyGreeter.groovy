package groovyhello

class GroovyGreeter {
	String greet(String name){
		"Hello ${name ?: 'stranger'}. Greetings from Groovy"
	}
}