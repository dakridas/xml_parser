#TODO change
all: 
	javac -d . Namespace.java Attribute.java DocumentBuilder.java Document.java Node.java
	javac Main.java
	java Main
clean:
	rm gr/uth/inf/ce325/xml_parser/*.class
	rm *.class
