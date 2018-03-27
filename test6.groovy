def sayHello(name) {
        println("Hello $name!")
}

def names = ["SintSi", "Kaitlyn", "Keira"]

for (name in names) {
    sayHello(name)
}

 // A String is nothing but a sequence of characters.
def hello = "Hello"
for(aChar in hello){
    println aChar
}



// Even a File Object can be iterated in Groovy.
String thisFileName = "Loop.txt"
println ("File to be processed  $thisFileName")
thisFile = new File(thisFileName)
for(aLine in thisFile){
    println aLine
}

